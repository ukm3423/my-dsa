package pattern;

public class App {
    public static void main(String[] args) {
        
        for(int r=1; r<=10; r=r+2){
            for(int c=1; c<=r; c=c+2){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int r=1; r<=5; r++){

            for(int s=5; s>=r; s--){
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++){
                System.out.print(c);
            }
            for(int c=r-1; c>=1; c--){
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1; i<=5; i++){
            int val = 1;
            for(int j=0; j<i; j++){
                System.out.print(val);
                val+=2;
            }
            System.out.println();
        }




    }
}
