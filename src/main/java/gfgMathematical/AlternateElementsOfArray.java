package gfgMathematical;

public class AlternateElementsOfArray {
	

	public static void main(String[]args) {
		int[]a= {1,2,3,4,5,6};
		AlternateElementsOfArray.print(a,a.length);
		

}
	
	public static void print(int arr[], int n)
    {
       int i=0;
		while(i<n) 
		{
			System.out.print(arr[i]+ " ");
			i=i+2;
		}
    }
	
}	
