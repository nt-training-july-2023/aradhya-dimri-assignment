package BasicJava3;

import java.io.IOException;
import java.io.*;
public class filereaddata {

	public static void main(String[] args) {

try {
	FileReader fr=new FileReader("C:\\Users\\aradh\\OneDrive\\Desktop\\hello.txt");
	int i=0;
	while((i=fr.read())!=-1)
System.out.println((char)i);
fr.close();
}
catch(IOException e){
	System.out.println("Io exception");
}
catch(Exception e){
	System.out.println("Unexcepted  error");
}
	}

}
