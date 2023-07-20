import java.util.Scanner;
class Add
{
	private int a;
	private int b;
	public Add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getA()
	{
		return a;
	}	
	public int getB()
	{
		return b;
	}
	public int add()
	{
	
		return this.getA()+this.getB();
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Add ob=new Add(a,b);
		int ans=ob.add();
		System.out.println("Addition :"+ans);
	}
}