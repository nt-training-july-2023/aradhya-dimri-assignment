package Multithreading;

import java.util.*;

class add extends Thread{
	public   void run() {
    int a=6;
    int b=8;
    System.out.println("Addition:"+" "+a+b);
   
}
}


class subtract extends Thread{
	public  void run() {
    int a=6;
    int b=3;
    System.out.println("Subtract:"+" "+(a-b));
    	
}
}

class multiply extends Thread{
	 public  void run() {
    int a=2;
    int b=3;
    System.out.println("Multiply:"+" "+a*b);
    
}
}



public class threethreads {

	public static void main(String[] args) {
	add t1=new add();
	subtract t2=new subtract();
	multiply t3=new multiply();
			t1.start();
		
			
			t2.start();
						
			t3.start();
		   
	}
}
