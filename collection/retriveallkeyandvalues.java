package collection;

import java.util.HashMap;

public class retriveallkeyandvalues {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("mars", 25);
        m.put("jupiter", 30);
        m.put("saturn", 28);
        
        System.out.println("All keys in the map:");
        for (String key : m.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nAll values in the map:");
        for (Integer value : m.values()) {
            System.out.println(value);
        }
    }
}
