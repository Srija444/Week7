package practiceoncollections;
import java.util.*;
public class RemoveLastElementInArrayUsingArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> ai=new ArrayList<Integer>();
	Scanner s=new Scanner(System.in);
	System.out.println("enter array size: ");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("enter array elements: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
		ai.add(arr[i]);
	}
ai.remove(n-1);
System.out.println("the elements are: "+ai);
for(int ele:ai) {
	System.out.println(ele);
}
	}

}
