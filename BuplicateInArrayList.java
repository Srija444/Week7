package practiceoncollections;
import java.util.*;
//adding duplicates
public class BuplicateInArrayList {

	public static void main(String[] args) {
		int arr[]=new int[2];//integer type data
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(10);
		ar.add(20);
		System.out.println(ar);
		for(Integer in:ar) {
			System.out.println(in);
		}
	}

}
