import java.util.*;
class PascalsTriangle
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n,num=1;
		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=1;j++)
			{
				System.out.print(num +" ");
			}

			System.out.println();
			num=num*11;


		}
	}
}


