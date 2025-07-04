package practice;
public class Rev {
    public static void main(String[] args) {
        int n = -87456;

        int rev = 0; 
        while(n!=0){
            int flag = n%10; // it will give me last digit 
            rev = rev*10 + flag; 
            n = n/10; // remove the last digit

        }
        System.out.println(rev);
        System.out.println(reverse(-87456));
        System.out.println("MAX Value : "+Integer.MAX_VALUE);
        System.out.println("MIN Value : "+Integer.MIN_VALUE);
 
        char[] name = {'J','H','A','R','K','H','A','N','D'};
        System.out.println(name);
        reverse(name);
        System.out.println(name);
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; 
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; 
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void reverse(char[] s){
        int n=0;
        for(int i=s.length-1; i>= s.length/2; i--){
            char temp = s[n];
            s[n] = s[i];
            s[i] = temp;
            n++;
        }
    }

}
