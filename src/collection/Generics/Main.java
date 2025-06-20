package collection.Generics;

public class Main {
    public static void main(String[] args) {
        Test<Integer> t1 = new Test<Integer>(23);
        System.out.println(t1.getData());
        Test<String> t2 = new Test<String>("Umesh Kumar"); 
        System.out.println(t2.getData());

        System.out.println(genericMethod("I Love India."));
        myGenericMethod("Have a nice day.");
    }

    public static <T> T genericMethod(T data){
        return data;
    }

    public static <T> void myGenericMethod(T data){
        System.out.println("Generic method : ");
        System.out.println("Data is: " + data);

    }
}
