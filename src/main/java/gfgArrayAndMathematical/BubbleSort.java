package gfgArrayAndMathematical;

public class BubbleSort {
	public static void main(String[]args)
	{
		long[]a= {2,8,7,1,5};
		long[] c=new BubbleSort().findElements(a, a.length);
		
		for(int k=0;k<c.length;k++) 
		{
			System.out.println(c[k]);
		}
		
	}
	
	
	public long[] findElements( long a[], long n)
    {
		n=a.length;
		long []b=new long[a.length-2];
		for(int i=0;i<n-1;i++) 
		{
			for(int j=0;j<(n-i-1);j++) {
				if(a[j-1]>a[j]) 
				{
					long c=a[j];
					a[j]=a[j+1];
					a[j+1]=c;
				}
			}
		}
		for(int k=0;k<n-2;k++) 
		{
			b[k]=a[k];
		}
		return b;
    }

}
