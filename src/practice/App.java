package practice;
public class App {
    public static void main(String[] args) {
        /*
         *
         * Input: nums = [1,2,3,4,5,6,7], k = 3
            Output: [5,6,7,1,2,3,4]
            Explanation:
            rotate 1 steps to the right: [7,1,2,3,4,5,6]
            rotate 2 steps to the right: [6,7,1,2,3,4,5]
            rotate 3 steps to the right: [5,6,7,1,2,3,4]
         */
        int nums[] = {1,2,3,4,5,6,7};
        int k = 2; // 3, 2
        for(int a : nums) System.out.print(a+ "  ");
        System.out.println();

        rotate(nums, k);

        for(int a : nums) System.out.print(a+ "  ");
        System.out.println();


    }

    public static void rotate(int[] nums, int k) {
        int flag = nums.length-1;
        for(int i=0; i<k; i++){
            int temp = nums[flag];
            for(int j=nums.length-1; j>0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}
