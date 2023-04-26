package filesPractice;
import java.io.*;
public class FilesList {

	public static void main(String[] args) {
		try {
			File f= new File("D:\\Drive");
			File arr[]=f.listFiles();
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i].getAbsolutePath());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
