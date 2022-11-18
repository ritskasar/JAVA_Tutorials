import java.util.*;
class SumOfNo
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,n,sum=0;
		System.out.println("Enter any Number");
		n=in.nextInt();
		while(n!=0)
		{

			i=n%10;
			sum = sum + i;
			n = n/10;

		}

		System.out.println("Sum of Numbers : "+sum);
	}
}