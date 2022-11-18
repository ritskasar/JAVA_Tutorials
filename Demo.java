import java.util.*;
class Demo{

	public static void main(String args[])
	{

	Scanner in = new Scanner(System.in);
	float no1,no2,add,sub,mul,div,total,avg;
	int ch;

	do
	{
       System.out.println("Enter Number 1 and Number 2 : ");
	   	no1=in.nextFloat();
	   	no2=in.nextFloat();

       System.out.println("Enter your choise :\n1.Addition\n2.Substraction \n3.Multiplication \n4.Division \n5.Total \n6.Average");
	   ch=in.nextInt();



	switch(ch)
	 {


			 case 1:
					 add=no1+no2;
					 System.out.println("Addition = "+add);
					 break;

			 case 2:
					 sub=no1+-no2;
					 System.out.println("Substraction = "+sub);
					 break;

			 case 3:
					 mul=no1*no2;
					 System.out.println("Multiplication = "+mul);
					 break;

			 case 4:
					 div=no1/no2;
					 System.out.println("Division = "+div);
					 break;


			 case 5:
					 total=no1+no2;
					 System.out.println("Total = "+total);
					 break;

			 case 6:
					 avg=(no1+no2)/2;
					 System.out.println("Average = "+avg);
					 break;
			default:
					System.out.println("Cannot find case");

             }
		 }while(ch!=0);

	}

}







