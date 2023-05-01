package practiceoncollections;
import java.util.*;
public class RemoveAllElementsInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>ai=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("entre array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			ai.add(arr[i]);
		}
ai.clear();
System.out.println("the array elements are: "+ai);
	}

}
