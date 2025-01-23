package BridgePattern;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public void applyColor() {
        color.applyColor();
    }
}
