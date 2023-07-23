package oops;
class W{
	void eat() {
		System.out.println("W is running");
	}
}
class Z extends W{//To show single inheritance
	void run() {
		System.out.println("Z is running");
	}
}
class Y extends Z{//To show multilevel inheritance
	void jump(){
		System.out.println("Y is jumping");
	}
}

class Hierar1{// To show Hierarchical inheritance 
	void bored(){
		System.out.println("Hierar1 is bored");
	}
}
class Hierar2 extends Hierar1{
	void notbored() {
		System.out.println("Hierar2 is not bored");
	}
}
class Hierar3 extends Hierar1{
	void play() {
		System.out.println("Hierar3 is playing");
	}
}


public class inheritance {

	public static void main(String[] args) {
		System.out.println("Single inheritance------------");
		Z obj=new Z();
		obj.run();
		obj.eat();
		
		System.out.println("Multilevel inheritance-----------");
		Y obj1=new Y();
		obj1.eat();
		obj1.jump();
		obj1.run();
		
		
		System.out.println("Hierarchical inheritance-------------");
		Hierar3 obj2=new Hierar3();
		obj2.bored();
		obj2.play();
		//obj2.notbored(); error here
		
	}

}
