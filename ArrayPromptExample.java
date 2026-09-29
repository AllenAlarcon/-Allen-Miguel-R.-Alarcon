package iteration;
import java.util.Scanner;
public class ArrayPromptExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myScanner = new Scanner (System.in);
        
        
        System.out.print ("Enter The Number Old Students: ");
        int n = myScanner.nextInt ();
        myScanner.nextLine();
 
       String [] words = new String[n];
        
  
        System.out.println("Enter " + n + " Old Students.");
        char[][] number;
		for (int i = 0; i < n; i++) {
        System.out.print("Old Students in the past is " + (i + 1) + ": ");
        
        	words [i] = myScanner.nextLine();
  
        	
        } 
        
 
        System.out.print("You Entered Old Students: [");
        for (int i = 0; i < n; i++) {
        	System.out.print(words [i]);
        	if (i < n - 1) {
        		System.out.print(", ");
        	}
        }
            System.out.println("]");
            

            myScanner.close();
        
        
	}//end of main method

}//end of class
