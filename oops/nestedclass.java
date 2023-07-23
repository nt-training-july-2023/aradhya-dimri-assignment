package oops;



public class nestedclass {

	static class A{
		void display() {
			System.out.println("static nested class");
		}
	}
	class Innerclass{
		void display() {
			System.out.println("INNER class");
		}
	}
	public static void main(String[] args) {
	nestedclass.A obj=new nestedclass.A();
	obj.display();//static nested class
	
	nestedclass obj1=new nestedclass();
	nestedclass.Innerclass obj2=obj1.new Innerclass();
	obj2.display();//inner class
	

	}

}
