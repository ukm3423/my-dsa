package collection.linkedlist;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Long> mob = new Hashtable<>();
        mob.put("dhanpati", 6201033951l);
        mob.put("megha", 9988888877l);
        mob.put(null, 7889888879l);
        System.out.println("Dhanpati : "+mob.get("dhanpati"));
        System.out.println("Megha : "+mob.get("megha"));
        System.out.println("Null : "+mob.get(null));

        
    }
}
