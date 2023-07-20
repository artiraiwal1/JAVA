import java.util.Scanner;
class Vahical
{
	String start,breakk,color,wait,cepicity;
	public void setData(String start,String breakk,String color,String wait,String cepicity)
	{
		this.start=start;
		this.breakk=breakk;
		this.color=color;
		this.wait=wait;
		this.cepicity=cepicity;
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
class Bike extends Vahical
{
	String weels,horn,engen;
	public void setData1(String start,String breakk,String color,String wait,String cepicity,String Weels,String horn,String engen)
	{
		this.setData(start,breakk,color,wait,cepicity);
		this.weels=weels;
		this.horn=horn;
		this.engen=engen;
	}
	public String getDataWeels()
	{
		return this.weels;
	}
	public String getDataHorn()
	{
		return this.horn;
	}
	public String getDataEngen()
	{
		return this.engen;
	}
	public void print()
	{
		System.out.println("------------ The Bike of Functionality -------------");
		System.out.println("");
		System.out.println("\t Bike in start :"+this.getDataStart());
		System.out.println("\t Bike in breakk :"+this.getDataBreakk());
		System.out.println("\t Bike in color :"+this.getDataColor());
		System.out.println("\t Bike of wait :"+this.getDataWait());
		System.out.println("\t Bike in cepicity :"+this.getDataCepicity());
		System.out.println("\t Bike in weels :"+this.weels);
		System.out.println("\t Bike in Horn :"+this.getDataHorn());
		System.out.println("\t Bike in engen :"+this.getDataEngen());
		System.out.println("");

	}
}
class Car extends Bike
{
	String door,window,musicplayer,ac,remote;
	public void setData2(String start,String breakk,String color,String wait,String cepicity,String Weels,String horn,String engen,String door,String window,String musicplayer,String ac,String remote)
	{
		this.setData1(start,breakk,color,wait,cepicity,weels,horn,engen);
		this.door=door;
		this.window=window;;
		this.musicplayer=musicplayer;
		this.ac=ac;
		this.remote=remote;
	}
	public String getDataDoor()
	{
		return this.door;
	}
	public String getDataWindow()
	{
		return this.window;
	}
	public String getDataMusic()
	{
		return this.musicplayer;
	}
	public String getDataAc()
	{
		return this.ac;
	}
	public String getDataRemote()
	{
		return this.remote;
	}
	public void print1()
	{
		System.out.println("------------ The car of Functionality -------------");
		System.out.println("");
		System.out.println("\t car in start :"+this.getDataStart());
		System.out.println("\t car in breakk :"+this.getDataBreakk());
		System.out.println("\t car in color :"+this.getDataColor());
		System.out.println("\t car of wait :"+this.getDataWait());
		System.out.println("\t car in cepicity :"+this.getDataCepicity());
		System.out.println("\t car in weels :"+this.getDataWeels());
		System.out.println("\t car in Horn :"+this.getDataHorn());
		System.out.println("\t car in engen :"+this.getDataEngen());
		System.out.println("\t car in door :"+this.getDataDoor());
		System.out.println("\t car in window :"+this.getDataWindow());
		System.out.println("\t car in musicplayer :"+this.getDataMusic());
		System.out.println("\t car in Ac :"+this.getDataAc());
		System.out.println("\t car in remote :"+this.getDataRemote());
		System.out.println("");

	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Car ob=new Car();
		String start,breakk,color,wait,cepicity,weels,horn,engen,door,window,musicplayer,ac,remote;
		System.out.print("Enter start :");
		start=sc.nextLine();
		System.out.print("Enter breakk :");
		breakk=sc.nextLine();
		System.out.print("Enter color :");
		color=sc.nextLine();
		System.out.print("Enter wait :");
		wait=sc.nextLine();
		System.out.print("Enter cepicity :");
		cepicity=sc.nextLine();
		System.out.print("Enter  weels :");
		weels=sc.nextLine();
		System.out.print("Enter horn :");
		horn=sc.nextLine();
		System.out.print("Enter Engen :");
		engen=sc.nextLine();
		System.out.print("Enter door :");
		door=sc.nextLine();
		System.out.print("Enter window :");
		window=sc.nextLine();
		System.out.print("Enter Musicplayer :");
		musicplayer=sc.nextLine();
		System.out.print("Enter  Ac :");
		ac=sc.nextLine();
		System.out.print("Enter  Remote :");
		remote=sc.nextLine();
		ob.setData(start,breakk,color,wait,cepicity);
		ob.setData1(start,breakk,color,wait,cepicity,weels,horn,engen);
		ob.setData2(start,breakk,color,wait,cepicity,weels,horn,engen,door,window,musicplayer,ac,remote);
		ob.print();
		ob.print1();
	}
}