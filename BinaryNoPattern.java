import java.util.*;
class BinaryNoPattern
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i,j,n;
		System.out.println("Enter any Number");
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(1 +" ");
				}else{
					System.out.print(0 +" ");
				}

			}

			System.out.println();
		}
	}
}