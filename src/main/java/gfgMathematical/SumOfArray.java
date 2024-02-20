package gfgMathematical;

public class SumOfArray {

	public static void main(String[]args) 
	{
		int[]a = {1, 2, 3, 4, 5, 6 };

		int sum=new SumOfArray().sum(a, a.length);

		System.out.println("Sum :"+sum);

	}

	int sum(int arr[], int n) {
	int Sum=0;
	
		for(int i=0;i<n;i++) 
		{
			Sum+=arr[i];
		}

		return Sum;
		// code here
	}

}
