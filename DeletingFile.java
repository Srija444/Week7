package GrandTest;
import java.io.File;
public class DeletingFile {
	/*Abhinav wants to delete empty files from his local machine, help him to write a Java program to accept path and delete empty files.
  Note: Please specify the file count before deletion and after deletion. and display the count that are deleted*/
	 
	
	 
	public class Example1 {
	 
	    public static void main(String[] args) {
	        
	        
	        
	        File f=new File("C://Users/SESPL/Desktop/Files/abc.txt1");
	        
	             System.out.println(f.length());
	             f.delete();
	             
	    }
	 
	}
}
