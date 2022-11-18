import java.util.*;
class Function2
{
	public static int Addition(int a,int b)
	{
		int sum = a+b;
		return(sum);
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter any two number");
		int a = in.nextInt();
		int b = in.nextInt();

		int sum = Addition(a,b);
		System.out.println("Sum of 2 Numbers is : " +sum);
	}
}