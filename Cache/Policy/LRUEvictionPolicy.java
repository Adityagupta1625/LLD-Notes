package Cache.Policy;

import java.util.HashMap;
import java.util.Map;

import Cache.Algorithms.DoublyLinkedList;
import Cache.Algorithms.DoublyLinkedListNode;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {

    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode<Key>> mapper;

    public LRUEvictionPolicy() {
        this.dll = new DoublyLinkedList<Key>();
        this.mapper = new HashMap<Key, DoublyLinkedListNode<Key>>();
    }

    @Override
    public Key evict() {
        DoublyLinkedListNode<Key> node = dll.getFirstNode();
        dll.removeNode(node);
        mapper.remove(node.getElement());
        return node.getElement();
    }

    @Override
    public void keyAccessed(Key key) {
        if (mapper.containsKey(key)) {
            dll.removeNode(mapper.get(key));
        }
        dll.addNodeAtLast(key);
        mapper.put(key, dll.getLastNode());
    }
}
