package threads;


	import java.util.Scanner;
	public class ThreadProblemOnSeconds extends Thread{
	public void run() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of seconds: ");
		int seconds=s.nextInt();
		
		while(seconds>0) {
			System.out.println(seconds+"seconds to go..");
			seconds--;
		}
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
		public static void main(String[] args) {
			/*3. Write a program to create a Thread by extending from Thread class. Override run() method and in run()
			method accept number of seconds from user and display countdown time.
			 
			Sample Input:
			Enter Number of seconds: 60
			 
			Expected Output:
			59 seconds to go..
			58 seconds to go..
			57 seconds to go..
			56 seconds to go..*/
			
			ThreadProblemOnSeconds obj=new ThreadProblemOnSeconds();
			obj.start();
		}

	}

