import java.util.*;
class PatternPro2
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);

		int i,j,n;
		System.out.println("Enter number of row");
		n=in.nextInt();

		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}