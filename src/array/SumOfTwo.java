package array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(arr));
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter target element : ");
        int target = sc.nextInt(); 
        int res[] = new int[2];
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    res[0] = arr[i]; 
                    res[1] = arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
