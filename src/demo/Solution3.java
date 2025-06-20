package demo;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println("leetcode 3");
        int arr[] = {3,6,4,1,8,6,9,3,4,1,5};
        for(int n : arr) System.out.print(n+" ");
        System.out.println();
        int newArray[] = new int[arr.length];
        int ind = 0;
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            int flag = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == element){
                    flag++;
                }
            }
            if(flag>1){
                
                newArray[ind] = arr[i];
                ind++;
            }

        }
        System.out.print("Elements : ");
        for(int n : newArray)System.out.print(n+" ");
        System.out.println();
    }
}
