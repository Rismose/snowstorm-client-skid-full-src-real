package today.snowstorm.client.module.visuals.clickgui.sub.components;


import today.snowstorm.client.utils.other.HoverUtils;

public abstract class Component {

    public float x, y, origX, origY, origWidth, origHeight, width, height;
    public boolean visible, focused;

    public Component(float x, float y, float width, float height, boolean visible) {
        this.x = x;
        this.y = y;
        this.origX = x;
        this.origY = y;
        this.width = width;
        this.height = height;
        this.origWidth = width;
        this.origHeight = height;
        this.visible = true;
    }

    public void setPosition(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void init() {}
    public void reset() {}
    public boolean isHovered(int mouseX, int mouseY) { return HoverUtils.isHovering(x, y, width, height, mouseX, mouseY); }
    public abstract void drawScreen(int mouseX, int mouseY);
    public abstract void mouseClicked(int mouseX, int mouseY, int mouseButton);
    public abstract void mouseReleased(int mouseX, int mouseY, int mouseButton);
    public abstract void keyTyped(char typedChar, int keyCode);

    public float origX() {
        return origX;
    }
    public void origX(float origX) {
        this.origX = origX;
    }
    public float origY() {
        return origY;
    }
    public void origY(float origY) {
        this.origY = origY;
    }
    public float x() {
        return x;
    }
    public void x(float x) {
        this.x = x;
    }
    public float y() {
        return y;
    }
    public void y(float y) {
        this.y = y;
    }
    public float width() {
        return width;
    }
    public void width(float width) {
        this.width = width;
    }
    public float height() {
        return height;
    }
    public void height(float height) {
        this.height = height;
    }
    public boolean focused() {
        return focused;
    }
    public void focused(boolean focused) {
        this.focused = focused;
    }
    public float origWidth() {
        return origWidth;
    }
    public void origWidth(float origWidth) {
        this.origWidth = origWidth;
    }
    public float origHeight() {
        return origHeight;
    }
    public void origHeight(float origHeight) {
        this.origHeight = origHeight;
    }
    public boolean visible() {
        return visible;
    }
    public void visible(boolean visible) {
        this.visible = visible;
    }
}
