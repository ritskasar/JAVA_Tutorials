import java.util.*;
class evenFunction
{
	public static void evenOrOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println("Number is even");
		}else{
			System.out.println("Number is odd");
		}
	}

	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = in.nextInt();

		evenOrOdd(n);
	}
}