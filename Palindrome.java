import java.util.*;
class Palindrome
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);

		int n , i , rev =0 , temp;

		System.out.println("Enter any number");
		n=in.nextInt();

		temp=n;

		while(n!=0)
		{
			i=n%10;
			rev=rev*10+i;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		System.out.println("Number is not Palindrome");

	}
}