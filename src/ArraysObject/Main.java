package ArraysObject;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point p2 = new Point(2);
        Point p3 = new Point(3);
        Point arr[] = new Point[]{p1, p2, p3};
        System.out.println(arr.length);
        arr[2].show();
        List<Point> points = Arrays.asList(p1,p2,p3);
        System.out.println(points);

        String s1 = new String("Umesh");
        String s2 = "Umesh";
        System.out.println(s1.equals(s2));
        String s3 = "Umesh Kumar"; 
        System.out.println(s3.substring(3,7));
        
        
    }
}
