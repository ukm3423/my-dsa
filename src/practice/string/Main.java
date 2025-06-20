package practice.string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reverse a String");


        char[] str = {'n','o','t','i','f','i','c','a','t','i','o','n'};
        System.out.println(new String(str));

        reverse(str);
        System.out.println(str);

        int num = 354234; 
        int rev = reverse(num);
        System.out.println(rev);
    }

    private static int reverse(int num) {
        int rev = 0; 
        while(num!=0){
            int lastNum = num%10; 
            rev = rev*10 + lastNum; 
            num = num/10;
        }
        return rev;
    }

    private static void reverse(char[] str) {
        int n = 0; 

        for(int i=str.length-1; i>=str.length/2; i--){
            char temp = str[n]; 
            str[n] = str[i]; 
            str[i] = temp; 
            n++;
        }

    }


}
