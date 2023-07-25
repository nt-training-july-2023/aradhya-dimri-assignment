package BasicJava3;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String msg) {
	super(msg);
}
}
public class passwordexception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a pass:");
		
		try {
			String pass=sc.nextLine();
		    Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d).{8,}$");
		
			Matcher matcher=pattern.matcher(pass);
			
			if(!matcher.matches()) {
				throw new InvalidPasswordException("invalid");
			}
			System.out.println("valid");
		}
		catch(InvalidPasswordException e){
			System.out.println(e.getMessage());
		}
	}

}