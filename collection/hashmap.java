package collection;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
	HashMap<String,Integer> a=new HashMap<>();
	//add
	a.put("terra",1);
	a.put("reach",2);
	a.put("mars", 3);
	a.put("earth", 23);
	System.out.println(a); 
	//remove
	a.remove("terra");
	System.out.println(a);
	//update
	a.put("reach",9);
	System.out.println(a);
	//get
    System.out.println(a.get("mars"));
	}

}
