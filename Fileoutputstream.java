package GrandTest;
import java.io.*;
import java.util.Scanner;
public class Fileoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
try {
	FileOutputStream fout=new FileOutputStream("abc.txt");
	System.out.println("enetr some data to store in file");
	String str=s.nextLine();
	//to convert this string into byte
	byte b[]=str.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("data stored successfully");
	
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
