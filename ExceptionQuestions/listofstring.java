package BasicJava3;
import java.util.*;
public class listofstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> a=new ArrayList<>();
		a.add("Audi");
		a.add("BMW");
		a.add("Honda");
		a.add("Supra");
		a.add("Hyundai");
		a.add("Toyota");
		a.add("Austin Martin");
		a.add("Bugati");
		a.add("Ferrari");
		a.add("Swift");
		System.out.println("Enter the index you to access:");
		int i=sc.nextInt();
		try {
			String element=a.get(i);
			System.out.println("The string present at this is:");
			System.out.println(element);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Over size");
		}
		catch(NullPointerException e){
			System.out.println("list is null");
		}
		

	}

}
