import java.util.*;
class Table
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number" );
		int n = in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*n);
		}
	}
}