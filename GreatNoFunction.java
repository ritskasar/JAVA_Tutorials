import java.util.*;
class GreatNoFunction
{
	public static void GreaterNo(int n1 , int n2)
	{
		if(n1>n2)
		{
			System.out.println(n1 +" is greater number than " +n2);
		}else{
			System.out.println(n2 +" is greater number than " +n1);
		}

		return;

	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter any two numbers");

		int n1 = in.nextInt();
		int n2 = in.nextInt();

		GreaterNo(n1,n2);
	}
}