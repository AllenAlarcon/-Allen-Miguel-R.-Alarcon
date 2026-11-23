package MyProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileReader myReader = new FileReader("src/MyProject/Acacia.txt")) {
			
				int ch; 
				while ((ch = myReader.read()) != -1) { 
				System.out.print((char) ch); 
				}
		} catch (FileNotFoundException e) { 
		    System.out.println("Error: " + e.getMessage());
		} catch (IOException ex) { 
		    System.out.println(ex.getMessage());
		}
				
	}//end of main method

}//end of class
