import java.util.Scanner;
class Test
{
	int x;
	public Test()
	{
		System.out.println("Deffalut conturtor :");
	}
	public Test(int x)
	{
		this.x=x;
	}
	public void display()
	{
		System.out.println(" x1 :"+this.x);
	}
}
class Test1 extends Test
{
	int x;
	public Test1(int x1,int x2)
	{
		super(x1);
		this.x=x2;
	}
	public void display()
	{
		super.display();
		System.out.println(" x2 :"+this.x);
	}
}
class Test2 extends Test1
{
	int x;
	public Test2(int x1,int x2,int x3)
	{
		super(x1,x2);
		this.x=x3;
	}
	public void display()
	{
		super.display();
		System.out.println(" x3 :"+this.x);
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*Test2 ob=new Test2(1,2,3);
		ob.display(); */
		Test ref; 
		System.out.println("Enter value of a");
		Test ob=new Test (sc.nextInt());
		//ref=ob;
		System.out.println("Enter value of a,b");
		Test ob1=new Test1 (sc.nextInt(),sc.nextInt());
		//ref=ob1;
		System.out.println("Enter value of a,b,c");
		Test ob2=new Test2(sc.nextInt(),sc.nextInt(),sc.nextInt());
		//ref=ob2;
		ob.display();
		ob1.display();
		ob2.display();          //object  refrens call 
	}
}