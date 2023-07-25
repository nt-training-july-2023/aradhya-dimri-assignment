package BasicJava3;
import java.util.*;
class NotEvenNumberException extends Exception{
	public NotEvenNumberException(String msg) {
	super(msg);
}
}
public class EvenNumberexception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a num:");
		
		try {
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println("It is even");
			}
			else {
				throw new NotEvenNumberException("not even");
			}
		}
		catch(NotEvenNumberException e){
			System.out.println("Invalid:"+" "+e.getMessage());
		}
		catch(InputMismatchException e){
			System.out.println("Invalid:Enter a num only");
		}

	}

}
