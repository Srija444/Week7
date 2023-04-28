package threads;
import java.io.*;



class Table{
synchronized void printTable(int n) {
	for(int i=1;i<11;i++) {
		System.out.println(n+" * "+i+" = "+n*i);

		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	System.out.println("-------");
}
}

class T1 extends Thread{
	Table table;
	T1(Table table){
	
		this.table=table;
	}
	public void run() {
		table.printTable(4);
	}
}

class T2 extends Thread{
	Table table;
	T2(Table table){
		
		this.table=table;
		
	}
	public void run() {
		
		table.printTable(6);
	}
}
public class Synchronization1method {

	public static void main(String[] args) {
		Table t=new Table();
		T1 obj1=new T1(t);
		T2 obj2=new T2(t);
		
		obj1.start();
		
		obj2.start();

	}
}

