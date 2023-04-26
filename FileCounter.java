package GrandTest;
import java.io.FileReader;
import java.io.IOException;
public class FileCounter {
	

	
	    public static void main(String[] args) {
	        try {
	            FileReader fr = new FileReader("abc.txt");
	            int c;
	            int spaces = 0, alphabets = 0, digits = 0, specialChars = 0;
	            
	            while ((c = fr.read()) != -1) {
	                char character = (char) c;
	                
	                if (Character.isWhitespace(character)) {
	                    spaces++;
	                } else if (Character.isLetter(character)) {
	                    alphabets++;
	                } else if (Character.isDigit(character)) {
	                    digits++;
	                } else {
	                    specialChars++;
	                }
	            }
	            
	            fr.close();
	            
	            System.out.println("Spaces: " + spaces);
	            System.out.println("Alphabets: " + alphabets);
	            System.out.println("Digits: " + digits);
	            System.out.println("Special characters: " + specialChars);
	        } catch (IOException e) {
	           System.out.println(e);
	        }
	    }
	}

