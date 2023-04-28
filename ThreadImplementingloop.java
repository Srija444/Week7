package MultiThreadPractice;
import java.util.*;
public class ThreadImplementingloop implements Runnable {
public void run() {
	System.out.println("thread "+Thread.currentThread().getId());
}
	public static void main(String[] args) {
		ThreadImplementingloop loop =new ThreadImplementingloop();
		for(int i=0;i<7;i++) {
		
		Thread p=new Thread(loop);
		p.start();
	}
	}

}
