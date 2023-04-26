package filesPractice;
import java.io.*;
public class FileFolderCreationUsingmkdir {

	public static void main(String[] args) {
		try {
			File f=new File("D:\\Drive1/example");
			System.out.println(f.mkdir());
			if(f.exists()) {
				System.out.println("folder successfully created");
			}else {
				System.out.println("folder already exists");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
