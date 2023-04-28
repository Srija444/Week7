package threads;
import java.io.*;
public class ThreadIdGets extends Thread {
public void run() {
	System.out.println("the thread "+Thread.currentThread().getId()+" is running");
}
	public static void main(String[] args) {
		ThreadIdGets ti=new ThreadIdGets();
		ti.start();

	}

}
