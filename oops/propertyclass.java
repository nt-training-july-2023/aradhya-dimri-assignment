package oops;
import java.util.*;
import java.io.*;
public class propertyclass {

	public static void main(String[] args) {
		try {
		Properties p=new Properties();
		p.setProperty("name", "Aradhya");
		p.setProperty("email", "Aradhyadimri2000@gmail.com");
		p.store(new FileWriter("info.properties"),"example");//cretes a file info.properties inside our workspace
	}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
