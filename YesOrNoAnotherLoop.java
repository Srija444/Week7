package practiceoncollections;
import java.util.*;
public class YesOrNoAnotherLoop {

	public static void main(String[] args) {
	ArrayList<Integer> ai=new ArrayList<Integer>();
	
		     
		    Scanner s=new Scanner(System.in);
		       char b;
		         do{
		         System.out.println("Enter the elements: ");
		           int c=s.nextInt();
		           ai.add(c);
		         System.out.println("you want continue to add or not(Type only Y for yes and N for No)");
		         b=s.next().charAt(0);
		           
		         }
		           while(b=='Y');
		       
		       
		       System.out.println("After adding the elements: ");
		       for(Integer o:ai){
		         System.out.println(o);
		       }
		       
		     }
		   }
   
	


