package Practice;
//import java.util.Arrays;
//import java.util.Arrays;
//import java.util.HashSet;

public class Common {

	public static void main(String[] args)
	{
		int a[]= {4,4,5,5,6,3};
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}
	}
			
		}
	
