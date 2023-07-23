package oops;

	

public class staticclass {
	public static String var="outer static var";
	public String var1="outer non static var";
	static class StaticInner{
void display() {
	System.out.println("Outer static var from staticclass");
}
}
	public static void main(String[] args) {
	staticclass.StaticInner obj=new staticclass.StaticInner();
	obj.display();
	
	staticclass obj1=new staticclass();
	//System.out.println(var.var1);

	}

}
