package Basic.IterationStatements;
import java.util.*;
public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a;
		a=sc.nextInt();
		int i;
		System.out.println("Table:");
		for( i=1;i<=10;i++) {
		
			System.out.println(a*i);
		}
		
		

	}

}
