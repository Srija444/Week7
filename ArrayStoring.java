package practiceoncollections;
import java.util.*;
public class ArrayStoring {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<Integer>();
		System.out.println("enter array size");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		
		for( int i=0;i<arr.length;i++) {
			
			System.out.println("enter element :" +(i+1));
			arr[i]=s.nextInt();
	    
		if (arr[i] >= 100 && arr[i] <= 999 && isPalindrome(arr[i])) {
            ai.add(arr[i]);
		}
		}
    System.out.println("the palindrome number is"+ai);
    for(Integer in:ai) {
    	System.out.println(in);
    }
	
        }

	    public static boolean isPalindrome(int n) {
	        int temp = n, rev = 0;
	        while (temp != 0) {
	            int rem = temp % 10;
	            rev = rev * 10 + rem;
	            temp = temp / 10;
	        }
	        return (n == rev);
	    }

}
