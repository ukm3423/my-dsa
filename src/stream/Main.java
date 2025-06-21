package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    {
        
    }

    
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
         list.add(64);
         list.add(234);
         list.add(23);

         
         
        // list.stream().filter(n -> n%2==0).forEach(System.out::println);

        // List<String> st= Arrays.of("Sohan", "Ajay", "Rahul");
        // Predicate<String> isEven = x -> x.startsWith("A");
        // System.out.println(isEven.test("Harsh"));

        // Function<Integer, String> fun = x -> {
        //     if(x>18) return "You are eligible for OYO";
        //     else return "You are not eligible for OYO";
        //     };

        // System.out.println(fun.apply(86));


        // Consumer<Integer> con = x -> {
        //     if(x > 18){
        //         System.out.println("Eligible for Voting.");
        //     }else{
        //         System.out.println("Not Eligible for Voting");
        //     }
        // };

        // con.accept(56);


        // Supplier<String> sup = () -> "hello delhi";
        // System.out.println(sup.get());


        for (Integer integer : list) {
            // System.out.println(integer);
            if(integer == 64){
                list.add(65);
            }
            System.out.println(integer);
        }

        // list.add(786);
        System.out.println(list);


    }
    static{
        System.out.println("hello");
    }
}
