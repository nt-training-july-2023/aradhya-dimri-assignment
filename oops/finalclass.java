package oops;
  class gc{//if i make it final it will not extends and show an error
	void run() {
		System.out.println("gc is running");
	}
}
class jc extends gc{
	void run() {
		System.out.println("jc is running");
	}
}


public class finalclass {

	public static void main(String[] args) {
		jc obj=new jc();
		obj.run();
    
	}

}
