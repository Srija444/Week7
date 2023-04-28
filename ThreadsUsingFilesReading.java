package threads;
import java.io.*;
public class ThreadsUsingFilesReading extends Thread {
	
    public void run() {
	try {
		BufferedReader br=new BufferedReader(new FileReader("studentdetails.txt"));
		String line=null;
		while((line=br.readLine())!=null) {
			br.read();
			System.out.println(line);
		}
		

	}
	
		catch(IOException d) {
			System.out.println(d);
		}
    }
	public static void main(String[] args) {
		
		ThreadsUsingFilesReading fru=new ThreadsUsingFilesReading();
		fru.start();
		try {
			fru.join();
		BufferedReader br=new BufferedReader(new FileReader("employeedetails.txt"));
		String line=null;
		while((line=br.readLine())!=null) {
			br.read();
			System.out.println(line);
			
		}
		
		br.close();
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
}
}
