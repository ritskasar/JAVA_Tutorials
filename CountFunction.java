import java.util.*;
class CountFunction
{
	public static void CountNo(int num)
	{

		if(num>0)
		{
			System.out.println("Numbers are positive" +num++);

		}else{
			if(num<0)
			{
				System.out.println("Numbers are negative" +num++);

			}else{

				System.out.println("Number are zero : " +num++);
			}
		}

			return;
	}

	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter 1 to continue and 0 to stop");

		int input = in.nextInt();

		if(input ==1)
		{
			System.out.println("Enter any number : ");
			int num=in.nextInt();
			CountNo(num);
		}else{
			System.out.println("Thank You !!");
		}

	}
}