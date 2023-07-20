 import java.util.Scanner;
interface Calculetor
{
	double calculetor();
}
class Calculetor
{
	Calculetor ob=(double a,double b)->{System.out.println("Addition :"+a+b;)};
	Calculetor ob1=(double a,double b)->{System.out.println("Subtrection :"+a-b;)};
	Calculetor ob2=(double a,double b)->{System.out.println("Multiplication :"+a*b;)};
	Calculetor ob3=(double a,double b)->{System.out.println("Division :"+a/b;)};
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter any two number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculetor.ob=calculetor(a,b);
		Calculetor ob1=calculetor(a,b);
		Calculetor ob2=calculetor(a,b);
		Calculetor ob3=calculetor(a,b);
	}
}