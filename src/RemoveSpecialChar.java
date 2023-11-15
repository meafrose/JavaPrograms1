
public class RemoveSpecialChar {

	public static void main(String[] args)
	{
		String s="Meher@123#";
		s=s.replaceAll("[^a-zA-z0-9]","");
		System.out.println(s);

	}

}
