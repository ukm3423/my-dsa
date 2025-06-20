package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        /**
         * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

        Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

        Example 1:
        Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        Output: [2,2,2,1,4,3,3,9,6,7,19]

        Example 2:
        Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
        Output: [22,28,8,6,17,44]
         */

        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        for(int i: arr1) System.out.print(i+" ");
        System.out.println();

        for(int i: arr2) System.out.print(i+" ");
        System.out.println();

        List<Integer> result = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            boolean flag = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    result.add(arr2[j]);
                    flag = true;
                }
            }
            if(flag == false){
                d.add(arr1[i]);
            }
        }

        System.out.println(result);
        System.out.println(d);

    }
}
