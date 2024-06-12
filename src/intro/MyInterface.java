package intro;

public interface MyInterface {
    int MAX = 100;
    void m1();
    void m2();
    void m3();

    default void display(){
        System.out.println("Hello, To Kaise hai App Log !");
    }

    static void staticMethod(){
        System.out.println("I am static method.");
    }
}
