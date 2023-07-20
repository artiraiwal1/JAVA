import java.util.Scanner;
class Mobile
{
	String color,bettery,speker;
	double price;
	public void setData(String color,String bettery,String speker,double price)
	{
		this.color=color;
		this.bettery=bettery;
		this.speker=speker;
		this.price=price;
	}
	public String getDataColor()
	{
		return this.color;
	}
	public String getDataBettery()
	{
		return this.bettery;
	}
	public String getDataSpeker()
	{
		return this.speker;
	}
	public double getDataPrice()
	{
		return this.price;
	}
	public void printSimple()
	{
		System.out.println("");
		System.out.println("-------------- The simple mobile is functionality -------------");
		System.out.println("");
		System.out.println("\t Color of Mobile :"+this.getDataColor());
		System.out.println("\t Power of bettery :"+this.getDataBettery());
		System.out.println("\t Speker of Mobile :"+this.getDataSpeker());
		System.out.println("\t price of Mobile :"+this.getDataPrice());
	}
}
class Keyped extends Mobile
{
	String sim,screen,camra,memory,charger,earphon,rem;
	double price1;
	public void setData1(String color,String bettery,String speker,String sim,String screen,String camra,String memory,String charger,String earphon,String rem,double price1)
	{
		this.setData(color,bettery,speker,price);
		this.sim=sim;
		this.screen=screen;
		this.camra=camra;
		this.memory=memory;
		this.charger=charger;
		this.earphon=earphon;
		this.rem=rem;
		this.price1=price1;
	}
	public String getDataSim()
	{
		return this.sim;
	}
	public String getDataScreen()
	{
		return this.screen;
	}
	public String getDataCamra()
	{
		return this.camra;
	}
	public String getDataMemory()
	{
		return this.memory;
	}
	public String getDataCharger()
	{
		return this.charger;
	}
	public String getDataEarphon()
	{
		return this.earphon;
	}
	public String getDataRem()
	{
		return this.rem;
	}
	public double getDataPrice1()
	{
		return this.price1;
	}
	public void printKeyped()
	{
		System.out.println("");
		System.out.println("------------ The Keyped Mobile Functionality ------------------");
		System.out.println("");
		System.out.println("\t Color of Mobile :"+this.getDataColor());
		System.out.println("\t Power of bettery :"+this.getDataBettery());
		System.out.println("\t Speker of Mobile :"+this.getDataSpeker());
		System.out.println("\t Mobile in sim :"+this.getDataSim());
		System.out.println("\t Mobile of screen :"+this.getDataScreen());
		System.out.println("\t Mobile of camra :"+this.getDataCamra());
		System.out.println("\t Mobile of memory :"+this.getDataMemory());
		System.out.println("\t Mobile of Charger :"+this.getDataCharger());
		System.out.println("\t Mobile of earphon :"+this.getDataEarphon());
		System.out.println("\t Mobile of rem :"+this.getDataRem());
		System.out.println("\t Mobile of price :"+this.getDataPrice1());
	}
}
class Amdroid extends Mobile
{
	String sim,screen,camra,memory,charger,earphon,rem,display,network,app,simcepicity;
	double price2;
	public void setData2(String color,String bettery,String speker,String sim,String screen,String camra,String memory,String charger,String earphon,String rem,String display,String network,String app,String simcepicity,double price2)
	{
		this.setData(color,bettery,speker,price);
		this.sim=sim;
		this.screen=screen;
		this.camra=camra;
		this.memory=memory;
		this.charger=charger;
		this.earphon=earphon;
		this.rem=rem;
		this.display=display;
		this.network=network;
		this.app=app;
		this.simcepicity=simcepicity;
		this.price2=price2;
	}
	public String getDataSim()
	{
		return this.sim;
	}
	public String getDataScreen()
	{
		return this.screen;
	}
	public String getDataCamra()
	{
		return this.camra;
	}
	public String getDataMemory()
	{
		return this.memory;
	}
	public String getDataCharger()
	{
		return this.charger;
	}
	public String getDataEarphon()
	{
		return this.earphon;
	}
	public String getDataRem()
	{
		return this.rem;
	}
	public String getDataDisplay()
	{
		return this.display;
	}
	public String getDataNetwork()
	{
		return this.network;
	}
	public String getDataApp()
	{
		return this.app;
	}
	public String getDataSimcepicity()
	{
		return this.simcepicity;
	}
	public double getDataPrice2()
	{
		return this.price2;
	}
	public void printAmdroid()
	{
		System.out.println("");
		System.out.println("--------------- The Amdroid Mobile Functionality ------------------");
		System.out.println("");
		System.out.println("\t Color of Mobile :"+this.getDataColor());
		System.out.println("\t Power of bettery :"+this.getDataBettery());
		System.out.println("\t Speker of Mobile :"+this.getDataSpeker());
		System.out.println("\t Mobile in sim :"+this.getDataSim());
		System.out.println("\t Mobile of screen :"+this.getDataScreen());
		System.out.println("\t Mobile of camra :"+this.getDataCamra());
		System.out.println("\t Mobile of memory :"+this.getDataMemory());
		System.out.println("\t Mobile of Charger :"+this.getDataCharger());
		System.out.println("\t Mobile of earphon :"+this.getDataEarphon());
		System.out.println("\t Mobile of rem :"+this.getDataRem());
		System.out.println("\t Mobile of DisplayMode :"+this.getDataDisplay());
		System.out.println("\t Mobile of network procces :"+this.getDataNetwork());
		System.out.println("\t Mobile of App :"+this.getDataApp());
		System.out.println("\t Mobile of sim cepicity :"+this.getDataSimcepicity());
		System.out.println("\t Mobile of price :"+this.getDataPrice2());
	}
}
class Test
{
	public static void main(String arga[])
	{
		Scanner sc=new Scanner (System.in);
		String color,bettery,speker,sim,screen,camra,memory,charger,earphon,rem,display,network,app,simcepicity;
		double price,price1,price2;
		Mobile m=new Mobile();
		System.out.print("Enter color :");
		color=sc.nextLine();
		System.out.print("Enter power of bettery :");
		bettery=sc.nextLine();
		System.out.print("Enter speker sound :");
		speker=sc.nextLine();
		System.out.print("Enter sim neme :");
		sim=sc.nextLine();
		System.out.print("Enter screen of mobile :");
		screen=sc.nextLine();
		System.out.print("Enter camra of mobile :");
		camra=sc.nextLine();
		System.out.print("Enter memory of mobile :");
		memory=sc.nextLine();
		System.out.print("Enter charger of mobile :");
		charger=sc.nextLine();
		System.out.print("Enter earphon of mobile :");
		earphon=sc.nextLine();
		System.out.print("Enter rem of mobile :");
		rem=sc.nextLine();
		System.out.print("Enter types of display :");
		display=sc.nextLine();
		System.out.print("Enter  of mobile network procces :");
		network=sc.nextLine();
		System.out.print("Enter app of mobile :");
		app=sc.nextLine();
		System.out.print("Enter mobile of sim sepicity :");
		simcepicity=sc.nextLine();
		System.out.print("Enter price of simple mobile :");
		price=sc.nextDouble();
		System.out.print("Enter price of keyped mobile :");
		price1=sc.nextDouble();
		System.out.print("Enter price of amdroid mobile :");
		price2=sc.nextDouble();
		m.setData(color,bettery,speker,price);
		m.printSimple();
		Keyped ob1=new Keyped();
		ob1.setData1(color,bettery,speker,sim,screen,camra,memory,charger,earphon,rem,price1);
		ob1.printKeyped();
		Amdroid ob=new Amdroid();
		ob.setData2(color,bettery,speker,sim,screen,camra,memory,charger,earphon,rem,display,network,app,simcepicity,price2);
		ob.printAmdroid();
	}
}
