package practice.interview;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(reverse("Umesh"));
        System.out.println(isPalindrome("delhi"));

        System.out.println(countChar("internationalization", 'i'));

        String str = "Hello";
        IntStream intStream = str.chars();
        intStream = intStream.filter(c -> c=='l');
        intStream.forEach(System.out::println);

    }

    /**
     * Count occurrences of a character 
     * @param str
     * @param ch
     * @return
     */
    public static int countChar(String str, char ch){
        return (int) str.chars().filter(c -> c==ch).count();
    }

    /**
     * reverse a string
     * @param str
     * @return
     */
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * check a String is palindrome or not
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
