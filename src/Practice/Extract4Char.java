package Practice;

public class Extract4Char {

	public static void main(String[] args)
	{
		String s="extractLast2Char";
		char ch[]=s.toCharArray();
		int size=ch.length;
		String lastChar="";
		for(int i=size-1; i>size-3; i--)
		{
			lastChar=ch[i]+lastChar;
		}
		System.out.println(lastChar);
	}

}
