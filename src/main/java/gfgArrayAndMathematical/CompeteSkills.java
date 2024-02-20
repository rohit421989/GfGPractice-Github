package gfgArrayAndMathematical;

public class CompeteSkills {
	int ca,cb;
	public static void main(String[]args) 
	{
		long [] a= {4, 2, 7};
		long [] b= {5, 6, 7};
		new CompeteSkills().scores(a, b);
	}
	
	public void scores(long a[], long b[]) {
		CompeteSkills obj=new CompeteSkills();
        int ca=0,cb=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<=i;j++)
            {
             if(a[i]>b[j])
             ca=ca+1;
             else if (a[i]<b[j])
             cb=cb+1;
//             else
//             {
//             ca=ca;
//             cb=cb;
//             }
            }
        }
        // System.out.println(ca+"  "+cb);
        // store the answer as
       this.ca=ca;
       this.cb=cb;
       System.out.println(ca+" "+cb);
        // Your code goes here
    }
}
