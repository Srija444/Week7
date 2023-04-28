package MultiThreadPractice;
import java.io.*;

public class GettingThreadId extends Thread {
public void run() {
	System.out.println("the thread "+Thread.currentThread().getId());
}
	public static void main(String[] args) {
		GettingThreadId gth=new GettingThreadId();
		gth.start();

	}

}
