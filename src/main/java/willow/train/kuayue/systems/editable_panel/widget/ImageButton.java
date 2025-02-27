package willow.train.kuayue.systems.editable_panel.widget;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import kasuga.lib.core.client.render.SimpleColor;
import kasuga.lib.core.client.render.texture.ImageMask;
import kasuga.lib.core.client.render.texture.Vec2f;
import kasuga.lib.core.util.LazyRecomputable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ImageButton extends Button {
    private final LazyRecomputable<ImageMask> mask, bg;
    private TooltipLabel tooltip;
    private int showTooltip = 0;
    private OnClick<ImageButton> clk;
    private boolean isMouseDown;
    private boolean renderMask;
    public static final ImageButton.ImageAction baseAction = (img, btn) -> img.rectangle(new Vector3f(btn.getX(), btn.getY(), 0),
            ImageMask.Axis.X, ImageMask.Axis.Y, true, true, btn.getWidth(), btn.getHeight());

    public ImageButton(LazyRecomputable<ImageMask> mask, LazyRecomputable<ImageMask> bg, int x, int y,
                       int width, int height, Component tooltip, OnPress press) {
        super(0, 0, width, height, tooltip, press);
        this.mask = mask;
        this.bg = bg;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.tooltip = new TooltipLabel(new Vec2f(this.x, this.y + this.height + 2), tooltip);
        controlImage(baseAction);
        controlBg(baseAction);
        this.clk = (a, b, c) -> {};
        renderMask = true;
    }

    public ImageButton(LazyRecomputable<ImageMask> mask, int x, int y, int width, int height, Component tooltip, OnPress press) {
        super(0, 0, width, height, tooltip, press);
        this.mask = mask;
        this.bg = null;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.tooltip = new TooltipLabel(new Vec2f(this.x, this.y + this.height + 2), tooltip);
        controlImage(baseAction);
        renderMask = true;
    }

    public boolean isRenderMask() {
        return renderMask;
    }

    public void setRenderMask(boolean renderMask) {
        this.renderMask = renderMask;
    }

    public void setX(int x) {
        this.x = x;
        if (mask != null){
            int leftTopX1 = (int) mask.get().getLeftTop().x();
            mask.get().offset(x - leftTopX1, 0, 0);
        }
        if (bg != null) {
            int leftTopX2 = (int) bg.get().getLeftTop().x();
            bg.get().offset(x - leftTopX2, 0, 0);
        }
    }

    public void setY(int y) {
        this.y = y;
        if (mask != null){
            int leftTopY1 = (int) mask.get().getLeftTop().y();
            mask.get().offset(0, y - leftTopY1, 0);
        }
        if (bg != null) {
            int leftTopY2 = (int) bg.get().getLeftTop().y();
            bg.get().offset(0, y - leftTopY2, 0);
        }
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
        if (mask != null){
            int leftTopX1 = (int) mask.get().getLeftTop().x();
            int leftTopY1 = (int) mask.get().getLeftTop().y();
            mask.get().offset(x - leftTopX1, y - leftTopY1, 0);
        }
        if (bg != null) {
            int leftTopX2 = (int) bg.get().getLeftTop().x();
            int leftTopY2 = (int) bg.get().getLeftTop().y();
            bg.get().offset(x - leftTopX2, y - leftTopY2, 0);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setMaskColor(SimpleColor color) {
        this.mask.get().setColor(color);
    }
    public void setBgColor(SimpleColor color) {this.mask.get().setColor(color);}
    public void controlImage(ImageAction action) {
        if (mask != null && mask.get() != null) action.act(this.mask.get(), this);
    }
    public void controlBg(ImageAction action) {
        if (bg != null && bg.get() != null) action.act(this.bg.get(), this);
    }

    public void setTooltipLabelWidth(int width) {
        this.tooltip.setWidth(width);
        this.tooltip.setPosition(new Vec2f(this.x + (float) (this.width - width) / 2, this.y + this.height + 2));
    }

    public void dynamicTooltipLabelWidth() {
        setTooltipLabelWidth(Minecraft.getInstance().font.width(tooltip.getText().getString()) + 4);
    }
    public void setTooltipLabelPos(Vec2f pos) {
        this.tooltip.setPosition(pos);
    }

    public TooltipLabel getTooltipLabel() {
        return tooltip;
    }

    @Override
    public void renderButton(PoseStack pPoseStack, int mouseX, int mouseY, float partialTicks) {
        if (!visible) return;
        if (bg != null) bg.get().renderToGui();
        if (isHovered) {
            if (showTooltip > 40) tooltip.render(pPoseStack, mouseX, mouseY, partialTicks);
            else showTooltip ++;
        } else if (showTooltip > 0) showTooltip --;
        if (renderMask && mask != null)
            this.mask.get().renderToGui();
    }

    public void renderOnlyOnClicked(PoseStack poseStack, int mouseX, int mouseY, float partial) {
        if (!visible) return;
        if (isHovered) {
            if (showTooltip > 40) tooltip.render(poseStack, mouseX, mouseY, partial);
            else showTooltip ++;
        } else if (showTooltip > 0) showTooltip --;
        if (clicked(mouseX, mouseY) && isMouseDown) this.mask.get().renderToGui();
    }

    public void setOnClick(OnClick<ImageButton> clk) {
        this.clk = clk;
    }

    @Override
    public void onClick(double pMouseX, double pMouseY) {
        onPress();
        if (this.clk == null) return;
        this.clk.click(this, pMouseX, pMouseY);
    }

    @Override
    public boolean mouseClicked(double pMouseX, double pMouseY, int pButton) {
        isMouseDown = true;
        return super.mouseClicked(pMouseX, pMouseY, pButton);
    }

    @Override
    public boolean mouseReleased(double pMouseX, double pMouseY, int pButton) {
        isMouseDown = false;
        return super.mouseReleased(pMouseX, pMouseY, pButton);
    }

    @Override
    public boolean keyPressed(int pKeyCode, int pScanCode, int pModifiers) {
        return false;
    }

    public interface ImageAction {
        void act(ImageMask mask, ImageButton button);
    }
}
