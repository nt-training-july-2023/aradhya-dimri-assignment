package oops;

public class staticblock {
	static {
		System.out.println("block1 called");
	}
	
	static void method() {
		System.out.println("method called");
	}
	static {
		System.out.println("block2 called");
	}
	
	
	public static void main(String args[]) {
		System.out.println("Main method called");
	method();
	}


}
