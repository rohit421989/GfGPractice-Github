package gfgMathematical;

public class GCDofArray {
	
/**
 * Important Note: Finding HCF/ GCD is based on Euclidean algorithm 
 * Link : https://www.youtube.com/watch?v=yHwneN6zJmU
 * This concept can be implemented for an array of element as well
 * Also note that gcd(a,b,c)=gcd(gcd(a,b),c))
 * 
 * */	
	
	public static void main (String[]args) 
	{
		int []a= {13,20,30,40,50};
		int hcf= gcdArray(a,a.length);
		System.out.println(hcf);
		
		
	}
	public static int gcdArray(int[]arr, int n)
	{
		int result=arr[0];
		for(int i=1;i<n;i++) 
		{
		result=	gcd(result,arr[1]);
			
		}
		return result;
	}
		
	public static int gcd(int val1, int val2)
		{
			
			if (val2==0)
				return val1;
			else
				return gcd(val2,val1%val2);
				
			
		}
	
	
	
	
	} 



