package collection;

import java.util.*;

public class Stringcollection {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();

        s.add("lg");
        s.add("hp");
        s.add("dell");
        s.add("lenevo");
        s.add("apple");
        s.add("asus");
        s.add("lenovo");
        s.add("acer");
        s.add("sony");
        s.add("samsung");
        s.add("msi");
        s.add("toshiba");
        s.add("fujitsu");
        s.add("ibm");
        s.add("gateway");
        s.add("compaq");
        s.add("panasonic");
        s.add("asus");
        s.add("lenovo");
        s.add("vaio");

        System.out.println("String collection:");
        System.out.println(s);

        System.out.println("Methods :");

        // checks if contains a specific element
        String targetElement = "hp";
        System.out.println("Contains '" + targetElement + "': " + s.contains(targetElement));

        // size of the collection
        System.out.println("Size of the collection: " + s.size());

        // Remove an element
        String element = "msi";
        s.remove(element);
        System.out.println("Removed '" + element + "': " + s);

        // Clear
        s.clear();
        System.out.println("Collection after clearing: " + s);
    }
}
