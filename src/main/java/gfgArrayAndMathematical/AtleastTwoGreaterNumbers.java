package gfgArrayAndMathematical;

import java.util.Arrays;

public class AtleastTwoGreaterNumbers {
	public static void main(String[]args) 
	{
		long[]a = {10, 2, 33, 14, 35, 6 };
		

		long[] indexes=new AtleastTwoGreaterNumbers().findElements(a, a.length);
		for(int i=0;i<indexes.length;i++) {
			System.out.println(indexes[i]);
		}

		

	}
	
	 public long[] findElements( long a[], long n)
	    {
	      n=a.length;
			long []b=new long[a.length-2];
			Arrays.sort(a);
			for(int k=0;k<n-2;k++) 
			{
				b[k]=a[k];
			}
			return b;
	    
	    
	    }

}
