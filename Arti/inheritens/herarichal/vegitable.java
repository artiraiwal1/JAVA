import java.util.Scanner;
class Vagitable
{
	String size,color,test,stat;
	public void setData(String size,String color,String test,String stat)
	{
		this.size=size;
		this.color=color;
		this.test=test;
		this.stat=stat;
	}
	public String getDataSize()
	{
		return this.size;
	}
	public String getDataColor()
	{
		return this.color;
	}
	public String getDataTest()
	{
		return this.test;
	}
	public String getDataStat()
	{
		return this.stat;
	
	}
}
class Tometto extends Vagitable
{
	public void setData()
	{
		this.setData(size,color,test,stat);
	}
	public void print()
	{
		System.out.println(" size of vegitable :"+this.size);
		System.out.println(" color of vegitable :"+this.color);
		System.out.println(" test of vegitable :"+this.test);
		System.out.println(" stat of vegitable :"+this.stat);
	}
}
class Potetto extends Vagitable
{
	public void setData()
	{
		this.setData(size,color,test,stat);
	}
	public void print()
	{
		System.out.println(" size of vegitable :"+this.size);
		System.out.println(" color of vegitable :"+this.color);
		System.out.println(" test of vegitable :"+this.test);
		System.out.println(" stat of vegitable :"+this.stat);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		String size,color,test,stat;
		Vagitable ob=new Vagitable();
		System.out.println(" Enter size of vegitable :");
		size=sc.nextLine();
		System.out.println(" Enter color of vegitable :");
		color=sc.nextLine();
		System.out.println(" Enter test of vegitable :");
		test=sc.nextLine();
		System.out.println(" Enter stat of vegitable :");
		stat=sc.nextLine();
		Tometto ob1=new Tometto();
		ob1.setData(size,color,test,stat);
		ob1.print();
		Potetto ob2=new Potetto();
		ob2.setData(size,color,test,stat);
		ob2.print();
	}
}