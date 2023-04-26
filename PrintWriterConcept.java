package GrandTest;
import java.io.IOException;
import java.io.PrintWriter;
public class PrintWriterConcept {
	
	 
	public class WordF {
	  public static void main(String[] args) {
	 
	     try {
	      PrintWriter out=new PrintWriter("abc.txt");
	      out.print("Hi");
	      out.print("hello");
	      out.flush();
	     }
	     catch(IOException e) {
	         System.out.println(e);
	     }
	     System.out.println("done");
	  }
	}
}
