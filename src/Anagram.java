import java.util.Arrays;

public class Anagram {
	
	/*public static boolean isAnagram(String s1, String s2)
	{
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
	}*/

	public static void main(String[] args)
	{
		String s1="cat";
		String s2="ACT";
		
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String st1=new String(c1);
		String st2=new String(c2);
		
		if(st1.equals(st2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	
	}

}
