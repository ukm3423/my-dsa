package intro;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int a = 10, b = 20; 
        System.out.println("Before Swapping : a = " + a + " b = " + b);
        a = a+b;  //  a = 10 + 20 = 30
        b = a-b;  //  b = 30 - 20 = 10
        a = a-b;  //  a = 30 - 10 = 20
        System.out.println("After Swapping : a = " + a + " b = " + b);

        String s1 = "adf"; 
        String s2 = "adf";
        System.out.println(s1==s2);



        System.out.println();
    }
}
