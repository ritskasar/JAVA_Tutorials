import java.util.*;
class HollowRhombus
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n;
		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}