package practiceoncollections;
import java.util.*;
public class DuplicateInHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
		for(Integer in:hs) {
			System.out.println(in);
		}

	}

}
