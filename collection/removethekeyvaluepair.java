package collection;

import java.util.*;

public class removethekeyvaluepair {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "Ayush");
		map.put("2", "arun");
		map.put("3", "josh");
		map.put("4", "ash");

		String key = "4";
		String value = "ash";

		if (map.containsKey(key) && map.get(key).equals(value)) {
			map.remove(key);
		}

		System.out.println("Updated Map:");
		System.out.println(map);
	}
}
