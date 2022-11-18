import java.util.*;
class FactorialFunction
{
	public static void Factorial(int n)
	{
		if(n<0)
		{
			System.out.println("Invalid Number");
			return;
		}
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		return;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = in.nextInt();

		Factorial(n);
	}

}