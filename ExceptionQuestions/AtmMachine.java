package BasicJava3;
import java.util.*;

class InvalidInputException extends Exception{
	public InvalidInputException(String msg) {
		super(msg);
	}
}


public class AtmMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the balance:");
			double bal;
			bal=sc.nextDouble();
			System.out.println("Enter the withdrawal amt:");
			double with;
			with=sc.nextDouble();
			if(bal<0||with<0) {
				throw new InvalidInputException("Balance and withdrawn money cant be negative");
			}
			else if(with>bal) {
				throw new InvalidInputException("withdrawn money should not be more than balance");
			}
			
			double rem=bal-with;
			System.out.println("Remaining:"+rem);
		}
		catch(InvalidInputException e){
			System.out.println("Invalid:"+e.getMessage());
		}
		catch(java.util.InputMismatchException e){
			System.out.println("Invalid Enter number only");
		}

	}

}
