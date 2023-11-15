
import java.util.Arrays;

public class MoveNegativeNumbersInStartofArray {

	public static void main(String[] args)
	{
		int arr[]= {2,3,5,-1,-2,8,9};
		int j=0;
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
