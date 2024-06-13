package LinkedList;

public class Kaal {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.append("Ranchi");
        list.printLinkedList();
        System.out.println(
                "\nSize : " + list.size + " , [ Head : " + list.head.data + ", Tail : " + list.tail.data + " ]");
        list.append("Ramgarh");
        list.append("Lalpur");
        list.append("Jamshedpur");
        list.append("Bokaro");
        list.printLinkedList();
        System.out.println(
                "\nSize : " + list.size + " , [ Head : " + list.head.data + ", Tail : " + list.tail.data + " ]");

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(34);
        list2.append(89);
        list2.append(46);
        list2.printLinkedList();

        list.insertAtBeginning("Latehar");
        list.insertAtBeginning("Hazaribagh");
        list.printLinkedList();
        System.out.println(
                "\nSize : " + list.size + " , [ Head : " + list.head.data + ", Tail : " + list.tail.data + " ]");

    }
}
