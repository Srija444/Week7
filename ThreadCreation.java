package threads;
import java.io.*;
public class ThreadCreation extends Thread {
public void run() {
	System.out.println("multi threading example");
	
}
	public static void main(String[] args) {
		ThreadCreation tc=new ThreadCreation();
		tc.start();
	}

}
