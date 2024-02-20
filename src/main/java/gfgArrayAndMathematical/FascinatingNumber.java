package gfgArrayAndMathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FascinatingNumber {

	public static void main(String[]args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		boolean val= new FascinatingNumber().fascinating(i);
		System.out.println(val);
	}



	boolean fascinating(long n) 
	{
		String S=Long.toString((n)+(n*2)+(n*3));
		 char[] digits = S.toCharArray();
	        // Convert the concatenated string to a character array
	        boolean[] seen = new boolean[10];
	        // Array to keep track of whether digits 0-9 have been seen
	        
	        for (char digit : digits) {
	            if (digit == '0' || seen[digit - '0']) {
	                return false; // If the digit is '0' or it's seen before, return false
	            }
	            seen[digit - '0'] = true; // Mark the digit as seen
	        }
	        return true; // If all digits are unique and non-zero, return true
	    }
}