import java.util.*;
class Divisibility
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		int n , i;
		System.out.println("Enter any number");
		n = in.nextInt();
		for(i=1;i<=100;i++)
		{
			if(i%n==0)
			System.out.println(i);
		}
	}
}