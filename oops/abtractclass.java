package oops;
abstract class Test{
	abstract void walk();
}

class Testing extends Test{
	void walk() {
		System.out.println("Walking");
	}
}

public class abtractclass {

	public static void main(String[] args) {
		Testing obj=new Testing();
		obj.walk();

	}

}
