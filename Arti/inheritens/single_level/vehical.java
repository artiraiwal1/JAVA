import java.util.Scanner;
class Vahical
{
	String weels,start,breakk,color,wait,cepicity;
	public void setData(String weels,String start,String breakk,String color,String wait,String cepicity)
	{
		this.weels=weels;
		this.start=start;
		this.breakk=breakk;
		this.color=color;
		this.wait=wait;
		this.cepicity=cepicity;
	}
	public String getDataWeels()
	{
		return this.weels;
	}
	public String getDataStart()
	{
		return this.start;
	}
	public String getDataBreakk()
	{
		return this.breakk;
	}
	public String getDataColor()
	{
		return this.color;
	}
	public String getDataWait()
	{
		return this.wait;
	}
	public String getDataCepicity()
	{
		return this.cepicity;
	}
}
class Car extends Vahical
{
	String door,window;
	public void setData(String weels,String start,String breakk,String color,String wait,String cepicity,String door,String window)
	{
		this.setData(weels,start,breakk,color,wait,cepicity);
		this.door=door;
		this.window=window;
	}
	public String getDataDoor()
	{
		return this.door;
	}
	public String getDataWindow()
	{
		return this.window;
	}
	public void print()
	{
		System.out.println("------------ The car of Functionality -------------");
		System.out.println("\t car in weels :"+this.weels);
		System.out.println("\t car in start :"+this.start);
		System.out.println("\t car in breakk :"+this.breakk);
		System.out.println("\t car in color :"+this.color);
		System.out.println("\t car of wait :"+this.wait);
		System.out.println("\t car in cepicity :"+this.cepicity);
		System.out.println("\t car in door :"+this.door);
		System.out.println("\t car in window :"+this.window);
	}
}
class Test
{
	public static void main(String args[])
	{
		
	String weels,start,breakk,color,wait,cepicity,door,window;
		Scanner sc=new Scanner(System.in);
		Car ob=new Car();
		System.out.print("Enter car in weels :");
		weels=sc.nextLine();
		System.out.print("Enter car in start :");
		start=sc.nextLine();
		System.out.print("Enter car in breakk :");
		breakk=sc.nextLine();
		System.out.print("Enter car in color :");
		color=sc.nextLine();
		System.out.print("Enter car of wait :");
		wait=sc.nextLine();
		System.out.print("Enter car in cepicity :");
		cepicity=sc.nextLine();
		System.out.print("Enter car in door :");
		door=sc.nextLine();
		System.out.print("Enter car in window :");
		window=sc.nextLine();
		ob.setData(weels,start,breakk,color,wait,cepicity);
		ob.setData(weels,start,breakk,color,wait,cepicity,door,window);
		ob.print();
	}
}