package BridgePattern;

public class Rectangle extends Shape {

    private int length;
    private int breadth;

    public Rectangle(Color color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with length " + length + " and breadth " + breadth);
        this.applyColor();
    }
}
