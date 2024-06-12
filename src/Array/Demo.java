package Array;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();

        Point[] points = new Point[] {p1, p2, p3, p4};
        for(int i = 0; i < points.length; i++){
            points[i].display(i);
        }

        String s1 = "abc"; 
        String s2 = "abc";
        String s3 = new String("abc"); 
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));

        String name = "codizworld"; 
        int n= 7;
        System.out.println(name.length());
        for(int i=n; i<name.length(); i++){
            System.out.println(name.substring(n, i+1));
        }



    }
}
