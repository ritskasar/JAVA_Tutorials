import java.util.*;
class OddSumFunction
{
	public static void OddSum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
			sum=sum+i;

		    }
		}
		System.out.println("Sum of odd numbers : " +sum);
	}
	public static void main(String []args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter any number");
		int n=in.nextInt();

		OddSum(n);
	}
}