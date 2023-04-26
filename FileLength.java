package filesPractice;
import java.io.*;
public class FileLength {

	public static void main(String[] args) {
		try {
			File f=new File("D:\\Drive/magic.txt");
			System.out.println(f.length());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
