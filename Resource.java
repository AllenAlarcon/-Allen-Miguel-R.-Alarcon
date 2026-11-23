package MyProjectWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try (Scanner input = new Scanner(System.in);
				FileWriter myWriter = new FileWriter("src/MyProjectWriter/Product.txt")) {
			//use resource
			
			System.out.println("Product Name Code:");
			String ProductNameCode = input.nextLine();
			
			System.out.println("Product Name:");
			String ProductName = input.nextLine();
			
			System.out.println("Product Price:");
			double ProductPrice = input.nextDouble();
			
			myWriter.write("PRODUCT NAME CODE:" + ProductNameCode + "\n");
			myWriter.write("PRODUCT NAME:" + ProductName + "\n");
			myWriter.write("PRODUCT RPICE:" + ProductPrice + "\n");
			
			System.out.println("DATA IS SAVED!!!");
			
	} catch (FileNotFoundException ex) { 
	    System.out.println("Error: " + ex.getMessage());
	} catch (IOException ex) { 
	    System.out.println(ex.getMessage());
	}
			
		

	}

}
