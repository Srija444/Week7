package threads;
import java.io.*;
public class ThreadsUsingImplementsLoop implements Runnable {
public void run() {//runnig state
	System.out.println("thread "+Thread.currentThread().getId());
}//dead state
	public static void main(String[] args) {
		ThreadsUsingImplementsLoop loop = new ThreadsUsingImplementsLoop();//new born state
		for(int i=0;i<6;i++) {
			Thread t=new Thread(loop);
			t.start();//runnable state
		}

	}

}
