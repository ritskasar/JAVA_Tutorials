import java.util.*;
class FeatherPattern2
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner (System.in);
		int i , j, n;                        // Declaration of variables
		System.out.println("Enter any number");
		n=in.nextInt();

		for(i=n;i>=1;i--)                   //outer loop for first part
		{
			for(j=2;j<=i;j++)
			{                               //space for first part
				System.out.print(" ");
			}

			for(j=0;j<=n-i;j++)
			{                              //first part oppo. pyramid
				System.out.print("*");
			}

			for(j=1;j<=2;j++)              //space between two pyramids
			{
				System.out.print("  ");
			}

			for(j=0;j<=n-i;j++)            //first part second pyramid
			{
				System.out.print("*");
			}

			System.out.println();
		}

		/*for(i=1;i<=2;i++)                  //outer loop for middle part
		{

			for(j=1;j<=n;j++)
			{                             //middle part first square shape
				System.out.print("*");
			}

			for(j=1;j<=2;j++)
			{                             //middle part square shape space
				System.out.print("  ");
			}

			for(j=1;j<=n;j++)
			{                             //middle part second square shape
				System.out.print("*");
			}

			System.out.println();
		}*/


		for(i=n;i>=1;i--)
		{                                 //Outer loop for second part

			for(j=1;j<=n-i;j++)
			{                             //space for seconf part
				System.out.print(" ");
			}

			for(j=1;j<=i;j++)
			{                             //second part Invert pyramid
				System.out.print("*");
			}

			for(j=1;j<=2;j++)
			{                             //space between two pyramids
				System.out.print("  ");
			}

			for(j=1;j<=i;j++)
			{                             //second part second invert pyramid
				System.out.print("*");
			}

			System.out.println();
		}
	}
}