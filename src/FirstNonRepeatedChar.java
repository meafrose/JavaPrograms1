import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args)
	{
		String str="abbcc";
		String s=str.toLowerCase();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		boolean status=false;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(map.get(ch)==null)
			{
				map.put(ch,1);
			}
			else
			{

				map.put(ch, map.get(ch)+1);
			}
		}
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(map.get(ch)==1)
			{
				System.out.println("First non-repeated char:" + ch);
				status=true;
				break;
			}
		}
		if(!status)
		{
			System.out.println("There is no unique char");
		}

	}

}
