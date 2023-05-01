package practiceoncollections;
import java.util.*;
public class EvenElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<Integer>();
		for(int i=0;i<4;i++) {
			System.out.println("enter "+(i+1)+" number");
		
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
		     arr.add(a);
		    }
		   
		   
		    
		    System.out.println(arr);
		for(Integer o: arr){
		  if(o%2==0){
		  System.out.println(o);
		  }
		}
		}

	}


