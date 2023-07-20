import java.util.Scanner;
class Parson
{
	String name,Lname,g;
	int age;
	double hight,wait;
	public void setData(String name,String Lname,String g,int age,double hight,double wait)
	{
		this.name=name;		
		this.Lname=Lname;
		this.g=g;
		this.age=age;
		this.hight=hight;
		this.wait=wait;
	}
	
	public String getDataName()
	{
		return this.name;
	}
	public String getDataLname()
	{
		return this.Lname;
	}
	public String getDataG()
	{
		return this.g;
	}
	public int getDataAge()
	{
		return this.age;
	}
	public double getDataHight()
	{
		return this.hight;
	}
	public double getDataWait()
	{
		return this.wait;
	}
	public void print()
	{
		System.out.println("The proparty of Parson  :");
		System.out.println("");
		System.out.println("Name :"+this.getDataName());
		System.out.println("Last Name :"+this.getDataLname());
		System.out.println("Age :"+this.getDataAge());	
		System.out.println("Ganresion :"+this.getDataG());
		System.out.println("Hight :"+this.getDataHight());
		System.out.println("Wait :"+this.getDataWait());
	}
}
class Imploy extends Parson
{
	String Id;
	double salry;
	public void setData(String name,String Lname,String g,String Id,int age,double hight,double wait,double salry)
	{
		this.setData(name,Lname,g,age,hight,wait);
		this.Id=Id;
		this.salry=salry;
	}
	public String getDataId()
	{
		return this.Id;
	}
	public double getDataSalry()
	{
		return this.salry;
	}
	public void print1()
	{
		System.out.println("The proparty  of Imploy  :");
		System.out.println("");
		System.out.println("Name :"+this.getDataName());
		System.out.println("Last Name :"+this.getDataLname());
		System.out.println("User ID :"+this.getDataId());
		System.out.println("Salry :"+this.getDataSalry());
		System.out.println("Age :"+this.getDataAge());
		System.out.println("Ganresion :"+this.getDataG());
		System.out.println("Hight :"+this.getDataHight());
		System.out.println("Wait :"+this.getDataWait());
	}
}
class Test
{
	public static void main(String args[])
	{
		Imploy ob=new Imploy();
		Scanner sc=new Scanner(System.in);
		String name,Lname,g,Id;
		int age;
		double hight,wait,salry;

		System.out.println("Enter First Name :");
		name=sc.nextLine();
		System.out.println("Entre Last Name :");
		Lname=sc.nextLine();
		System.out.println("Entre Genred :");
		g=sc.nextLine();
		System.out.println("Enter age :");
		age=sc.nextInt();
		System.out.println("Enter Hight :");
		hight=sc.nextDouble();
		System.out.println("Enter wait :");
		wait=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter ID :");
		Id=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter salry :");
		salry=sc.nextDouble();
		ob.setData(name,Lname,g,age,hight,wait);
		ob.setData(name,Lname,g,Id,age,hight,wait,salry);
		ob.print();
		ob.print1();
	}
}