package practiceoncollections;
import java.util.*;
public class RemoveFirstElementInArrayUsingArrayList {

	public static void main(String[] args) {
		
ArrayList ai=new ArrayList();
Scanner s=new Scanner(System.in);
System.out.println("enter array size: ");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("enter array elements: ");
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
	ai.add(arr[i]);
}
ai.remove(0);
System.out.println("the elements are: "+ai);

	}

}
