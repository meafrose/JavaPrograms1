
public class ReplaceSpecialChar {

	public static void main(String[] args)
	{
		String s = "Hello^^%#$(!)_+ Meher";
		String str=s.replaceAll("[#$()!_+@]", "");
		System.out.println(str);
	}
}

		
		
		