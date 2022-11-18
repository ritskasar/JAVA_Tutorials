import java.util.*;
class Matrix
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,m,n;
		System.out.println("Enter numbers for matrix row");
		m=in.nextInt();
		System.out.println("Enter numbers for matrix column");
		n=in.nextInt();

		for(i=1;i<3;i++)
		{
			for(j=1;j<3;j++)
			{
				System.out.print(m + " ");
			}

			System.out.println(n +" ");
		}

	}
}
