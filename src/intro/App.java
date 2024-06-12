package intro;

public class App {
    public static void main(String[] args) {
        MyInterface myInterface = new Class1();
        myInterface.m2();
        myInterface.display();
        
        MyInterface inter2 = new Class2(); 
        inter2.m2();
        inter2.display();
        MyInterface.staticMethod();
        

    }
}
