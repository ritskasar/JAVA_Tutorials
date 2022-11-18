import java.util.*;
class voteProFunction
{
	public static void ToVote(int n)
	{
		if(n>18)
		{
			System.out.println("You are eligible for vote.");
		}else{
			System.out.println("You are not eligible for vote.");
		}
		return;
	}
	public static void main(String[]args)
	{
		Scanner in =new Scanner (System.in);
		System.out.println("Enter your age");

		int n = in.nextInt();

		ToVote(n);
	}
}