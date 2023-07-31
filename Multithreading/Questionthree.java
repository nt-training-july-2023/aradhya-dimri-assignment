package Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class r extends Thread 
{
	public void run()
	{
		System.out.println("Enter a num");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
				
		for(int i=1;i<a;i++) {
		System.out.println(i);	
	
	}
}
}

class f extends Thread{  
public void run()
{    
	
 Scanner sc=new Scanner(System.in);	
 System.out.println("Enter a num:");
 int num=sc.nextInt();
 int n1=0,n2=1,n3,i,count=num;    
 System.out.print(n1+" "+n2);  
    
 for(i=2;i<count;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
} 
}
class rev extends Thread{
	public void run() {
		  List<String> rev = new ArrayList<String>();	  
		  rev.add("Cardia");
		  rev.add("Xenos");
		  rev.add("Titan");
		  rev.add("Terra");
		  rev.add("Emperor");
		  System.out.println("Before reverse:"+" "+rev);
		  
		  Collections.reverse(rev);
		  System.out.println("After reverse:"+" "+rev);
	}
}
class s extends Thread 
{
	public void run()
	{
		int sum=0; 
		Scanner sc=new Scanner(System.in);  
		
		int[] a = new int[5];  
		System.out.println("Enter the array: ");  
		for(int i=0; i<5; i++)  
		{  
		 
		a[i]=sc.nextInt();  
		}  
	for (int x:a) {
		sum=sum+x;
	}
	System.out.println("Sum is"+" "+sum );
	}
}
public class Questionthree {

	public static void main(String[] args) {
		r t1=new r();
		f t2=new f();
		rev t3 =new rev();
		s t4=new s();
		//t1.start();
		//t2.start();
		//t3.start();
		System.out.println(t4.getState());
	     t4.start();
	}

}
