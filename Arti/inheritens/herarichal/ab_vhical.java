import java.util.Scanner;
abstract class Vahical
{
	String name,brand,color,seatingcepicity;
		abstract public String cost();
		abstract public String drive();
		abstract public String breakk();
		abstract public String display();	
}

abstract class LandTransport extends Vahical
{
	String weels;
	public LandTransport()
	{
		
	}
	public LandTransport(String name,String brand,String color,String seatingcepicity,String weels)
	{
		super.name=name;
		super.brand=brand;
		super.color=color;
		super.seatingcepicity=seatingcepicity;
		this.weels=weels;
	}	
		abstract public String cost();
		abstract public String drive();
		abstract public String breakk();
		abstract public String display();
}
class Cycle extends LandTransport
{
	public Cycle(String name,String brand,String color,String seatingcepicity,String weels)
	{
		super.name=name;
		super.brand=brand;
		super.color=color;
		super.seatingcepicity=seatingcepicity;
		super.weels=weels;
	}	
	 public String cost()
	{
		System.out.println(" 10 Thausion rupesh ");
	}
	public String drive()
	{
		System.out.println(" Start by pedual");
	}
	public String breakk()
	{
		System.out.println(" Break by pedual");		
	}
	public String display()
	{
		System.out.println(" Name  :"+this.name);
		System.out.println(" Brand  :"+this.brand);
		System.out.println(" Colur  :"+this.color);
		System.out.println(" Seating cepicity  :"+this.seatingcepicity);
		System.out.println(" Weels  :"+this.weels);
	}
	
}
class Bike extends LandTransport
{
	public Cycle(String name,String brand,String color,String seatingcepicity,String weels)
	{
		super.name=name;
		super.brand=brand;
		super.color=color;
		super.seatingcepicity=seatingcepicity;
		super.weels=weels;
	}	
	 public String cost()
	{
		System.out.println("85 thausion rupesh "); 
	}
	public String drive()
	{
		System.out.println(" Started for ")
	}
	public String breakk()
	{
		System.out.println(" Break for hand ");
	}
	public String display()
	{
		System.out.println(" Name  :"+this.name);
		System.out.println(" Brand  :"+this.brand);
		System.out.println(" Colur  :"+this.color);
		System.out.println(" Seating cepicity  :"+this.seatingcepicity);
		System.out.println(" Weels  :"+this.weels);
	}	
}
class Car extends LandTransport
{
	String door,wondow,musicplayer,Ac;
	public Cycle(String name,String brand,String color,String seatingcepicity,String weels)
	{
		super.name=name;
		super.brand=brand;
		super.color=color;
		super.seatingcepicity=seatingcepicity;
		super.weels=weels;
		this.door=door;
		this.wondow=wondow;
		this.musicplayer=musicplayer;
		this.Ac=Ac;
	}	
	 public String cost()
	{
		System.out.println(" 15 lakhs rupesh "); 
	}
	public String drive()
	{
		System.out.println(" Started for ")
	}
	public String breakk()
	{
		System.out.println(" Break for hand ");
	}
	public String display()
	{
		System.out.println(" Name  :"+this.name);
		System.out.println(" Brand  :"+this.brand);
		System.out.println(" Colur  :"+this.color);
		System.out.println(" Seating cepicity  :"+this.seatingcepicity);
		System.out.println(" Weels  :"+this.weels);
		System.out.println(" Door  :"+this.door);
		System.out.println(" Window  :"+this.window);
		System.out.println(" Musicplayer  :"+this.musicplayer);
		System.out.println(" Ac  :"+this.Ac);
	}
	
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