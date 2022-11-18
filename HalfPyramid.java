import java.util.*;
class HalfPyramid
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n;
		System.out.println("Enter number of row");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}