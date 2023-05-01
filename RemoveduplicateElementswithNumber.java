package practiceoncollections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveduplicateElementswithNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer>ai=new ArrayList<Integer>();
		ArrayList<Integer>duplicates=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			ai.add(arr[i]);
			
		}
		  for (int i = 0; i < ai.size(); i++) {
	            int count = 0;
	            for (int j = 0; j < ai.size(); j++) {
	                if (ai.get(i) == ai.get(j)) {
	                    count++;
	                }
	            }
	            if (count > 1 && !duplicates.contains(ai.get(i))) {
	                duplicates.add(ai.get(i));
	                System.out.println("Element " + ai.get(i) + " occurs " + count + " times");
	            }
	        }
	}

}
