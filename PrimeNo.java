import java.util.*;
class PrimeNo
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,n;
		System.out.println("Enter any Number");
		n=in.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is non-prime number");

					break;
			}
		}

		if(i==n)
		{
			System.out.println("Number is prime number");
		}
	}
}