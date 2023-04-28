package threads;
import java.io.*;
public class StudentFileCreation {

	public static void main(String[] args) {
		try {
		File f=new File("studentdetails.txt");
		if(f.createNewFile()) {
			System.out.println("the file created successfully: "+f.getName());
		}else {
			System.out.println("file already exists");
		}
	}catch(IOException p) {
		System.out.println(p);
	}

}
}
