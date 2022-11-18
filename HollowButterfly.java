import java.util.*;
class HollowButterfly
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i, j, n;
		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i==1||j==1||i==j)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}

                int space = 2*(n-i);
				for(j=0;j<=space;j++)
				{
					System.out.print(" ");
				}

				for(j=1;j<=i;j++)
				{
					if(i==1||j==1||i==j)
					{
						System.out.print("*");
					}else
					{
						System.out.print(" ");
					}
				}

			System.out.println();
		}

		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(i==1||j==1||i==j)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}

				int space = 2*(n-i);
				for(j=0;j<=space;j++)
				{
					System.out.print(" ");
				}

				for(j=1;j<=i;j++)
				{
					if(i==1||j==1||i==j)
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
