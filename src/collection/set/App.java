package collection.set;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        
        
        Set<String> employees = new HashSet<>(); 
        employees.add("Megha"); 
        employees.add("Dhanpati"); 
        employees.add("Umesh"); 
        employees.add("Raju");
        
        System.out.println(employees);
    }
}
