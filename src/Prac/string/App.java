package string;

public class App {
    public static void main(String[] args) {
        System.out.println("<================ 20-05-2025 ==============>");

        /**
         * 796. Rotate String
         * Easy
         * Topics
         * Companies
         * Given two strings s and goal, return true if and only if s can become goal
         * after some number of shifts on s.
         * 
         * A shift on s consists of moving the leftmost character of s to the rightmost
         * position.
         * 
         * For example, if s = "abcde", then it will be "bcdea" after one shift.
         * 
         * Example 1:
         * 
         * Input: s = "abcde", goal = "cdeab"
         * Output: true
         * Example 2:
         * 
         * Input: s = "abcde", goal = "abced"
         * Output: false
         */

        String s = "abcde";
        /**
         * abcde
         * bcdea
         * cdeab
         * deabc
         * eabcd
         * abcde
         */
        char[] charArr = s.toCharArray();
        String goal = "abced";
        // int n=0;
        // int last = charArr.length-1;
        // for(int i=charArr.length-1; i>=0; i--){
        // char temp = charArr[n];
        // for(int j=0; j<=charArr.length-2; j++){
        // charArr[j] = charArr[j+1];
        // }
        // charArr[last] = temp;
        // System.out.println(charArr);
        // if(new String(charArr).equals(goal)){
        // System.out.println(true);
        // break;
        // }

        // }

        App app = new App();
        boolean res = app.rotateString(s, goal);
        System.out.println(res);


    }

    public boolean rotateString(String s, String goal) {

        char[] arr = s.toCharArray();
        int firstIndex = 0;
        int lastIndex = s.length() - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            char firstElement = arr[firstIndex];
            for (int j = 0; j <= arr.length - 2; j++) {
                arr[j] = arr[j + 1];
            }
            arr[lastIndex] = firstElement;
            System.out.println(arr);
            if (new String(arr).equals(goal)) {
                return true;
            }
        }

        return false;
    }
}
