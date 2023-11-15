
public class SwapTwoString {

	public static void main(String[] args)
	{
		String a="Hello";
		String b="World";
		
		System.out.println("before swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
		
		//append a and b
		a=a+b;
		
		//store initial value of a into b
		b=a.substring(0, a.length()-b.length());
		
		//store initial value of b into a
		a=a.substring(b.length());
		
		System.out.println("value of a and b after swapping");
		
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);

	}

}
