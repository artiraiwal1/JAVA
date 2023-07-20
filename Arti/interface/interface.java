import java.util.Scanner;
interface MyInf
{
	abstract double calculetor(double a,double b);
}
class Calculetor 
{
	MyInf ref1=new MyInf()
	{
		public double calculetor(double a,double b)
		{
			return a+b;
		}
	};
	MyInf ref2=new MyInf()
	{
		public double calculetor(double a,double b)
		{
			return a-b;
		}
	};
	MyInf ref3=new MyInf()
	{
		public double calculetor(double a,double b)
		{
			return a*b;
		}
	};
	MyInf ref4=new MyInf()
	{
		public double calculetor(double a,double b)
		{
			return a/b;
		}
	};
	MyInf ref5=new MyInf()
	{
		public double calculetor(double a,double b)
		{
			return a%b;
		}
	};
} 
class Test
{
	public static void main(String args[])
	{
		int choice;
		double a,b;
		Scanner sc=new Scanner(System.in);
		Calculetor ob=new Calculetor();
		do{
			System.out.println("|-----------------------------------------|");
			System.out.println("|           1 For : Addition              |");
			System.out.println("|           2 For : Subtraction           |");
			System.out.println("|           3 For : Multiplication        |");	
			System.out.println("|           4 For : Division              |");
			System.out.println("|           5 For : Modual                |");
			System.out.println("|           6 For : Exit                  |");	
			System.out.println("|-----------------------------------------|");	
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			switch(choice)
			{
				case  1 :
						System.out.println(" Enter value of a :");
						a=sc.nextInt();
						System.out.println(" Enter value of b :");
						b=sc.nextInt();
						System.out.println("Adddition  :"+ob.ref1.calculetor(a,b));
						break;
				case  2 :
						System.out.println(" Enter value of a :");
						a=sc.nextInt();
						System.out.println(" Enter value of b :");
						b=sc.nextInt();
						System.out.println("suntraction  :"+ob.ref2.calculetor(a,b));
						break;
				case  3 :
						System.out.println(" Enter value of a :");
						a=sc.nextInt();
						System.out.println(" Enter value of b :");
						b=sc.nextInt();
						System.out.println("maltiplication  :"+ob.ref3.calculetor(a,b));
						break;
				case  4 :
						System.out.println(" Enter value of a :");
						a=sc.nextInt();
						System.out.println(" Enter value of b :");
						b=sc.nextInt();
						System.out.println("division  :"+Math.round(ob.ref4.calculetor(a,b)*1000)/1000.0);
						break;
				case  5 :
						System.out.println(" Enter value of a :");
						a=sc.nextInt();
						System.out.println(" Enter value of b :");
						b=sc.nextInt();
						System.out.println("modual  :"+ob.ref5.calculetor(a,b));
						break;
				case  6 :
						System.exit(0);
			}
		}while(choice!=7);
		
	}
}