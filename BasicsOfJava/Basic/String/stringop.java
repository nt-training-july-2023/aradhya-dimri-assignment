package Basic.String;

public class stringop {

	public static void main(String[] args) {
		String str="Warrior";
		
		System.out.println(str.length());
		System.out.println(str.concat(" Clan"));
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("r"));
		System.out.println(str.startsWith("W"));
		System.out.println(str.replace("r", "p"));
		
		
		
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(2));
		System.out.println(str.contains("rri"));
		System.out.println(str.toUpperCase());
		System.out.println(str.lastIndexOf("r"));
		
		
		/*
		  equals() method and the == operator are used to compare two objects in Java. == is an operator and equals() is method. But == operator compares reference or memory location of objects in a heap, whether they point to the same location or not.
		 */
		String str1="hello";
		String str2="hello";
		 String str3 =  new String("hello");
		 System.out.println(str1 == str2); 
	        System.out.println(str1 == str3);
	        System.out.println(str1.equals(str2)); 
	        System.out.println(str1.equals(str3)); 
	}

}
