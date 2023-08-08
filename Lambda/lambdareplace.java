package Lambda;

import java.util.*;
import java.util.function.Function;

public class lambdareplace {
    public static void main(String[] args) {
        String input = "Hello my name is aradhya";
        
        Function<String, String> rv= str -> str.replaceAll("[aeiouAEIOU]", "#");
        String result = rv.apply(input);

        System.out.println("Original String: " + input);
        System.out.println("Replaced one: " + result);
    }
}
