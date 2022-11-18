import java.util.*;
class CircumferenceFunction
{
	public static double CircumferenceCircle(float radii)
	{
		double CircumCircle=2*3.14*radii;
		System.out.println("Circumference of Circle = " +CircumCircle);

		return(CircumCircle);
	}
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of circle");

		float radii = in.nextFloat();

		CircumferenceCircle(radii);
	}
}