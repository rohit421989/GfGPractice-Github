package gfgMathematical;

import java.util.Scanner;

public class GenericCheck {
	
		  void demofunction(double j)
		    {
		        if (j < 9)
		 
		            // return statement below(only using
		            // return statement and not returning
		            // anything):
		            // control exits the method if this
		            // condition(i.e, j<9) is true.
		            return;
		        ++j;
		    }
		 
		    // Method 2
		    // Main driver method
		    public static void main(String[] args)
		    {
		    	GenericCheck gfg = new GenericCheck();
		        // Calling above method declared in above class
		        gfg.demofunction(15.5);
		 
		        // Display message on console to illustrate
		        // successful execution of program
		        System.out.println("Program executed successfully");
		    }
		
}
