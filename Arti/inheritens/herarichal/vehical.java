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
class Car extends Vahical
{
	String door,window,weels,horn,engen;
	public void setData1(String start,String breakk,String color,String wait,String cepicity,String door,String window,String Weels,String horn,String engen)
	{
		this.setData(start,breakk,color,wait,cepicity);
		this.door=door;
		this.window=window;
		this.weels=weels;
		this.horn=horn;
		this.engen=engen;
	}
	public String getDataDoor()
	{
		return this.door;
	}
	public String getDataWindow()
	{
		return this.window;
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
		System.out.println("------------ The car of Functionality -------------");
		System.out.println("");
		System.out.println("\t car in weels :"+this.getDataWeels());
		System.out.println("\t car in start :"+this.getDataStart());
		System.out.println("\t car in breakk :"+this.getDataBreakk());
		System.out.println("\t car in color :"+this.getDataColor());
		System.out.println("\t car of wait :"+this.getDataWait());
		System.out.println("\t car in cepicity :"+this.getDataCepicity());
		System.out.println("\t car in door :"+this.getDataDoor());
		System.out.println("\t car in window :"+this.getDataWindow());
		System.out.println("\t car in Horn :"+this.getDataHorn());
		System.out.println("\t car in engen :"+this.getDataEngen());
		System.out.println("");

	}
}
class Fortunor extends Vahical
{
	String door,window,weels,horn,engenmusicplayer,ac,remote;
	public void setData2(String start,String breakk,String color,String wait,String cepicity,String door,String window,String weels,String horn,String engen,String musicplayer,String ac,String remote)
	{
		this.setData(start,breakk,color,wait,cepicity);
		this.door=door;
		this.window=window;
		this.weels=weels;
		this.horn=horn;
		this.engen=engen;
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
		System.out.println("\t car in weels :"+this.getDataWeels());
		System.out.println("\t car in start :"+this.getDataStart());
		System.out.println("\t car in breakk :"+this.getDataBreakk());
		System.out.println("\t car in color :"+this.getDataColor());
		System.out.println("\t car of wait :"+this.getDataWait());
		System.out.println("\t car in cepicity :"+this.getDataCepicity());
		System.out.println("\t car in door :"+this.getDataDoor());
		System.out.println("\t car in window :"+this.getDataWindow());
		System.out.println("\t car in Horn :"+this.getDataHorn());
		System.out.println("\t car in engen :"+this.getDataEngen());
		System.out.println("\t car in Musicplayer :"+this.getDataMusic());
		System.out.println("\t car in AC  :"+this.getDataAc());
		System.out.println("\t car in Remote :"+this.getDataRemote());
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Fortunor ob=new Fortunor();
		String start,breakk,color,wait,cepicity,door,window,weels,horn,engen,musicplayer,ac,remote;
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
		System.out.print("Enter car in weels :");
		weels=sc.nextLine();
		System.out.print("Enter car in horn :");
		horn=sc.nextLine();
		System.out.print("Enter car in Engen :");
		engen=sc.nextLine();
		System.out.print("Enter car in Musicplayer :");
		musicplayer=sc.nextLine();
		System.out.print("Enter car in Ac :");
		ac=sc.nextLine();
		System.out.print("Enter car in Remote :");
		remote=sc.nextLine();
		ob.setData(start,breakk,color,wait,cepicity);
		ob.setData1(start,breakk,color,wait,cepicity,door,window,weels,horn,engen);
		ob.setData2(start,breakk,color,wait,cepicity,door,window,weels,horn,engen,musicplayer,ac,remote);
		ob.print();
		ob.print1();
	}
}