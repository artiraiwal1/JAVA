
// x^1  + x^3  + x^5  = 273

import java.util.Scanner;
class Series_10
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		
		int i=1,pow=1,x=1,sum=0;
		do
		{	
			pow=1;
			int j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			System.out.print(n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			sum+=pow;
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// x^1  - x^3  + x^5  = 219

class Series_10_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,pow=1,x=1,sum=0;
		do
		{	
			pow=1;
			int j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum-=pow;
				System.out.print(" - "+n1+"^"+x);
			}
			else
			{
				sum+=pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x);
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- x^1  + x^3  - x^5  = -219

class Series_10_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,pow=1,x=1,sum=0;
		do
		{	
			pow=1;
			int j=1;
			do
			{
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum+=pow;
				System.out.print(" + "+n1+"^"+x);
			}
			else
			{
				sum-=pow;
				
				System.out.print(" - "+n1+"^"+x);
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
