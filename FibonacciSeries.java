import java.util.*;
class FibonacciSeries
{
	public static void FibonaccciFuncn(int n)
	{
		int a=0,b=1;
		System.out.println(a +" ");
		for(int i=1;i<=n;i++)
		{

			System.out.println(b +" ");

			int temp=b;
			b=a+b;
			a=temp;

		}

		return;
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter limit for fibonacci series");
		int n=in.nextInt();

		FibonaccciFuncn(n);


	}
}
