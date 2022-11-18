import java.util.*;
class PatternPro3
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);

		int i,j,n;
		System.out.println("Enter any number : ");
		n= in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}