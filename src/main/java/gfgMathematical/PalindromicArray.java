package gfgMathematical;

public class PalindromicArray {

	public static void main(String[]args) {
		int[]a= {1001,2002,3103,5005,6006};
		int i=palinArray(a,a.length);
		if (i==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}


	public static int palinArray(int[] a, int n)
	{
		int []originalNumber=new int[n];
		int []reversedNumber=new int[n];
		for(int i=0;i<n;i++) 
		{

			originalNumber[i]=a[i];			
			while(a[i]!=0) 
			{
				reversedNumber[i]=(reversedNumber[i]*10)+a[i]%10;
				a[i]=a[i]/10;
			}

		}

		for(int j=0;j<n;j++) 
		{
			if(originalNumber[j]!=reversedNumber[j])
				return 0;
		}
		return 1;


	}

}
