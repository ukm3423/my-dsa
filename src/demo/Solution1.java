package demo;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt(); 
        sc.nextLine();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();

        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
        
        sc.close();
    }
}
