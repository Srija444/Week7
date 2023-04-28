package threads;
import java.io.*;
public class EmployeeFileCreation {

	public static void main(String[] args) {
		try {
			File f=new File("employeedetails.txt");
			if(f.createNewFile()) {
				System.out.println("file successfully created: "+f.getName());
			}else {
				System.out.println("file already exists");
			}
		}
		catch(Exception d) {
			System.out.println(d);
		}

	}

}
