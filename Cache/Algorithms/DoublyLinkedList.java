package Cache.Algorithms;

public class DoublyLinkedList<E> {

    private DoublyLinkedListNode<E> head;
    private DoublyLinkedListNode<E> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addNodeAtLast(E element) {
        if (head == null) {
            head = new DoublyLinkedListNode<>(element);
            tail = head;
        } else {
            DoublyLinkedListNode<E> newNode = new DoublyLinkedListNode<>(element);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public DoublyLinkedListNode<E> getFirstNode() {
        return head;
    }

    public DoublyLinkedListNode<E> getLastNode() {
        return tail;
    }

    public void removeNode(DoublyLinkedListNode<E> node) {
        if (node != null) {

            if (node == head) {
                head = node.next;
            }

            if (node == tail) {
                tail = node.prev;
            }

            if (node.prev != null)
                node.prev.next = node.next;

            if (node.next != null)
                node.next.prev = node.prev;
        }
    }
}
