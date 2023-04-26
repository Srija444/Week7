package GrandTest;
import java.io.*;
import java.io.File;

public class ProblemOnMentors {
	
	public static void main(String[] args) {
		
	
/*Write a Java program to read data from Tech_mentors_details.txt, softskills_mentors_details and store in to Mentors_details.txt file using BufferedReader and BufferedWriter classes.*/
try{
	File f=new File("Tech_mentors_details.txt");
	if(f.createNewFile()) {
		System.out.println("the file created successfully: "+f.getName());
		
	}else {
		System.out.println("already exists");
	}
}
catch(Exception e){
	System.out.println(e);
}


	}



}
