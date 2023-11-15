
public class OnlyNonRepeatingElements {

	public static void main(String[] args) 
	{
		int a[]={4,4,1,2,3,3};
        for(int i=0; i<a.length; i++)
        {
            int x=a[i];
            int count=0;
            for(int j=0; j<a.length; j++)
            {
                if(a[j]==x)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(a[i]);
            }
        }
    }
}


