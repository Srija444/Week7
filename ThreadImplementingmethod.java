package MultiThreadPractice;

public class ThreadImplementingmethod implements Runnable{
public void run() {
	System.out.println("hi hello");
}
	public static void main(String[] args) {
		
		ThreadImplementingmethod tp=new ThreadImplementingmethod();
		Thread t=new Thread(tp);
		t.start();
	}

}
