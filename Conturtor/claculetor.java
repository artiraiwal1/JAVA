import java.util.Scanner;
class CalculatorPOJO
{
	private double a,b,c,d;
	public void setA(double a)
	{
		this.a=a;
	}
	public void setB(double b)
	{
		this.b=b;
	}
	public void setC(double c)
	{
		this.c=c;
	}
	public void setD(double d)
	{
		this.d=d;
	}
	public double getA()
	{
		return this.a;
	}
	public double getB()
	{
		return this.b;
	}
	public double getC()
	{
		return this.c;
	}
	public double getD()
	{
		return this.d;
	}
}
//Business logic class..........
class CalculatorOpretion
{
	public double addTwo(CalculatorPOJO ob)
	{
		return ob.getA()+ob.getB();
	}
	public double addThree(CalculatorPOJO ob)
	{
		return ob.getA()+ob.getB()+ob.getC();
	}
		public double addFour(CalculatorPOJO ob)
	{
		return ob.getA()+ob.getB()+ob.getC()+ob.getD();
	}
	public double subTwo(CalculatorPOJO ob)
	{
		return ob.getA()-ob.getB();
	}
	public double subThree(CalculatorPOJO ob)
	{
		return ob.getA()-ob.getB()-ob.getC();
	}
	public double subFour(CalculatorPOJO ob)
	{
		return ob.getA()-ob.getB()-ob.getC()-ob.getD();
	}
	public double multiTwo(CalculatorPOJO ob)
	{
		return ob.getA()*ob.getB();
	}
	public double multiThree(CalculatorPOJO ob)
	{
		return ob.getA()*ob.getB()*ob.getC();
	}
	public double multiFour(CalculatorPOJO ob)
	{
		return ob.getA()*ob.getB()*ob.getC()*ob.getD();
	}
	public double divTwo(CalculatorPOJO ob)
	{
		return ob.getA()/ob.getB();
	}
	public double divThree(CalculatorPOJO ob)
	{
		return ob.getA()/ob.getB()/ob.getC();
	}
	public double divFour(CalculatorPOJO ob)	
	{
		return ob.getA()/ob.getB()/ob.getC()/ob.getD();
	}
	public double modTwo(CalculatorPOJO ob)
	{
		return ob.getA()%ob.getB();
	}
	public double fact(CalculatorPOJO ob)
	{
		for(int i=1;i<=ob.getA();i++)
		{
			int fact=ob.getA()*i;
		}
		return fact;
	}
}

}
//ceint class....
class Test
{
	public void input(CalculetorPOJO ob)
	{
		Scanner sc=new Scanner("Enter any number :");
		int a=sc.nextInt();
		ob.setA(a);
	}
	public void inputTwo(CalculatorPOJO ob)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ob.setA(a);
		ob.setB(b);
	}
	public void inputThree(CalculatorPOJO ob)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		ob.setA(a);
		ob.setB(b);
		ob.setC(c);
	}
	public void inputFour(CalculatorPOJO ob)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Four number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		ob.setA(a);
		ob.setB(b);
		ob.setC(c);
		ob.setD(d);
	}
	public static void main(String args[])
	{
		int ch;
		char n=0;
		do{
			Scanner sc=new Scanner(System.in);
			Test ob1=new Test();
			CalculatorPOJO ob=new CalculatorPOJO();
			CalculatorOpretion cl=new CalculatorOpretion();	
			System.out.println("\t1 for Two number addition :");    
			System.out.println("\t2 for Three number addition :");
			System.out.println("\t3 for Four number addition :");	
			System.out.println("\t4 for Two number Subtrection :");
			System.out.println("\t5 for Three number Subtrection :");	
			System.out.println("\t6 for Four number Subtrection :");
			System.out.println("\t7 for Two number Multiplication :");
			System.out.println("\t8 for Three number Multiplication :");
			System.out.println("\t9 for Four number Multiplication :")	;
			System.out.println("\t10 for Two number Division :");
			System.out.println("\t11 for Three number Division :");	
			System.out.println("\t12 Four number Division :");
			System.out.println("\t13 Two number Modual :");
			System.out.println("\t14 number of factorial :");
			System.out.println("Enter you choice :");
			ch=sc.nextInt();	
			double ans=0;
			switch(ch)
			{
				case  1 :
				
					ob1.inputTwo(ob);
					ans=cl.addTwo(ob);
					System.out.println("Addition :"+ans);
					break;
				case  2 :
				
					ob1.inputThree(ob);
					ans=cl.addThree(ob);
					System.out.println("Addition :"+ans);
					break;
				case  3 :
			
					ob1.inputFour(ob);
					ans=cl.addFour(ob);
					System.out.println("Addition :"+ans);
					break;
				case  4 :
				
					ob1.inputTwo(ob);
					ans=cl.subTwo(ob);
					System.out.println("Subtrection :"+ans);
					break;
				case  5 :
				
					ob1.inputThree(ob);
					ans=cl.subThree(ob);
					System.out.println("Subtrection :"+ans);
					break;
				case  6 :
				
					ob1.inputFour(ob);
					ans=cl.subFour(ob);
					System.out.println("Subtrection :"+ans);
					break;
				case  7 :
				
					ob1.inputTwo(ob);
					ans=cl.multiTwo(ob);
					System.out.println("Multiplication :"+ans);
					break;
				case  8 :
			
					ob1.inputThree(ob);
					ans=cl.multiThree(ob);
					System.out.println("Multiplication :"+ans);
					break;
				case  9 :
				
					ob1.inputFour(ob);
					ans=cl.multiFour(ob);
					System.out.println("Multiplication :"+ans);
					break;
				case  10 :
			
					ob1.inputTwo(ob);
					ans=cl.divTwo(ob);
					System.out.println("Division :"+ans);
					break;
				case  11 :
			
					ob1.inputThree(ob);
					ans=cl.divThree(ob);
					System.out.println("Division :"+ans);
					break;
				case  12 :
			
					ob1.inputFour(ob);
					ans=cl.divFour(ob);
					System.out.println("Division :"+ans);
					break;
				case  13 :
			
					ob1.inputTwo(ob);
					ans=cl.modTwo(ob);
					System.out.println("Division :"+ans);
					break;
				case 14 :
			
					ob1.input(ob);
					ans=cl.fact(ob);
					System.out.println("Factorial is :"+fact);
					break;   
				System.exit(0);
			}
				System.out.println("if you want use again for press  y/Y ");
				n=sc.next().charAt(0);
		}while(n=='y'||n=='Y');
	}