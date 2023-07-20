import java.util.Scanner;
class Shape
{
	double a;
	public Shape()
	{
		this.a=a;
	}
	public Shape(double a)
	{
		this.a=a;
	}
}
class Circle extends Shape
{
	double a;
	public Circle(double a)
	{
		super(a);
	}
	public void area()
	{
		System.out.println(" Area is circle :"+3.14f*this.a*this.a);
	}
	
}
/* class Tringle 
{
	
}
class Rectengle 
{
	
}
class Square
{
	
} */
class Main
{
	public static void main(String args[])
	{
		double l,w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any :");
		l=sc.nextDouble();
		Shape ob=new Shape(l);
		ob.area();
	}
}