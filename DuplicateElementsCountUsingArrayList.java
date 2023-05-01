package practiceoncollections;
import java.util.*;
public class DuplicateElementsCountUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>ai=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("entre array size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("entre array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			ai.add(arr[i]);
		}
			
			int count=0;
			for(int i=0;i<ai.size();i++) {
				for(int j=i+1;j<ai.size();j++) {
					if(ai.get(i).equals(ai.get(j))) {
						count++;
						break;
					}
				}
			}
			System.out.println("duplicate elements count: "+count);

	}

}
