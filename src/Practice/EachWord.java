package Practice;

public class EachWord {

	public static void main(String[] args)
	{
		String s="Reverse each word";
		String[] word=s.split("");
		String wholeString="";
		for(String w:word)
		{
			String reverseString="";
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseString=reverseString+w.charAt(i);
			}
			wholeString=reverseString+wholeString;
		}
		System.out.println(wholeString);
	}
}

	

	