package gfgMathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeanCalculation {
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		System.out.println("Enter number students and their marks");
		
		
	}
	
	 static int mean(int N , int[] A) 
	    {
	        double Sum=0.0,Avg=0.0;
	       for(int i=0;i<A.length;i++)
	       {
	           Sum+=A[i];
	           
	       }
	       Avg=(double)Sum/N;
	        return (int)(Math.floor(Avg));
	    }

}
