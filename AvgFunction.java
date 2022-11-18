import java.util.*;
class AvgFunction
{
	public static void Average(int a,int b,int c)
	{
		float Avg = (a+b+c)/3;
		System.out.println("Average of given number : " +Avg);

		return;
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter any three number");

		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();

		Average(a,b,c);

	}
}