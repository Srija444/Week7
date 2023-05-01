package practiceoncollections;
import java.util.*;
public class HeteroginiousCollectionData {

	public static void main(String[] args) {
		
int arr[]=new int[5];//integer type data
ArrayList yes=new ArrayList();
yes.add(10);
yes.add(20);
yes.add(30);
yes.add(40);
yes.add(50);
System.out.println(yes);
Iterator itr=yes.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
