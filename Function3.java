import java.util.*;
class Function3
{
	public static int Product(int a, int b)
	{
		int mul=a*b;
		return(mul);
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter any two numbers");
		int a=in.nextInt();
		int b=in.nextInt();

		int mul=Product(a,b);
		System.out.println("Product of numbers : " +mul);
	}
}
