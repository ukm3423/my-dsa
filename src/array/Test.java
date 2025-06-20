package array;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[10];
        System.out.println(Arrays.toString(intArr));
        for(int i = 0; i < intArr.length; i++) {
            System.out.print("Enter array element at index " + i+ " : ");
            intArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(intArr));
        System.out.println("Sum of Array elements : " + sumOfArrays(intArr));
        Arrays.sort(intArr);
        // System.out.print("Enter element for search : " );
        // int element = sc.nextInt(); 
        // if(searchElement(intArr,element)){
        //     System.out.println(element + " is found.");
        // }else{
        //     System.out.println(element + " is not found in the array.");
        // }


        System.out.println("<--------------- Binary Search ----------------->");
        System.out.println(Arrays.toString(intArr));
        System.out.print("Enter element for search : " );
        int element = sc.nextInt(); 
        binarySearchElement(intArr, element);
    }

    private static void binarySearchElement(int arr[],int element) {
        int low = 0; 
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = (low + high)/2;
            System.out.println(arr[mid]);
            if(arr[mid] == element) {
                System.out.println(element + " found at index " + mid);
                break;
            }else if(arr[mid] > element) {
                high = mid -1; 
            }else if(arr[mid] < element) {
                low = mid + 1;
            }
        }
        
    }

    private static boolean searchElement(int arr[], int element) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == element){
                return true;
            }
        }
        return false;
        
    }

    private static int sumOfArrays(int[] intArr) {
        int sum = 0; 
        for(int i=0; i<intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;
    }
}
