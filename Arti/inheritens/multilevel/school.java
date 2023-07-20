import java.util.Scanner;
class School
{
	String sname,universty;
	public School(name,universty)
	{
		this.name=name;
		this.universty=universty;
	}
	public String getSName()
	{
		return this.sname;
	}
	public String grtUni()
	{
		return this.universty;
	}
	public void  print()
	{
		System.out.println("Enter School name :"+this.getSName());
		System.out.println("Enter School name :"+this.getUni());
	}
}
class Teacher extends School
{
	int age,salry;
	String haight,weight,name;
	public Teacher(String sname,String universty,String name,String haight,String weight,int age,int salry)
	{
		this.setData(name,universty)
		this.name=name;
		this.haight=haight;
		this.weight=weight;
		this.age=age;
		this.salry=salry;
	}
	public String getName()
	{
		return this.name;
	}
	public String getHaight()
	{
		return this.haight;
	}
	public String getWeight()
	{
		return this.weight;
	}
	public String getAge()
	{
		return this.age;
	}
	public String getSalry()
	{
		return this.salry;
	}
	public void print()
	{
		System.out.println("----------------- Teacher ---------------");
		System.out.println("Enter name of Teacher :"+this.getName());
		System.out.println("Enter haight of  Teacher :"+this.getHaight());
		System.out.println("Enter weight of Teacher :"+this.getWeight());
		System.out.println("Enter age of Teacher :"+this.getAge());
		System.out.println("Enter Salry of Teacher :"+this.getSalry());
	}
}
class Student extends Teacher
{
	public Student(String sname,String universty,String name,String haight,String weight,int age,int salry,int roll,int mark)
	{
		this.setData(sname,universty,name,haight,weight,age,salry)
		this.roll=roll;
		this.mark=mark;
	}
	public void getRoll()
	{
		return this.roll;
	}
	public void getMark()
	{
		return this.mark;
	}
	public void print()
	{
		System.out.println("Enter Scahool name of student :"+this.getSName());
		System.out.println("Enter universty of student :"+this.getUni());
		System.out.println("Enter name of student :"+this.getName());
		System.out.println("Enter name of student :"+this.getHaight());
		System.out.println("Enter name of student :"+this.getWeight());
		System.out.println("Enter name of student :"+this.getAge());
		System.out.println("Enter name of student :"+this.getRoll());
		System.out.println("Enter name of student :"+this.getMark());
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the school name :");
		sname=sc.nextLine();
		System.out.println(" Enter the universty name :");
		sname=sc.nextLine();
		System.out.println(" Enter name :");
		name=sc.nextLine();
		System.out.println(" Enter haight :");
		height=sc.nextLine();
		System.out.println(" Enter weight :");
		weight=sc.nextLine();
		System.out.println(" Enter Age :");
		age=sc.nextLine();
		
	}
}