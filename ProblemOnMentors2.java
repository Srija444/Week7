package GrandTest;
import java.io.*;
public class ProblemOnMentors2 {
/*Write a Java program to read data from Tech_mentors_details.txt, softskills_mentors_details and store in to Mentors_details.txt file using BufferedReader and BufferedWriter classes.*/
	public static void main(String[] args) {
		String techMFile = "Tech_mentors_details.txt";
        String softSkillsMFile = "softskills_mentors_details.txt";
        String mentorDetailsFile = "Mentors_details.txt";

        try {
            BufferedReader techMReader = new BufferedReader(new FileReader(techMFile));
            BufferedReader softSkillsMReader = new BufferedReader(new FileReader(softSkillsMFile));
            BufferedWriter mentorDetailsWriter = new BufferedWriter(new FileWriter(mentorDetailsFile));

            String line;

            
            while ((line = techMReader.readLine()) != null) {
            	
                mentorDetailsWriter.write(line);
                mentorDetailsWriter.newLine();
            }

            
            while ((line = softSkillsMReader.readLine()) != null) {
            	
                mentorDetailsWriter.write(line);
                mentorDetailsWriter.newLine();
            }

            
            techMReader.close();
            softSkillsMReader.close();
            mentorDetailsWriter.close();

            System.out.println("Mentors details stored in: " + mentorDetailsFile);

        } catch (IOException e) {
            System.out.println("Error reading or writing file: ");
        }

	}
	}


