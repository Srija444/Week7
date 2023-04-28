package MultiThreadPractice;
import java.util.*;
class TellAbout{
	synchronized void Tell(String name) {
		while(true) {
			System.out.println("i'm srija");
			System.out.println("i'm from hyd");
			System.out.println("nice to meet you");
			System.out.println("--------------");
			break;
		}
		
	}
}

class T1 extends Thread{
	TellAbout ab;
	T1(TellAbout ab){
		this.ab=ab;
	}
	public void run() {
	ab.Tell(getName());
	}
}

class T2 extends Thread{
	TellAbout ab;
	T2(TellAbout ab){
		this.ab=ab;
		
	}
	public void run() {
		ab.Tell(getName());
	}
}
class Synchronizingone{
public static void main(String args[]) {
	TellAbout ab=new TellAbout();
	T1 ta=new T1(ab);
	T2 taa=new T2(ab);
	ta.start();
	taa.start();
}
}

