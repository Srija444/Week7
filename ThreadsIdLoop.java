package threads;
import java.util.*;
public class ThreadsIdLoop extends Thread {
public void run() {
	System.out.println("the thread "+Thread.currentThread().getId());
	
}
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			ThreadsIdLoop thi=new ThreadsIdLoop();
			thi.start();
		}

	}

}
