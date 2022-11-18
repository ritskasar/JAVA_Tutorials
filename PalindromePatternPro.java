import java.util.*;
class PalindromePatternPro
{
	public static void main( String [] args)
	{
		Scanner in = new Scanner (System.in);
		int i , j, n;
		System.out.println("Enter any number");
		 n=in.nextInt();
		 for(i=1;i<=n;i++)
		 {
			 for(j=1;j<=n-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(j=i;j>=1;j--)
			 {
				 System.out.print(j +"");
			 }
			 for(j=2;j<=i;j++)
			 {
				 System.out.print(j +"");
			 }

			 System.out.println();
		 }
	}
}