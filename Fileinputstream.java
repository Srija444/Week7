package GrandTest;
import java.io.*;
public class Fileinputstream {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("data.txt");
			//read() --> you will read data in the 
			// char --->byte  ----->char( To print on the console)
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
