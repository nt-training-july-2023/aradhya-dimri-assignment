package Basic.IterationStatements;

public class armstorng {

	public static void main(String[] args) {
		int num=153;
		int o=num;
		int n=String.valueOf(num).length();
		int sum=0;
		while(num>0) {
			int d=num%10;
			sum+=Math.pow(d, n);
			num=num/10;
			
		}

		if(sum==o) {
			System.out.println("armstrong");
		}
		else {
		System.out.println(" Not armstrong");
		}
		}
	}


