package LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedListOld list = new LinkedListOld();
        list.append(85);
        list.append(76);
        list.printLinkedList();
        System.out.println(list.tail.data);
        System.out.println("Size of Linkedlist : " + list.size + "\tHead : " + list.head.data);

        list.addAfter(85, 88);
        list.printLinkedList();
        System.out.println("Size of Linkedlist : " + list.size + "\tHead : " + list.head.data);

        list.append(56);
        list.printLinkedList();
        System.out.println("Size of Linkedlist : " + list.size + "\tHead : " + list.head.data);

        // list.reverse();
        // System.out.print("After Reverse : ");
        // list.printLinkedList();
        // System.out.println("Size of Linkedlist : " + list.size + "\tHead : " +
        // list.head.data);

    }
}
