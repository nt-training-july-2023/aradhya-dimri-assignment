package oops;
class Customer{  
	   int sno;
	   String name;  
	   static String Bank ="SBI";
	   
	   Customer(int a, String b){  
	   sno = a;  
	   name = b;  
	   }  
	   
	   void details ()
	   {
		   System.out.println(sno+" "+name+" "+Bank);}  
	   }  
public class staticvar {

	public static void main(String[] args) {
		Customer obj=new Customer(24,"niraj");
		Customer obj2=new Customer(37,"arun");
		obj.details();
		obj2.details();
		
	}

}
