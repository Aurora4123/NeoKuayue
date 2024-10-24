package willow.train.kuayue.block.panels.block_entity.renderer;

import com.jozufozu.flywheel.core.PartialModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import com.simibubi.create.foundation.utility.Couple;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import willow.train.kuayue.block.panels.block_entity.SingleSlidingDoorEntity;

public class SingleSlidingDoorRenderer implements BlockEntityRenderer<SingleSlidingDoorEntity> {

    public static float STEP = 0.025f;

    public SingleSlidingDoorRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(SingleSlidingDoorEntity pBlockEntity,
                       float pPartialTick, PoseStack pose,
                       MultiBufferSource pBufferSource, int pPackedLight, int pPackedOverlay) {
        //获取方块实体状态
        BlockState blockState = pBlockEntity.getBlockState();
        //获取门是否开闭的布尔值
        boolean isOpened = pBlockEntity.isOpen();
        //获取门建模Couple
        Couple<PartialModel> doorModels = pBlockEntity.getModels();

        if(doorModels == null) return;

        //获取门的两部分建模
        PartialModel left = doorModels.get(true);
        PartialModel frame = pBlockEntity.getFrameModel();

        float f = -blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite().toYRot() - 90;

        SuperByteBuffer leftBuffer =
                left == null ? null :
                        CachedBufferer.partial(left, blockState).light(pPackedLight);

        pose.pushPose();

        pose.translate(0.5f, -1f, 0.5f);
        //根据角色朝向旋转建模
        pose.mulPose(Axis.YP.rotationDegrees(f + 90f));

        //调整门框参数
        if (frame != null) {
            //将门框抬高一格渲染
            pose.translate(-0.5f, 1f, -0.5f);
            SuperByteBuffer frameBuffer = CachedBufferer.partial(frame, blockState).light(pPackedLight);
            frameBuffer.renderInto(pose, pBufferSource.getBuffer(RenderType.cutout()));
            pose.translate(0.5f, -1f, 0.5f);
        }

        pose.translate(0, 1, 0);
        //调整门静态参数
        if (leftBuffer != null)
            leftBuffer.translate(-0.5f, 0, -0.5f);

        //如果门开启且counter小于1
        if(isOpened && pBlockEntity.counter < 0.89f) {
            //没有开启到位则一直累加counter，每次0.025f
            pBlockEntity.counter += STEP;
        } else if (!isOpened && pBlockEntity.counter > 0.01f) {
            //没有关闭到位则一直累减counter，每次0.025f
            pBlockEntity.counter -= STEP;
        } else if (isOpened) {
            //如果门开启到位
            pBlockEntity.counter = 0.9f;
        } else {
            //如果门关闭到位
            pBlockEntity.counter = 0f;
        }
        float offset = ((float) Math.cos((pBlockEntity.counter + 1) * Math.PI) + 1f) * .4f;

        // 门的滑动渲染，通过counter设置门偏移量。
        if (leftBuffer != null)
            leftBuffer.translate(offset, 0, 0);

        //渲染门
        if (leftBuffer != null)
            leftBuffer.renderInto(pose, pBufferSource.getBuffer(RenderType.cutout()));

        pose.popPose();
    }

    @Override
    public boolean shouldRenderOffScreen(SingleSlidingDoorEntity pBlockEntity) {
        return true;
    }
}
