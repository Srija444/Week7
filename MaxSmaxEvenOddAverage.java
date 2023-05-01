package practiceoncollections;
import java.util.*;
public class MaxSmaxEvenOddAverage {

	public static void main(String[] args) {
		
ArrayList ai=new ArrayList();
Scanner s=new Scanner(System.in);
int i;


System.out.println("entre array size: ");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("enter array elements: ");
for(i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
int max=arr[0];
int smax=0;
for(i=0;i<arr.length;i++) {
	
	if(arr[i]>max) {
		smax=max;
		max=arr[i];
		
		
	}else if(arr[i]>smax  && arr[i]<max) {
		smax=arr[i];
	}
}


int min=arr[0];
int smin=0;
for(i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		smin=min;
		min=arr[i];
	}else if(arr[i]<smin  && arr[i]<min ) {
		smin=arr[i];
	}
}



int oddCount=0,evenCount=0;

for( i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		evenCount++;
		}
}

for(i=0;i<arr.length;i++) {
	if(arr[i]%2!=0) {
		oddCount++;
	}
}


int sum=0;
for(i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}

int average=0;
for(i=0;i<arr.length;i++) {
	average=sum/arr.length;
}

int evenSum=0,oddSum=0;
for(i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
	evenSum += arr[i];
	}else {
		oddSum += arr[i];
	}
}

ai.add(max);
ai.add(smax);
ai.add(min);
ai.add(smin);
ai.add(evenCount);
ai.add(oddCount);
ai.add(sum);
ai.add(average);
ai.add(evenSum);
ai.add(oddSum);
System.out.println("max elements is: "+max);
System.out.println("second max is: "+smax);
System.out.println("min element is: "+min);
System.out.println("second minimum is: "+smin);
System.out.println("even count is: "+evenCount);
System.out.println("odd count is: "+oddCount);
System.out.println("sum is: "+sum);
System.out.println("average is: "+average);
System.out.println("even sum is: "+evenSum);
System.out.println("odd sum is: "+oddSum);
	}

}
