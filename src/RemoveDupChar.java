
public class RemoveDupChar {

	public static void main(String[] args)
	{
		String str="programming";
		
		//Approach-1
		
		/*StringBuilder sb=new StringBuilder(); // to append the characters
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1); //indexOf 'p', 0+1
			if(idx==-1)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb); */
		
		//Approach-2
		
		char[] arr=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<arr.length; i++)
		{
			boolean repeated=false;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					repeated=true;
					break;
				}
			}
			if(!repeated)
			{
				sb.append(arr[i]);
			}
		}
		System.out.println(sb); 
		

	}

}
