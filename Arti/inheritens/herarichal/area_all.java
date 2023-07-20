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
	//double a;
	public Circle(double a)
	{
		super(a);
	}
	public void area()
	{
		System.out.println("Area is circle :"+3.14f*this.a*this.a);
	}
}
class Square extends Circle
{
	public Square (double a)
	{
		super(a);
	}
	public void area()
	{
		super.area();
		System.out.println("Area of Square :"+this.a*this.a);
	}
} 
 class Tringle extends Square
{
	double b;
	public Tringle(double a,double b)
	{
		super(a);
		this.b=b;
	}
	public void area()
	{
		super.area();
		System.out.println("Area of Tringle :"+(super.a*this.b)/2);
	}
	
}
class Rectengle extends Tringle
{
	public Rectengle (double a,double b)
	{
		super(a,b);
	}
	public void area()
	{
		super.area();
		System.out.println("Area of Rectrangle :"+super.a*this.b);
	}
}
class Main
{
	public static void main(String args[])
	{
		double l,w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height :");
		l=sc.nextDouble();
		System.out.println("Enter weight :");
		w=sc.nextDouble();
		Rectengle ob=new Rectengle(l,w);
		ob.area();
	}
}