import java.util.*;
class tableFunction
{
	public static int Table(int n)
	{
		int i,table=1;

		for(i=1;i<=10;i++)
		{
			table=i*n;
			System.out.println(table);
		}

		return(table);

	}

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");

		int n = in.nextInt();
		System.out.println("Table of number : " +n);

		Table(n);


	}
}