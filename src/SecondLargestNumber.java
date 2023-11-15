import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args)
	{
		int a[]= {3,4,5,2,1,8,9};
		int temp;
		int size=a.length;
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
                        if(i==1)
                        {
                            break;
                        }

		}
		System.out.println(Arrays.toString(a)); //sorted Array
		System.out.println("Second largest Array:"+a[1]);
	}

}
