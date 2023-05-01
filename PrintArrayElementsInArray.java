package practiceoncollections;
import java.util.*;
public class PrintArrayElementsInArray {

	public static void main(String[] args) {
		ArrayList ai=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
			for(int j=0;j<arr.length;j++) {
				ai.add(arr[j]);
			}
		
		System.out.println("the elements in array are: "+ai);
		
		
	}

}
