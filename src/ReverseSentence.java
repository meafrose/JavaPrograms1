
public class ReverseSentence {

	public static void main(String[] args)
	{
		String s="name my is Meher";
		String word[]=s.split(" ");
		for(int i=word.length-1; i>=0; i--)
		{ 
			System.out.print(word[i]+" ");
		}
		
	}
}