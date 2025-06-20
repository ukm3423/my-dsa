package arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Arrays !");
        int[] nums = {34,12,64,11,43,91,36};
        for(int i: nums) System.out.print(i+" ");
        System.out.println();

        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            for(int j=nums.length-1; j>=i; j--){
                if(nums[j]>nums[i]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    
                }
            }
        }

        for(int i: nums) System.out.print(i+" ");
        System.out.println();
    }
}
