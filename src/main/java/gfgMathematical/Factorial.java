package gfgMathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		System.out.println("Enter number for factorial");
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		int number =Integer.parseInt(br.readLine());
		int factorialValue=new Factorial().findFactorial(number);
		System.out.println(factorialValue);
		
	}
	
	public int findFactorial(int val) 
	{
	int fact=1;	
		for (int i=1;i<=val;i++) 
		{
			fact*=i;
			
		}
		
		return fact;
	}

}
