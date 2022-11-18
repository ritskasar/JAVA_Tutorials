import java.util.*;
class NumberPyramid2
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n,num=1;
		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{

			for(j=0;j<=n-i;j++)
			{
				System.out.print(num +"");
			}

			System.out.println();
			num++;
		}
	}
}