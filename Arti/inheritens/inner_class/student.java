import java.util.Scanner;
class Student
{
	int roll,mark;
	String name;
	Address add;
	public Student(int roll,int mark,String name,int homeno,String city,String state)
	{
		this.roll=roll;
		this.mark=mark;
		this.name=name;
		add=new Address(homeno,city,state);
	}
	public int getDataRoll()
	{
		return this.roll;
	}
	public int getDataMark()
	{
		return this.mark;
	}
	public String getDataName()
	{
		return this.name;
	}
	public void print()
	{
		System.out.println("Roll Number of student :"+this.getDataRoll());
		System.out.println("Name of student :"+this.getDataMark());
		System.out.println("Marks of student :"+this.getDataName());
		this.add.print();
	}
class Address
{
	int homeno;
	String city,state;
	public Address(int homeno,String city,String state)
	{
		this.homeno=homeno;
		this.city=city;
		this.state=state;
	}
	public int getDataHome()
	{
		return this.homeno;
	}
	public String getDataCity()
	{
		return this.city;
	}
	public String getDataState()
	{
		return this.state;
	}
	public void print()
	{
		System.out.println("Home number  of student :"+this.getDataHome());
		System.out.println("City of student :"+this.getDataCity());
		System.out.println("State of student :"+this.getDataState());
	}	
}
}
class Test
{
	public static void main(String args[])
	{
		int roll,mark,homeno;
		String name,state,city;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number of student :");
		roll=sc.nextInt();
		System.out.println("Enter marks of student :");
		mark=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre name of student :");
		name=sc.nextLine();
		System.out.println("Enter Home number of student :");
		homeno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter state of student :");
		state=sc.nextLine();
		System.out.println("Enter city of student :");
		city=sc.nextLine();
		Student ob=new Student(roll,mark,name,homeno,state,city);
		ob.print();
	}
}