
// 2!/x^1  + 4!/x^3  + 6!/x^5  =   4.5185184

import java.util.Scanner;
class Series_16
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact=1;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			sum += fact/pow;
			System.out.print((x+1)+"!/"+x+"^"+ x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		
		}
		System.out.print(" = "+sum);
	}
}


// 2!/x^1  - 4!/x^3  + 6!/x^5 = 2.7407408

class Series_16_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			if(i%2==0)
			{
				sum-=fact/pow;
				System.out.print(" - "+(x+1)+"!/"+x+"^"+ x);
			}
			else
			{
				sum+=fact/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print((x+1)+"!/"+x+"^"+ x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 2!/x^1  + 4!/x^3  - 6!/x^5  = -2.740740866

class Series_16_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			if(i%2==0)
			{
				sum+=fact/pow;
				System.out.print(" + "+(x+1)+"!/"+x+"^"+ x);
			}
			else
			{
				sum-=fact/pow;
				
				System.out.print(" - "+(x+1)+"!/"+x+"^"+ x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 