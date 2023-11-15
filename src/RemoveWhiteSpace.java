
public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String s=" hello there    Meher";
		String str=s.replaceAll("\\s","");
		System.out.println(str);

	}

}
