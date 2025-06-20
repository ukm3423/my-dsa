package interview;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        /**
         * Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.
        Example 1:

        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
        Example 2:

        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]
 
         */

        char s[] = {'n','o','t','i','f','i','c','a','t','i','o','n'};

        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        
        int l = s.length-1;
        for(int i=0; i<s.length/2; i++){
            char c = s[i]; 
            s[i] = s[l]; 
            s[l] = c;
            l--;
                    System.out.println(Arrays.toString(s));

        }
    }
}
