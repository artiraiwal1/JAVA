import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		double l=sc.nextDouble();
		System.out.println("Enter wingth :");
		double b=sc.nextDouble();
		System.out.println("Enter height :");
		double h=sc.nextDouble();
		System.out.println("Enter Mass :");
		double m=sc.nextDouble();
		First ob=new First(l,b);
		ob.area();
	}	
}