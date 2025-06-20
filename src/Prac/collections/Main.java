package collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> list = new ArrayDeque<>();
        list.add(34); 
        list.add(325); 
        list.add(234); 
        list.add(89234); 

        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.add(234);
        System.out.println(list);

        CopyOnWriteArrayList l2 = new CopyOnWriteArrayList<>();
        l2.add("Rani");
        l2.add("Gautam");
        l2.add("Bipul");
        l2.add("Raju");
        l2.add("Rani");
        l2.add("Bipul");
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println(l2);

        Set set = new HashSet<>(l2);
        System.out.println(set);


    }
}
