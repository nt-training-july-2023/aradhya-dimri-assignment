package Basic.Arrays;

public class avgarray {
	public static void main(String[] args) {
		
		int	a[]= {21,23,42,97,65,89};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
		}
		
		float avg=((float)sum/(float)a.length);
		System.out.println( avg);
		
		
	
		}
	}

