package willow.train.kuayue.initial.panel;

import com.simibubi.create.foundation.utility.Couple;
import kasuga.lib.registrations.common.BlockReg;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.Vec3;
import willow.train.kuayue.block.panels.FullShapeDirectionalBlock;
import willow.train.kuayue.block.panels.door.CustomRenderedDoorBlock;
import willow.train.kuayue.block.panels.slab.CarportHingeSlabBlock;
import willow.train.kuayue.block.panels.slab.HeightSlabBlock;
import willow.train.kuayue.block.panels.slab.HingeSlabBlock;
import willow.train.kuayue.block.panels.slab.TrainSlabBlock;
import willow.train.kuayue.initial.AllElements;
import willow.train.kuayue.initial.registration.PanelRegistration;
import willow.train.kuayue.initial.registration.SlabRegistration;

public class I21Panel {

    public static final BlockReg<FullShapeDirectionalBlock> HEAD_DF21 =
            new BlockReg<FullShapeDirectionalBlock>("head_df21")
                    .blockType(FullShapeDirectionalBlock::new)
                    .material(Material.METAL).materialColor(MaterialColor.COLOR_BLACK)
                    .addProperty(BlockBehaviour.Properties::noOcclusion)
                    .defaultBlockItem()
                    .tabTo(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<CarportHingeSlabBlock> EXHAUST_FAN_DF21 =
            new SlabRegistration<CarportHingeSlabBlock>("exhaust_fan_df21")
                    .block(p -> new CarportHingeSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_RED)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion()
                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<CarportHingeSlabBlock> DYNAMIC_CARPORT_DF21 =
            new SlabRegistration<CarportHingeSlabBlock>("dynamic_carport_df21")
                    .block(p -> new CarportHingeSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion()
                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<CarportHingeSlabBlock> DYNAMIC_TRANSITION_CARPORT_DF21 =
            new SlabRegistration<CarportHingeSlabBlock>("dynamic_transition_carport_df21")
                    .block(p -> new CarportHingeSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion()
                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<TrainSlabBlock> GENERAL_SLAB_DF21 =
            new SlabRegistration<TrainSlabBlock>("general_slab_df21")
                    .block(p -> new TrainSlabBlock(p, false))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_RED)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion()
                    .submit(AllElements.testRegistry);

/*    public static final PanelRegistration<CustomRenderedDoorBlock> DOOR_CABIN_DF21 =
            new PanelRegistration<CustomRenderedDoorBlock>("door_cabin_df21")
                    .block(p -> new CustomRenderedDoorBlock(p,
                            Couple.create(
                                    AllElements.testRegistry.asResource("df21/door/df21_cabin_door_upper_right"),
                                    AllElements.testRegistry.asResource("df21/door/df21_cabin_door_upper_right")
                            ), Couple.create(
                            AllElements.testRegistry.asResource("df21/door/df21_cabin_door_upper_right"),
                            AllElements.testRegistry.asResource("df21/door/df21_cabin_door_upper_right")
                    ), new Vec3(-.25, 0, 0), RenderShape.ENTITYBLOCK_ANIMATED, false
                    ))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .noOcclusion()
                    .tab(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);*/

    public static void invoke(){}
}