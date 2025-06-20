package practice;
public class Palindrome {
    public static void main(String[] args) {
        int num = 20002; 

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int revHalf = 0;
        while (num > revHalf) {
            revHalf = revHalf * 10 + num % 10;
            num = num / 10;
            // System.out.println(revHalf);
        }
        // System.out.println(revHalf);
        return num == revHalf || num == revHalf / 10;
    }
}
