package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        System.out.println("\n=============== ArrayList =================");
        List<Integer> list = new ArrayList<Integer>(10);
        list.add(25); 
        list.add(83); 
        list.add(92); 
        System.out.println(list.add(23));
        System.out.println(list);
        System.out.println(list.get(3));


        System.out.println("\n=============== Linked List =================");
        List<Integer> list2 = new LinkedList<>();
        list2.add(23);
        list2.add(93); 
        list2.add(73); 
        list2.add(82); 
        
        System.out.println(list2);
        System.out.println(list2.get(2));


        
    }
}
