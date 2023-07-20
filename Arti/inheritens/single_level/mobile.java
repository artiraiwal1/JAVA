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
		System.out.println("--------------The simple mobile is functionality-------------");
		System.out.println("");
		System.out.println("\t Color of Mobile :"+this.getDataColor());
		System.out.println("\t Power of bettery :"+this.getDataBettery());
		System.out.println("\t Speker of Mobile :"+this.getDataSpeker());
		System.out.println("\t price of simple Mobile :"+this.getDataPrice());
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
		System.out.println("------------ The Keyped Mobile Functionality------------------");
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
		System.out.println("\t price of Mobile  :"+this.getDataPrice1());
	}
}
class Test
{
	public static void main(String arga[])
	{
		Scanner sc=new Scanner (System.in);
		String color,bettery,speker,sim,screen,camra,memory,charger,earphon,rem;
		double price,price1;
		Keyped ob=new Keyped();
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
		System.out.print("Enter simple mobile price :");
		price=sc.nextDouble();
		System.out.print("Enter keyped mobile price:");
		price1=sc.nextDouble();
		ob.setData(color,bettery,speker,price);
		ob.printSimple();
		ob.setData1(color,bettery,speker,sim,screen,camra,memory,charger,earphon,rem,price1);
		ob.printKeyped();
		
	}
}
