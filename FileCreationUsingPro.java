package GrandTest;
import java.io.File;
public class FileCreationUsingPro {
	
	 
	public class Example1 {
	 
	    public static void main(String[] args) {
	        
	        File f=new File("C://Users/DELL/Desktop/FolderCreation/yes.txt");
	        try {
	            if(f.createNewFile()) {
	                System.out.println("file created");
	            }
	            else {
	                System.out.println("error..........");
	            }
	            
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        
	 
	    }
	 
	}
}
