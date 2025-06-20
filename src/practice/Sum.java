package practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {
    public static void main(String[] args) {
        /**
         * Given an array of integers nums and an integer target, return indices of the
         * two numbers such that they add up to target.
         * 
         * You may assume that each input would have exactly one solution, and you may
         * not use the same element twice.
         * 
         * You can return the answer in any order.
         * 
         * Example 1:
         * 
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         * 
         */

            int nums[] = { 3,2,4 };
        int target = 6;
        Sum s = new Sum();
        // Map<Integer, Integer> map = new HashMap<>(); 
        // for(int i=0; i<nums.length; i++){
        //     int complement = target - nums[i]; 
        //     System.out.println(complement);

        //     if(map.containsKey(complement)){
        //         arr = new int[] { map.get(complement), i };
        //     }
        //     map.put(nums[i], i);
        // }

        int arr[] = s.twoSum(nums, target);
        System.out.println(Arrays.toString(arr));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    // public int[] twoSum(int[] nums, int target) {
    // int arr[] = new int[2];
    // for (int n : nums)
    // System.out.print(n + " ");
    // System.out.println();
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = 0; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // arr[0] = i;
    // arr[1] = j;
    // break;
    // }
    // }
    // if (arr[0] != 0 || arr[1] != 0)
    // break;
    // }
    // return arr;
    // }
}
