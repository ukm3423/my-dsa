package LinkedList;

class Node{
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

class MyLinkedList{
    Node head;
    int size; 

    MyLinkedList(){
        this.head = null; 
        this.size = 0;
    }

    public void add(int data){
        Node newNode = new Node(data); 
        if(head == null){
            head = newNode;
            return; 
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;  // Move to the next node
        }
    }
    
    
}

public class Prac {
    public static void main(String[] args) {
        

        MyLinkedList list = new MyLinkedList(); 
        list.add(34);
        list.add(28);
        list.add(98);
        list.add(58);

        list.traverse();
        

    }
}
