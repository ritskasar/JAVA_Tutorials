import java.util.*;
class Function1
{
	public static void printMyName(String name)
	{
		System.out.println(name);
		return;
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.next();


        printMyName(name);      //function call
	}

}