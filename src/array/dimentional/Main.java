package array.dimentional;

public class Main {

    public static void main(String[] args) {

        int[] arr = {34, 78, 12, 35, 71, 43, 26};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int n = 10;
        for (int r = 1; r <= n; r++) {
            // System.out.print("-> ");
            if (r <= n / 2) {
                for (int c = 1; c <= r; c++) {
                    System.out.print(" ");
                }
                for (int c = r; c <= n / 2; c++) {
                    System.out.print("x");
                }
                for (int c = r; c <= (n / 2) - 1; c++) {
                    System.out.print("x");
                }
            }else{
                for(int c=r+1; c<=n+1; c++){
                    System.out.print(" ");
                }
                for(int c=n/2 +1; c<r; c++){
                    System.out.print("x");
                }
                for(int c=n/2; c<r; c++){
                    System.out.print("x");
                }
            }

            System.out.println();
        }

        // selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    static void selectionSort(int[] arr) {
        System.out.println("# Selection Sort :- ");
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

}
