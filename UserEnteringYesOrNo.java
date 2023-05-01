package practiceoncollections;
import java.util.*;

public class UserEnteringYesOrNo {
	
	
	  public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);

	 

	    ArrayList<Integer> al=new ArrayList<Integer>();

	

	    char b='Y';
	    while(b=='Y'){
	      System.out.println("Enter the elements: ");
	        int c=sc.nextInt();
	        al.add(c);
	      System.out.println("you want continue to add or not(Type only Y for yes and N for No)");
	      b=sc.next().charAt(0);
	        
	      }
	    
	    
	    System.out.println("After adding the elements: ");
	    for(Integer o:al){
	      System.out.println(o);
	    }
	    
	  }
	}