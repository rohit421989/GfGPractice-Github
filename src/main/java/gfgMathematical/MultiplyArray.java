package gfgMathematical;

public class MultiplyArray {
	
	public static void main(String[]args) 
	{
		int[]a= {1,2,3,4,5};
		int pVal=MultiplyArray.product(a, a.length);
		System.out.println(pVal);
		
	}



   public static int product(int arr[],int n)
   {
	   int product=1;
	   for(int i=0;i<n;i++)
	  {
        product*=arr[i];
	  }
    
	   return product;
   }
   
}