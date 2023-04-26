package filesPractice;
import java.io.*;
public class FilePrintWriter {

	public static void main(String[] args) {
		
try {
	PrintWriter obj=new PrintWriter("data.txt");
	obj.print("hi");
	obj.print("\nhello");
	obj.flush();
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println("done");
	}

}
