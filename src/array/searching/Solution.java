package array.searching;

public class Solution {

    public static void main(String[] args) {

        // Example 1:
        // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        // Output: [1,2,2,3,5,6]
        // Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        // The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3, n = 3;

        System.out.println("\nOriginal Array : ");
        for(int i : nums1) System.out.print(i+ " ");
        merge(nums1, m, nums2, n);
        System.out.println("\nAfter Merging : ");
        for(int i : nums1) System.out.print(i+ " ");
        // selectionSort(nums1);
        // System.out.println("\nAfter Sorting : ");
        // for(int i : nums1) System.out.print(i+ " ");
        System.out.println();

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int t = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i >= m) {
                nums1[i] = nums2[t];
                t++;
            }
        }

        for(int i=0; i<nums1.length-1; i++){
            int minIndex = i; 

            for(int j=i+1; j<nums1.length; j++){
                if(nums1[j] < nums1[minIndex]){
                    minIndex = j;
                }
            }

            int temp = nums1[i]; 
            nums1[i] = nums1[minIndex]; 
            nums1[minIndex] = temp;
        }
    }

    // static void selectionSort(int arr[]) {

    //     for(int i=0; i<arr.length-1; i++){
    //         int minIndex = i; 

    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[j] < arr[minIndex]){
    //                 minIndex = j;
    //             }
    //         }

    //         int temp = arr[i]; 
    //         arr[i] = arr[minIndex]; 
    //         arr[minIndex] = temp;
    //     }

    // }

    
}
