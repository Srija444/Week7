package threads;
import java.io.*;
//Implementing runnable interface is the best one. Because we can achieve multiple inheritance.
public class MultithreadsUsingImplementsMethod  implements Runnable{
public void run() {
	System.out.println("thread "+Thread.currentThread().getId());
}
	public static void main(String[] args) {
		
		MultithreadsUsingImplementsMethod muim=new MultithreadsUsingImplementsMethod();
		Thread t=new Thread(muim);
		t.start();

	}

}
