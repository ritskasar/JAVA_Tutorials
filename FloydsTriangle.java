import java.util.*;
class FloydsTriangle
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n, num=1;

		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{

				System.out.print(num +" ");
				num++;
			}

		    System.out.println();
		}
	}
}