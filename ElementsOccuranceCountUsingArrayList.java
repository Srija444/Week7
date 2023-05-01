package practiceoncollections;
import java.util.*;
public class ElementsOccuranceCountUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>ai=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("entre array size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("entre array elements: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			ai.add(arr[i]);
		}
		System.out.println("enter element to be known to occurance: ");
		int n1=s.nextInt();
		for(int i=0;i<arr.length;i++) {
			
			if(n1==arr[i]) {
				count++;
			}
		}
		ai.add(count);
		System.out.println("the occurance of elements is: "+count);

	}

}
