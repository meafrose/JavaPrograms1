
public class CapitalizeFirstLetter {

	public static void main(String[] args)
	{
		String s="My name is Meher";
		String[] arr=s.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			//String word=(arr[i]+" "); // get each word
			
			 char c=arr[i].charAt(0); //get first letter of each word
			 //System.out.println("first letter of each word:"+c);
			
			String s1=String.valueOf(c).toUpperCase(); //first convert String then convert UpperCase
			
			System.out.print(s1+" ");
		}

	}

}
