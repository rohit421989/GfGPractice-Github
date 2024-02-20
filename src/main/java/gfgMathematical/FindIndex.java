package gfgMathematical;
/*Given an unsorted array arr[] of n integers and a key which is present in this array. 
 You need to write a program to find the start index( index where the element is first 
 found from left in the array ) and end index( index where the element is first found 
 from right in the array ).(0 based indexing is used)If the key does not exist in the array
  then return -1 for both start and end index in this case.*/

public class FindIndex 
{

	public static void main(String[]args) 
	{
		int[]a = {1, 2, 3, 4, 5, 6 };

		int[] indexes=FindIndex.findIndexStart_End(a, a.length,8);

		System.out.println("Start Index :"+indexes[0]+" "+"End Index :"+indexes[1]);

	}

	static int[] findIndexStart_End(int arr[], int n, int key) 
	{ 
		int startIndex,endIndex=0;
		int[]sendValues= {-1,-1};
		for(int i=0;i<n;i++) 
		{
			if(arr[i]==key) 
			{
				startIndex=i;
				sendValues[0]=startIndex;
				break;
			}
		}

		for(int j=n-1;j>=0;j--) 
		{
			if(arr[j]==key) 
			{
				endIndex=j;
				sendValues[1]=endIndex;
				break;
			}

		}
		return sendValues;

	}
	

}
