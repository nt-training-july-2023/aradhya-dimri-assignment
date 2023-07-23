package oops;
class Acc{
	private int ano;
    private	String name;
    private int balance;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class encapsulation {
	public static void main(String[] args) {
	
   Acc obj=new Acc();
   obj.setAno(23);
   obj.setName("Arjun");
   obj.setBalance(100000);
   
   Acc obj1=new Acc();
   obj1.setAno(37);
   obj1.setName("Barry");
   obj1.setBalance(400000);
   
   Acc obj2=new Acc();
   obj2.setAno(49);
   obj2.setName("Tim");
   obj2.setBalance(300000);
   
   System.out.println(obj.getAno()+" "+obj.getName()+" "+obj.getBalance());
   System.out.println(obj1.getAno()+" "+obj1.getName()+" "+obj1.getBalance());
   System.out.println(obj2.getAno()+" "+obj2.getName()+" "+obj2.getBalance());
	}
}
