package array;

public class Question1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};  // [24,12,8,6]
        int arr2[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            int temp = 1; 
            for(int j=0; j<arr.length; j++){
                if(i==j) continue;
                temp = arr[j] * temp;
                System.out.println(arr[i]+""+arr[j]);
            }
            arr2[i] = temp;
        }

        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
