package MementoPattern;

public class Originator {

    int height;
    int width;

    public Originator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Memento createMemento() {
        return new Memento(height, width);
    }

    public void restoreMemento(Memento memento) {
        height = memento.getHeight();
        width = memento.getWidth();
    }
}
