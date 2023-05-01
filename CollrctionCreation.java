package practiceoncollections;
import java.util.*;
public class CollrctionCreation {

	public static void main(String[] args) {
		// It only stores 30 values
int arr[]=new int[30];
//collection concept it is dynamic in size increasing or decreasing
//I didn't give any size. Then how many values wil it store
  //1000 elements into arraylist --> 999 elemnts
  //1 elemnet left.
  //When i declare collection object. What is it size
ArrayList<String> str=new ArrayList<String>();
str.add("srija");
str.add(0,"hii");
str.add("how are u");
System.out.println(str);
str.add("good morning");//what is the size here is 2
str.add("good night");// size -2
str.add("good afternoon"); //size -4
str.add("u r good");// size -4 
str.add("happy smile");//size -8
System.out.println(str);

	}

}
