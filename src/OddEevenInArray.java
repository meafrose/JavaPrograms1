
public class OddEevenInArray {

	public static void main(String[] args)
	{
		int arr[]= {3,4,5,6,7};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("odd number:"+arr[i]+" ");
			}
		}
		System.out.println("even number:");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}