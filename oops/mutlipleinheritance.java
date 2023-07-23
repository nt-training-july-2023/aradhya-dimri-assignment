package oops;
interface Animal{//Multiple inheritance through interface 
	void run();
}

interface Bird{
	void fly();
}
class Mammal implements Animal,Bird{

	public void run() {
		System.out.println("Animals Run");
	}
	public void fly() {
		System.out.println("Birds Fly");
	}
}
public class mutlipleinheritance {

	public static void main(String[] args) {
	Mammal obj=new Mammal();
	obj.fly();
	obj.run();

	}

}
