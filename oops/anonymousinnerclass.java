package oops;

interface  hello{
	void hell();
}
public class anonymousinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
hello obj=new hello() {
	
	@Override
	public void hell() {
		System.out.println("Hello from the anon inner class");
	}
};
obj.hell();
	}

}
