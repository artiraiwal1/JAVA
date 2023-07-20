import java.util.Scanner;
class Calculetor
{
	public static int calculetor(int ...a);
	{
		return a+b+c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println("Addtion :"+Calculetor.calculetor(a,b,c));
	}
}