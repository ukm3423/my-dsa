package array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("<------------ Array ---------------->");


        int intArr[] = new int[9]; 
        System.out.println(intArr);
        String[] strArray = new String[5];
        //System.out.println(strArray);

        long[] longArray = new long[7]; 
        System.out.println(longArray);

        char[][] charArray = new char[5][4]; 
        System.out.println(charArray);

        float[] floatArray = new float[6]; 
        System.out.println(floatArray);

        double[] doubleArray = new double[8]; 
        System.out.println(doubleArray);

        
        System.out.println("<--------------------------------->");
        int arr[] = new int[9]; 
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        arr[0] = 23; 
        arr[1] = 98; 
        arr[2] = 67; 
        arr[3] = 36; 
        arr[4] = 92; 
        arr[5] = 48; 
        arr[6] = 29; 
        arr[7] = 80; 
        arr[8] = 28; 

        int newArr[] = {23,64,26,57,94};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
