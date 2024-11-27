package MementoPattern;

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator(5, 10);

        Memento snapshot1 = originator.createMemento();

        caretaker.addMemento(snapshot1);

        originator.setHeight(15);
        originator.setWidth(20);

        Memento snapshot2 = originator.createMemento();

        caretaker.addMemento(snapshot2);

        originator.setHeight(25);
        originator.setWidth(30);

        Memento restoreObject = caretaker.undo();
        originator.restoreMemento(restoreObject);

        System.out.println("Height: " + originator.height);
        System.out.println("Width: " + originator.width);

    }
}
