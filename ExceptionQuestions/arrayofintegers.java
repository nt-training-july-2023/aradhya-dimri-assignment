package BasicJava3;

import java.util.*;
public class arrayofintegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {2,5,8,3,1,9,4};
		System.out.println("Enter the index you to access:");
		int i=sc.nextInt();
		try {
			int element=a[i];
			System.out.println("The Element that is present at this index is:");
			System.out.println(element);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Over Size");
		}
		catch(NullPointerException e){
			System.out.println("Array is Empty");
		}

	}

}
