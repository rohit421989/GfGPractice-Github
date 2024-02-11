package gfgMathematical;

public class GCDofTwoNumbers 
{

	public static void main(String[] args) 
	{
		int val=new GCDofTwoNumbers().gcd(10, 420);
		System.out.println(val);
	}
	
	public int gcd(int A , int B) 
    { 
        while(A!=B)
        {
            if (A>B)
            A=A-B;
            else
            B=B-A;
        }
        return A;

    }
	
}	
