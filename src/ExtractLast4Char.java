
public class ExtractLast4Char {

	public static void main(String[] args)
	{
		String s="extractLast4Character";
        char[] ch=s.toCharArray();
        int size=ch.length;
        String lastChar="";
        for(int i=size-1; i>size-5; i--)
        {
            lastChar=ch[i]+lastChar;
        }
        System.out.println(lastChar);
		// TODO Auto-generated method stub

	}

}
