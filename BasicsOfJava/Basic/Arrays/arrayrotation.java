package Basic.Arrays;

public class arrayrotation {

	public static void main(String[] args) {
		int a[]= {2,9,4,8,1};
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+", ");
		}
		System.out.println();
		
		
		for(int j = 0; j <2; j++) {
				int d=a[a.length-1];
				for(int i=a.length-1;i>0;i--) {
					a[i]=a[i-1];
					
				}
				a[0]=d;
		}
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+", ");
		}
		System.out.println();
	}

}
