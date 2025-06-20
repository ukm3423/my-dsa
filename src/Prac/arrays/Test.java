package arrays;

public class Test {
    public static void main(String[] args) {
        /**
         * 
         * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

        For each index i, names[i] and heights[i] denote the name and height of the ith person.

        Return names sorted in descending order by the people's heights.
        Example 1:

        Input: names = ["Mary","John","Emma"], heights = [180,165,170]
        Output: ["Mary","Emma","John"]
        Explanation: Mary is the tallest, followed by Emma and John.
        Example 2:

        Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
        Output: ["Bob","Alice","Bob"]
        Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
         */

         int height[] = {180,165,190,175};
         String names[] = {"Mary","Emma","John","Rahul"};

         for(int i=0; i<height.length; i++){
            System.out.println(names[i]+" => "+height[i]);
         }

         System.out.println("=================");
         sortPeople(names, height);

        //  for(int i=0; i<height.length; i++){
        //     int maxIndex = i;
        //     for(int j=i+1; j<height.length; j++){
        //         if(height[j] > height[maxIndex]){
        //             maxIndex = j;
        //         }
        //     }
        //     int temp = height[maxIndex]; 
        //     String temp2 = names[maxIndex];

        //     height[maxIndex] = height[i]; 
        //     names[maxIndex] = names[i];

        //     height[i] = temp;
        //     names[i] = temp2;
        //  }         
        //  for(int i=0; i<height.length; i++){
        //     System.out.println("Name : "+names[i]+" and Height : "+height[i]);
        //  }

    }

    public static String[] sortPeople(String[] names, int[] heights) {

        for(int i=0; i<heights.length; i++){
            int maxIndex = i; 
            for(int j=i+1; j<heights.length; j++){
                if(heights[j] > heights[maxIndex]){
                    maxIndex = j;
                }
            }
            int t1 = heights[maxIndex]; 
            String t2 = names[maxIndex]; 

            heights[maxIndex] = heights[i]; 
            names[maxIndex] = names[i]; 

            heights[i] = t1; 
            names[i] = t2; 
        }
        for(int i=0; i<heights.length; i++){
            System.out.println(names[i]+" => "+heights[i]);
         }
        return names;   
    }
}
