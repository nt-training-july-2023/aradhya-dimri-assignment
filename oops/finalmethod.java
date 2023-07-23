package oops;
class fc
{
	//final void method() here it will error as it cant be overriden
	void method() 
	{
		System.out.println("run");
	}
	
}
class zk extends fc{
	void method() {
		System.out.println("run");
	}
}


public class finalmethod {

	public static void main(String[] args) {
		 zk obj=new zk();
		 obj.method();

	}

}
