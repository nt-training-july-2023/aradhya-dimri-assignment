package oops;
class Mobile{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand+":"+price+":"+name);
	}
	public static void show1() {
		System.out.println("static method");
	}
	
}
public class staticmethod {

	public static void main(String[] args) {
	
Mobile obj=new Mobile();
obj.brand="Apple";
obj.price=1500;
Mobile.name="Smartphone";
obj.show();
Mobile.show1();//can be called directly
	}

}
