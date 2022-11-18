import java.util.*;
class OppositePyramid
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		int i,j,n;
		System.out.println("Enter any number for pyramid");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
			System.out.print(" ");
		    }

		    for(j=1;j<=i;j++)
		    {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}