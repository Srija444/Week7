package filesPractice;
import java.io.*;
public class FileBufferReader {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("data.txt");
			BufferedReader br=new BufferedReader(fr);
			int i=0;
			while((i=br.read())!=-1) {
				System.out.print((char)i);
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
