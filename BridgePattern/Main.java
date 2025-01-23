package BridgePattern;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(new BlueColor(), 10);
        Shape rectangle = new Rectangle(new RedColor(), 20, 30);
        circle.draw();
        rectangle.draw();
    }
}
