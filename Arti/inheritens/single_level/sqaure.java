import java.util.Scanner;
class Area
{
	int l,b;
	public void setData(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int area()
	{
		return this.l*this.b;
	}
}
class Volume extends Area
{
	int h;
	public void setData(int l,int b,int h)
	{
		this.setData(l,b);
		this.h=h;
	}
	public int vol()
	{
		return this.area()*this.h;
	}
}
class Test
{
		
	public static void main(String args[])
	{
		Volume ob=new Volume();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenth :");
		int l=sc.nextInt();
		System.out.println("Enter winth :");
		int w=sc.nextInt();	
		System.out.println("Enter haight :");
		int h=sc.nextInt();
		ob.setData(l,w);
		ob.setData(l,w,h);
		System.out.println(" "+ob.area());
		int a=ob.vol();
		System.out.println(" "+a);
	}
}