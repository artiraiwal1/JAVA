import java.util.Scanner;
class Ser
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter of base :");
		int a=sc.nextInt();
		System.out.println("Enter any number ");
		int b=sc.nextInt();
		int pow=0,fact=1,sum=0;
		for(int i=1;i<=a;i++)
		{
			pow=a*i;
			fact=fact*i;
			for(int j=1;j<=a;j++)
			{
				sum=sum+pow/fact;
				System.out.print("")
			}
		}
	}
}