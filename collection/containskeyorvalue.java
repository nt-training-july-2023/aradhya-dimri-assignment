package collection;

import java.util.*;


public class containskeyorvalue {
    public static void main(String[] args) {
        HashMap<String, Integer> b = new HashMap<>();

       
        b.put("Gary", 25);
       b.put("Harry", 20);
        b.put("Potter", 78);

        String keyToCheck = "Potter";
        if (b.containsKey(keyToCheck)) {
            System.out.println("The map contains the key: " + keyToCheck);
        } else {
            System.out.println("The map does not contain the key: " + keyToCheck);
        }

   
        int valueToCheck = 28;
        if (b.containsValue(valueToCheck)) {
            System.out.println("The map contains the value: " + valueToCheck);
        } else {
            System.out.println("The map does not contain the value: " + valueToCheck);
        }
    }
}
