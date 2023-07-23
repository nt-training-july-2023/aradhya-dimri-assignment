package Basic.IterationStatements;

public class palidrome {

	public static void main(String[] args) {
	int num=121;//some problem
		int rev=0;
		while(num!=0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(rev==num) {
		System.out.println("Palidrome");
		}
		else {
		System.out.println(" Not Palidrome");
		}

		}

	}
