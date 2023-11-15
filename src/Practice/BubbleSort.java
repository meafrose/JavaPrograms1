package Practice;

import java.util.ArrayList;
//import java.util.HashSet;

//import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,4,4,5};
		ArrayList<Integer> removeDuplicate=new ArrayList<>();
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				removeDuplicate.add(a[i]);
			}
		}
		removeDuplicate.add(a[a.length-1]);
		System.out.println(removeDuplicate);
	}
}
