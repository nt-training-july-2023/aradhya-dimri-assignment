package Multithreading;
class a extends Thread{
	public void run() {
   String str="cardio";
   System.out.println(str.concat("heart"));
   
}
}


class sb extends Thread{
	public   void run() {
    int a=6;
    int b=3;
    System.out.println("Subtract:"+" "+(a-b));
   
}
}

class m extends Thread{
	public void run() {
		int	a[]= {124,3,41,57,05,33};
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]> max) {
				max=a[i];
			}
			
		}
		System.out.println("Max:"+max);
		}
   
	} 

public class priority {

	public static void main(String[] args) { 
		a t1=new a();
		sb t2=new sb();
		m t3=new m();
		t1.setPriority(Thread.MAX_PRIORITY);//basically as the name is priority is max here
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}
