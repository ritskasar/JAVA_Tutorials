import java.util.*;
class NumberPyramid
{
	public static void main(String [] args)
	{
		int i , j, n=5,num=1;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=n-i;j++)
			{
				System.out.print(num +" ");
			}

			System.out.println();
			num++;
		}
	}
}