package practiceoncollections;
import java.util.*;
public class AllElementsOccurancesIndividuallyUsingArrayList {

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
		int count[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			int ele=arr[i];
			int occranceCount=1;
			for(int j=i+1;j<arr.length;j++) {
				if(ele==arr[j]) {
					occranceCount++;
				}
			}
			count[i]=occranceCount;
	}
		System.out.println("the occurance count of each element is: ");
		for(int i=0;i<arr.length;i++) {
			if(count[i]==-1) {
				continue;
			}
			int ele=arr[i];
			int occranceCount=count[i];
			System.out.println(ele+" occurs "+occranceCount+" times.");
			for(int j=i+1;j<arr.length;j++) {
				if(ele==arr[j]) {
					count[j]=-1;
			}
				
				
			}
		}
	}

}
