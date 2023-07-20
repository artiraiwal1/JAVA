import java.util.Scanner;
class Square
{
	int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int square()
	{
		return this.n*this.n;
	}
}
class Qube extends Square
{
	public int qube()
	{
		return this.square()*this.n;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Qube ob=new Qube();
		System.out.println("Entre two number :");
		int n=sc.nextInt();
		ob.setData(n);
		System.out.println("Square is :"+ob.square());
		System.out.println("Qube is :"+ob.qube());
	}
}