import java.util.*;
class PascalsTriangle
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n,num=0;
		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i==1||j==1||i==j)
				{
					System.out.print("1" +" ");
				}else
				{
					System.out.print(num +" ");

				}

			}
			System.out.println();
             num++;

		}
	}
}


