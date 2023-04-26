package filesPractice;
import java.util.*;
import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("data.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
