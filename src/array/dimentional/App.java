package array.dimentional;

public class App {
    public static void main(String[] args) {

        int a = 0, b = 2, n = 10;

        for(int i=1; i<=n; i++){
            double t=0;
            for(int j=0; j<=i; j++){
                t = Math.pow(2, j) + t;
            }
            t = t+a-1;

            System.out.print((int)t+" ");
            
        }


        System.out.println();
    }
}
