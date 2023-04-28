package MultiThreadPractice;
import java.io.*;
import java.util.*;
public class ThreadLoopID extends Thread {
public void run() {
	System.out.println("the thread "+Thread.currentThread().getId());
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many threads id's u want");

		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			ThreadLoopID id=new ThreadLoopID();
			id.start();
			}
		

	}

}
