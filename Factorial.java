import java.util.*;
class Factorial
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		int i, n, fact=1;
		System.out.println("Enter any number");
		n=in.nextInt();
		for(i=1; i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
}