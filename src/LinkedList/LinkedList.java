package LinkedList;

public class LinkedList<T> {

    public Node<T> head;
    public Node<T> tail;
    public int size = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = head;
            size = size + 1;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
        size = size + 1;
    }

    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = head;
            size++;
        }
        // Node<T> current = head;
        newNode.next = head;
        head = newNode;
        tail = head;
        size++;
    }

    public void printLinkedList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(" | " + current.data + " ");
            current = current.next;
        }
    }

}
