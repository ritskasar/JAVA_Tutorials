import java.util.*;
class primeFunction
{
	public static void primeOrNot(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not prime");

			    break;
			}
		}

		if(n==i)
		{
			System.out.println("Number is prime");
		}

		return;
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter any number");

		int n = in.nextInt();

		primeOrNot(n);

	}
}