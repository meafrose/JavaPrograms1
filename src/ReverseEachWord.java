
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="Reverse each word";
         String[] word=str.split(" ");
         String reverseString="";
         for(String w:word) //extracting each word
         {
             String reverseWord="";
             for(int i=w.length()-1; i>=0; i--) //reverse each word
             {
                 reverseWord=reverseWord+w.charAt(i);
             }
             reverseString=reverseString+reverseWord+" ";
         }
         System.out.println(reverseString);

	}

}
