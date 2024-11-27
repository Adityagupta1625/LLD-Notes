package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    List<Memento> history = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            Memento lastMemento = history.get(history.size() - 1);

            history.remove(lastMemento);
            return lastMemento;
        }
        return null;
    }
}
