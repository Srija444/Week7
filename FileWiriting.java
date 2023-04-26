package filesPractice;
import java.io.*;

public class FileWiriting {

	public static void main(String[] args) {
		try {
			FileWriter fr=new FileWriter("data.txt");
			fr.write("i want to practice more to become java backend developer ");
			fr.close();
			System.out.println("successfully written in file");
		}
		catch(java.io.IOException p) {
			System.out.println(p);
			p.printStackTrace();
		}
		
	}

}
