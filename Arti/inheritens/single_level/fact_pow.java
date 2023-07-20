import java.util.Scanner;
class Factorial
{
	int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int fact()
	{
		int fact=1;
		for(int i=1;i<=this.n;i++)
		{
			fact=fact*i;
		}
		 return fact;
	}
}
class Power extends Factorial
{
	int b;
	public void setData(int n,int b)
	{
		this.setData(n);
		this.b=b;
	}
	public int power()
	{
		int pow=1;
		for(int i=1;i<=this.b;i++)
		{
			pow=pow*this.n;
		}
		return pow;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Power ob=new Power();
		System.out.println("Entre two number :");
		int n=sc.nextInt();
		int b=sc.nextInt();
		ob.setData(n);
		System.out.println("Factorial is :"+ob.fact());
		ob.setData(n,b);
		System.out.println("Power is :"+ob.power());
	}
}