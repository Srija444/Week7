package filesPractice;
import java.io.*;
public class FileBufferedReading2 {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
