package gfgMathematical;
/**
 * Given an array of size N and you have to tell whether the array is perfect or not. 
 * An array is said to be perfect if its reverse array matches the original array. 
 * If the array is perfect then return True else return False.*/

public class PerfectArray {

	public static void main(String[]args) {
		int[]a= {1,2,3,2,3};
		boolean val=new PerfectArray().IsPerfect(a,a.length);
		System.out.println(val);

	}
//	public boolean IsPerfect(int a[], int n)
//	{
//		int[] originalArray=new int[n];
//		int[] reversedArray=new int[n];
//		int value=0;
//
//		for(int i=0;i<n;i++) 
//		{
//			originalArray[i]=a[i];
//			reversedArray[n-i-1]=a[i];
//		}
//		for (int j=0;j<n;j++) 
//		{
//			if (originalArray[j]==reversedArray[j])
//				value=value+1;
//
//		}
//		if(value==n)
//			return true;
//		else
//			return false;
//
//
//	}
	
	
	
	 //Alternate Solution
	 public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        
        for(int i=0;i<n;i++)
        {
            if(a[i]!=a[n-i-1])
            {
                return false;
            }
        }
		return true;
        
        
    }
	 
}
