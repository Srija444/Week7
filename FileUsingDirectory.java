package filesPractice;
import java.io.*;
public class FileUsingDirectory {

	public static void main(String[] args) {
		try {
			File f=new File("D:/Drive");
			//use double forward slashes or use one backward slash
			if(f.createNewFile()) {
				System.out.println("successfully created"+f.getName());
				
			}else {
				System.out.println("file already exists");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
