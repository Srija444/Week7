package GrandTest;
import java.io.*;
public class ProblemOnMentors1 {

	public static void main(String[] args) {
		try{
			File f=new File("softskills_mentors_details.txt");
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
