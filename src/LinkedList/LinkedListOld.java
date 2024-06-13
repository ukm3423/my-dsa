package LinkedList;

public class LinkedListOld {

    Node head;
    Node tail;
    int size = 0;

    public LinkedListOld() {
        this.head = null;
        this.tail = null;
    }

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size = size + 1;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
            size = size + 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        // while (last.next != null) {
        // last = last.next;
        // }
        size = size + 1;
    }

    public void addAfter(int prevNode, int data) {

        Node current = searchNode(prevNode);

        if (current == null) {
            System.out.println("Given node is present in the list !!!");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        size = size + 1;
    }

    public Node searchNode(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printLinkedList() {
        Node current = head;
        if (current != null) {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        } else {
            System.out.println("Linked List is Empty !!!");
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

}
