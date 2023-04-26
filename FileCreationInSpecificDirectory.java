package filesPractice;
import java.io.*;
public class FileCreationInSpecificDirectory {

	public static void main(String[] args) {
		try {
			File f=new File("D:\\Drive/magic.txt");
			if(f.createNewFile()) {
				System.out.println("file created successfully: "+f.getName());
				
			}else {
				System.out.println("file already exists.");
			}
		}
		catch(IOException e) {
			System.out.println("error occured while creating file in D:directory. ");
			e.printStackTrace();
		}

	}

}
