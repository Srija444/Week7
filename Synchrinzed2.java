package MultiThreadPractice;
public class Synchrinzed2{
	public static void main(String[] args) {
		String name="good";
		String name2="bad";
		Thread t=new Thread() {
			public void run() {
				synchronized (name) {
					System.out.println("my name is srija");
					synchronized (name2) {
						System.out.println("my name is srinija");
					}
				}
			}
		};
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (name2) {
					System.out.println("my name is srinija");
					synchronized (name) {
						System.out.println("my name is srija");
					}
				}
			}
		};
		t.start();
		t1.start();
		
	}
}
