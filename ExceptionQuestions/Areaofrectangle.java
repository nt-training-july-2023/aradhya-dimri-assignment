package BasicJava3;
import java.util.*;

class InvalidDimensionException extends Exception{
	public InvalidDimensionException(String msg) {
		super(msg);
	}
}



public class Areaofrectangle {
	
	
public static int Rectangle(int len,int width)throws InvalidDimensionException {
	if(len<=0||width<=0) {
		throw new InvalidDimensionException("Len and width cant be negative and zero");
	}
	return len*width;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the length:");
			int len;
			len=sc.nextInt();
			System.out.println("Enter the width:");
			int width;
			width=sc.nextInt();	
			int area=Rectangle(len,width);
			System.out.println("Area:"+area);
		}
		
		catch(InvalidDimensionException  e){
			System.out.println("Invalid:"+e.getMessage());
		}
		catch(java.util.InputMismatchException e){
			System.out.println("Invalid Enter number only");
		}

	}

}
