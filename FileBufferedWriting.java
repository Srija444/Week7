package filesPractice;
import java.io.*;
public class FileBufferedWriting {

	public static void main(String[] args) {
		
try {
	BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
	bw.write("so that i want to practice code day and night ");
	bw.flush();
	}
catch(Exception e) {
	System.out.println(e);
}
	}

}
