package demo;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int m = 0; m < t; m++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int i = 1; i <= n; i++) {
                double d = 0;
                for (int j = 0; j < i; j++) {
                    d = Math.pow(2, j) * b + d;
                }
                d = d + a;
                System.out.print((int) d + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
