package Practice;


import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachChar{

     public static void main(String []args){
      String s="hello";
      char[] ch=s.toCharArray();
      Map<Character, Integer> map=new HashMap<Character, Integer>();
      for(char c:ch)
      {
    	  if(!map.containsKey(c))
    	  {
    		  map.put(c,1);
    	  }
    	  else
    	  {
    		  int value=map.get(c);
    		  map.put(c,value+1);
    	  }
      }
      System.out.println(map);
     }
}