import java.util.Scanner;
class Factorial
{
	private int  n;
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
class Reverse extends Factorial
{
	public int reverse()
	{
		int rev=0,rem=0;
		int fact=this.fact();
		for( ;fact>0;fact/=10)
		{
			rem=fact%10;
			rev=(rev*10)+rem;
		}
		return rev;
	}
}
class Test
{
	public static void main(String args[])
	{
		Reverse ob=new Reverse();
		Scanner sc=new Scanner (System.in);
		System.out.println("Entre any number :");
		int n=sc.nextInt();
		ob.setData(n);
		System.out.println("Factorial is :"+ob.fact());
		System.out.println("Reverse of Factorial :"+ob.reverse());
	}
}