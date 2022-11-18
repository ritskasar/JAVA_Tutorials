import java.util.*;
class PatternPro1
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int i, j, n=5, m=4;
		//System.out.println("Enter row limit");
		//n=in.nextInt();
		//System.out.println("Enter column limit");
		//m=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}