package filesPractice;
import java.io.*;
public class FileDeletion {

	public static void main(String[] args) {
		try {
			File f=new File("D:\\Drive/magic.txt");
			System.out.println(f.length());
			if(f.delete()) {
				System.out.println("successfully deleted");
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
