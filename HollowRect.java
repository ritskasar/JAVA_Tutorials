import java.util.*;
class HollowRect
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner (System.in);

		int i,j,n,m;
		System.out.println("Enter number of rows");
		n=in.nextInt();
		System.out.println("Enter number of column");
		m=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				if(i==1||j==1||i==n||j==m)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}