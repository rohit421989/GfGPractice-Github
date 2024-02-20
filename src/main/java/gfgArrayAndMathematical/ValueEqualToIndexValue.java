package gfgArrayAndMathematical;

import java.util.ArrayList;
import java.util.Iterator;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		int []a= {1,3,1,2,9,19};
		ArrayList<Integer>al=new ValueEqualToIndexValue().valueEqualToIndex(a, a.length);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}
	
	 ArrayList<Integer> valueEqualToIndex(int arr[], int n) 
	 {
		 ArrayList <Integer>alr=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==i+1)
				alr.add(i+1);
		}
	        return alr;
	    }

}
