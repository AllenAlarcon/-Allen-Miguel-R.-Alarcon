package iteration;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare and initialize
		
	int [][] arrayOfIn = {
			
			{16,70,23,60} ,
			{55,80,45,10} ,
			{67,69,42,21} ,
			{29,11,89,90}
	        };
	
	   //outer loop
	for(int x = 0; x<arrayOfIn.length;x++) {
		for (int y = 0; y<arrayOfIn[x].length;y++) {
			System.out.print(arrayOfIn[x][y] + " ");
		}
		System.out.println();
	}//end of outer for
            
	
	
	
	}//end of main method

}//end of class
