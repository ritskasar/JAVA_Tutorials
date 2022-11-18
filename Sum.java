import java.util.*;
class Sum
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int i, n, sum=0;
		System.out.println("Enter any number");
		n=in.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}