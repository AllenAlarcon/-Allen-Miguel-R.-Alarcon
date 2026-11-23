package MyProject;

import java.io.IOException;

public class StringReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Line one\nLine two\nLine three";
		try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.StringReader(text))) {
		 String line;
		 while ((line = br.readLine()) != null) {
		 System.out.println(line);
		 }
		} catch (IOException e) {
		 e.printStackTrace();
		}

	}

}
