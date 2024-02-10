package gfgMathematical;

public class AverageInStream {
	public static void main(String[]args) 
	{
//		int Sum=0,Avg=0;
//		int []a= {10,20,30,40,50};
//		int n=a.length;
//		System.out.println("Length of Array : "+n);
//		for (int i=1;i<=n;i++)
//		{
//			Sum+=a[i-1];			
//			Avg=Sum/i;
//			System.out.println(Avg);			
//				
//		}
//			
/*--------------------------------------------------------------------------------- */		
		int []arr1=new int[5];
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		AverageInStream obj=new AverageInStream();
		float[] Avg= obj.streamAvg(arr1, 5);
		for(int i=0;i<Avg.length;i++) {
			System.out.println(Avg[i]);
		}
		
			
	}
	
	 float[] streamAvg(int[] arr, int n) 
	    {
	       float Sum=0;	    
	       float []Avg= new float[n];
			
			for (int i=1;i<=n;i++)
			{
				Sum+=arr[i-1];				
				Avg[i-1]=Sum/i;				
			}	
		   return Avg;
	    }
	

}
