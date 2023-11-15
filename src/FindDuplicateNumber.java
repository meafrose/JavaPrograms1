
public class FindDuplicateNumber {

	public static void main(String[] args)
	{
		int a[]= {3,7,7,9,9,0,1};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
