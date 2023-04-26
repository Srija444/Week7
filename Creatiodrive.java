package GrandTest;
import java.io.*;
public class Creatiodrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
File f=new File("creatingdrive.txt");
if(f.createNewFile()) {
	System.out.println("successfully done cretion");
}else {
	System.out.println("already exists");
}
	}
		catch(IOException e) {
			System.out.println(e);
		}

}
}
