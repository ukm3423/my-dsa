package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Double> salary = new Hashtable<>(); 
        salary.put("megha", 60000.34d); 
        salary.put("dhanpati", 45000d); 
        salary.put("umesh", 45000d);
        System.out.println(salary);

        
    }
    
}
