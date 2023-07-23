package oops;

public class polymorphismmethodoverloading {

	
int  add(int a,int b) {
		return a+b;
	}

int add(int a,int b,int c) {
	return a+b+c;
	
}
	public static void main(String[] args) {
	
	
	polymorphismmethodoverloading sc=new polymorphismmethodoverloading();
	System.out.println(sc.add(2, 3));
	System.out.println(sc.add(2, 3,7));
	}

}
