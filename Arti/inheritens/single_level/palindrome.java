import java.util.Scanner;
class Reverse 
{
	int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int reverse()
	{
		int rev=0,rem=0;
		for( ;this.n>0;this.n/=10)
		{
			rem=this.n%10;
			rev=(rev*10)+rem;
		}
		return rev;
	}
}
class Palindrome extends Reverse
{
	public void pal()
	{
		if(this.reverse()==this.n)
			System.out.println("Numbre is palindrome :");
		else
			System.out.println("Number is not palindrome :");
	}
}
class Test
{
	public static void main(String args[])
	{
		Palindrome ob=new Palindrome();
		Scanner sc=new Scanner (System.in);
		System.out.println("Entre any number :");
		int n=sc.nextInt();
		ob.setData(n);
		System.out.println("Reverse of Factorial :"+ob.reverse());
			ob.pal();

	}
}