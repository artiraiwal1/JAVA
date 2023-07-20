import java.util.Scanner;
class Area
{
	int l,b;
	public Area(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int getDataL()
	{
		return this.l;
	}
	public int getDataB()
	{
		return this.b;
	}
	public Area()
	{
		return getDataL()*getDataB();
	}
}
class Volume extends Area
{
	int h;
	public Volume(int l,int b,int h)
	{
		this.setData(l,b);
		this.h=h;
	}
	public int getDataH()
	{
		return this.h;
	}
	public Volume()
	{
		return getDataL()*getDataB()*getDataH();
	}
}
class Densicy extends Volume
{
	double m;
	public void setDataM(int l,int b,int h,double m)
	{
		this.setData(l,b,h);
		this.m=m;
	}	
	public double getDataM()
	{
		return this.m;
	}
	public double dencity()
	{
		return this.volume()/getDataM();
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		Densicy ob=new Densicy();
		int l,b,h;
		double m;
		System.out.println(" ENter lenth of trengle :");
		l=sc.nextInt();
		System.out.println(" ENter brith of trengle :");
		b=sc.nextInt();
		System.out.println(" ENter haigth of trengle :");
		h=sc.nextInt();
		System.out.println(" ENter mass of trengle :");
		m=sc.nextDouble();
		ob.setData(l,b);
		ob.setData(l,b,h);
		ob.setDataM(l,b,h,m);
		System.out.println("Area is :"+ob.area());
		System.out.println("Volume is :"+ob.volume());
		System.out.println("Densicy is :"+ob.dencity());
	}
}
