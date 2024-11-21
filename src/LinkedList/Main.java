package LinkedList; 

class Customer{
    String name; 
    Customer next; 

    Customer(String name){
        this.name = name; 
        this.next = null; 
    }
}

class BankWaitingLine{
    Customer front; 
    Customer rear; 
    int numOfCustomer = 0;

    BankWaitingLine(){
        this.front = null; 
        this.rear = null; 
    }

    public void addCustomer(String name){
        Customer newCustomer = new Customer(name);
        if(rear == null){
            front = rear = newCustomer;
            numOfCustomer++;
        }else{
            rear.next = newCustomer;
            rear = newCustomer;
            numOfCustomer++;
        }
        System.out.println(name+" has been added to the waiting line.");
    }

    public void serveCustomer(){
        if(front == null){
            System.out.println("No customers in the waiting line.");
            return; 
        }
        System.out.println(front.name+" has been served.");
        front = front.next; 
        numOfCustomer--;
        if(front == null){
            rear = null; 
        }
    }

    public void displayLine(){

        if(front == null){
            System.out.println("The waiting line is empty.");
            return; 
        }
        System.out.println("Current Waiting Line :- ");
        Customer current = front;
        while(current != null){
            System.out.println(current.name);
            current = current.next;
        }
        System.out.println();
         
    }
}

public class Main{
    public static void main(String[] args){

        BankWaitingLine waitingLine = new BankWaitingLine();
        waitingLine.addCustomer("John");
        waitingLine.addCustomer("Mary");
        waitingLine.addCustomer("David");
        waitingLine.displayLine();

        System.out.println("Number of Customer : " + waitingLine.numOfCustomer);

        waitingLine.serveCustomer();

        System.out.println("Number of Customer : " + waitingLine.numOfCustomer);

        waitingLine.displayLine();

        waitingLine.addCustomer("Malik");
        waitingLine.addCustomer("Dharam");

        waitingLine.displayLine();
        System.out.println("Number of Customer : " + waitingLine.numOfCustomer);


    }
}