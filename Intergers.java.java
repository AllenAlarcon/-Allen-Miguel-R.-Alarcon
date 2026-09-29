package iteration;

import java.util.Scanner;

public class Intergers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner myScanner = new Scanner (System.in);
        
       
        System.out.print ("Enter The Number Of Element In The Array: ");
        int n = myScanner.nextInt ();
        
 
        int [] number = new int [n];
        
  
        System.out.println("Enter The " + n + " Intergers: ");
        for (int i = 0; i < n; i++) {
        System.out.print("Element at index " + (i + 1) + ": ");
        	number [i] = myScanner.nextInt () ;
        	 
        	
  
        	
        } 
        
 
        System.out.print("You Entered The Following Array: [");
        for (int i = 0; i < n; i++) {
        	System.out.print(number [i]);
        	if (i < n - 1) {
        		System.out.print(", ");
        	}
        }
            System.out.println("]");


            
            myScanner.close();
        

	}//end of main method

}//end of class
