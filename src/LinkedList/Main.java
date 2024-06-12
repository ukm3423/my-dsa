package LinkedList;

public class Main {
    public static void main(String[] args) {
        
        Node n1 = new Node(34); 
        Node n2 = new Node(87);
        n1.next = n2;
        System.out.println(n1.next.data);

    }
}
