package filesPractice;
import java.io.*;
public class FileCreation {
public static void main(String[] args) {
	try {
	File fr=new File("kimi no nawa.txt");
	if(fr.createNewFile()) {
		System.out.println("the file created successfully: "+fr.getName());
		
	}else {
	System.out.println("file already exists.");	
	}
}
	catch(IOException e) {
		System.out.println("an error occured");
		e.printStackTrace();
		/*The printStackTrace() method in Java is a tool used to handle exceptions and errors. It is a method of Java's throwable class which prints the throwable along with other details like the line number and class name where the exception occurred. printStackTrace() is very useful in diagnosing exceptions.*/
	}
}
}
