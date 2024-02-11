package gfgMathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
	
	public static void main(String[]args) throws NumberFormatException, IOException 
	{
	    System.out.println("Enter number to checkfor Armstrong: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sValue=Integer.parseInt(br.readLine());
		String val= ArmstrongNumber.armStrong(sValue);
		System.out.println(val);
		
	}
	
	public static String armStrong(int val) 
	{
		int originalVal=val,SumOfNumber=0;
		int result=0;
		while(val!=0) {
		result=val%10;
		SumOfNumber=(int)(SumOfNumber+Math.pow(result, 3));
		val=val/10;
		}
		if(originalVal==SumOfNumber)
			return ("This is an Armstrong Number");
		else
			return ("This is not an Armstrong Number");
	}

}
