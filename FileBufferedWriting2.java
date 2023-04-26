package filesPractice;
import java.io.*;

public class FileBufferedWriting2 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
			bw.append("what should i do!..");
			
		}
		catch(IOException e){
			System.out.println(e);
			e.printStackTrace();
			
		}

	}

}
