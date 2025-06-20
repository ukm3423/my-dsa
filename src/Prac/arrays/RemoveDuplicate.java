package arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.print("Modified nums = ");
        // for (int i = 0; i < k; i++) {
        //     System.out.print(nums[i] + (i == k - 1 ? "" : ", "));
        // }
        // System.out.println("]");
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0; // Pointer to place unique elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i]; // Move unique element to the next position
            }
        }
        
        return index + 1; // Return the number of unique elements
    }
}
