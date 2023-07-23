package oops;

public class finalvar {

	public static void main(String[] args) {
		int a=9;
		int b=8;
		final int c=2;
	
		a=90;
		b=53;
		//c=77;error because final
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
