package oops;

class A{
	void bark() {
		System.out.println("A is barking");
	}
}
class B{
	void bark() {
		System.out.println("B is barking");
	}
}



public class polymorphismoverriding {

	public static void main(String[] args) {
		B obj =new B();
	    obj.bark();

	}

}
