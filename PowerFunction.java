import java.util.*;
class PowerFunction
{
	public static void PowerNo(int a , int b)
	{
		int power = 1;
		for(int i=1;i<=b;i++)
		{
			power = power * a;
		}

		System.out.println(a +" to the power of " +b +": " +power);
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter number a and number b");
		int a = in.nextInt();
		int b=in.nextInt();

		PowerNo(a,b);

	}
}