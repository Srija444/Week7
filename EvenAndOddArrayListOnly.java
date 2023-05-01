package practiceoncollections;
import java.util.*;
public class EvenAndOddArrayListOnly {

	public static void main(String[] args) {
		ArrayList<Integer> yes=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter u r number");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("the num is even"+num);
		}else {
			System.out.println("the num is odd");
		}

	}

}
