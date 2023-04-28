package threads;
import java.io.*;


public class Synchronization2 {

	public static void main(String[] args) {
		String resource1="srija";
		String resource2="punna";
		
		
		//thread1
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("thread 1: lockedresouce 1");
					synchronized (resource2) {
						System.out.println("thread 1: locked resouce 2");
					}
				}
			}
		};//annonmus inner class
		
		
		//thread 2
		
		Thread t2=new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("thread 2: locked resouce 1");
					synchronized (resource2) {
						System.out.println("thread 2: locked resource 2");
					}
				}
			}
		};//annonmus inner class
t1.start();
t2.start();
	}

}
