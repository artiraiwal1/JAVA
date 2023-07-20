import java.util.Scanner;
interface MyInf1
{
	abstract double calculetor(double a);
}
class Calculetor
{
	MyInf1 ref=new MyInf1()
	{
		public double calculetor(double a)
		{
			return a*a;
		}
	}
	MyInf1 ref=new MyInf1()
	{
		public double calculetor(double a)
		{
			return a*a*a;
		}
	}
}
interface MyInf2
{
	abstract double calculetor(double a,double b);

}
class Calculetor 
{
	MyInf2 ref1=new MyInf2()
	{
		public double calculetor(double a,double b)
		{
			return a+b;
		}
	};
	MyInf2 ref2=new MyInf2()
	{
		public double calculetor(double a,double b)
		{
			return a-b;
		}
	};
	MyInf2 ref3=new MyInf2()
	{
		public double calculetor(double a,double b)
		{
			return a*b;
		}
	};
	MyInf2 ref4=new MyInf2()
	{
		public double calculetor(double a,double b)
		{
			return a/b;
		}
	};
	MyInf2 ref5=new MyInf2()
	{
		public double calculetor(double a,double b)
		{
			return a%b;
		}
	};
}
interface MyInf3
{
	abstract double calculetor(double a,double b,double c)

}
class Calculetor 
{
	MyInf3 ref1=new MyInf3()
	{
		public double calculetor(double a,double b,double c)
		{
			return a+b+c;
		}
	};
	MyInf3 ref2=new MyInf3()
	{
		public double calculetor(double a,double b,double c)
		{
			return a-b-c;
		}
	};
	MyInf3 ref3=new MyInf3()
	{
		public double calculetor(double a,double b,double c)
		{
			return a*b*c;
		}
	};
	MyInf3 ref4=new MyInf3()
	{
		public double calculetor(double a,double b,double c)
		{
			return a/b/c;
		}
	};
	MyInf3 ref5=new MyInf3()
	{
		public double calculetor(double a,double b,double c)
		{
			return a%b%c;
		}
	};
}  
interface MyInf4
{
	abstract double calculetor(double a,double b,double c,double d)
}
class Calculetor 
{
	MyInf4 ref1=new MyInf4()
	{
		public double calculetor(double a,double b,double c,double d)
		{
			return a+b+c+d;
		}
	};
	MyInf4 ref2=new MyInf4()
	{
		public double calculetor(double a,double b,double c,double d)
		{
			return a-b-c-d;
		}
	};
	MyInf4 ref3=new MyInf4()
	{
		public double calculetor(double a,double b,double c,double d)
		{
			return a*b*c*d;
		}
	};
	MyInf4 ref4=new MyInf4()
	{
		public double calculetor(double a,double b,double c,double d)
		{
			return a/b/c/d;
		}
	};
	MyInf4 ref5=new MyInf4()
	{
		public double calculetor(double a,double b,double c,double d)
		{
			return a%b%c%d;
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
		System.out.println(" How many number do you want to calculet :");
		System.out.println("\t 1 for 1 number :");
		System.out.println("\t 2 for 2 number :");
		System.out.println("\t 3 for 3 number :");
		System.out.println("\t 4 for 4 number :");
		choice=sc.nextInt();
		switch(chioce)
		{
			case 1 :
					System.out.println(" 1 for Square ");
					System.out.println(" 2 for Qube ");
					System.out.println(" 5 for Factorial ");
					System.out.println("Enter your choice ");
					choice=sc.nextInt();
					switch(choice)
					{
						case 1 :  
						
								break;
						case 2 :
						
								break;
						case 3 :
						
								break;
					}
			case 2 :
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
}