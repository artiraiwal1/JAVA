
// 1/x^1  + 2/x^3  + 3/x^5  = 0.41975307

import java.util.Scanner;
class Series_22
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			sum += i/pow;
			System.out.print(n1+"^"+x+"/"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		
		}
		System.out.print(" = "+sum);
	}
}


// 1/x^1  - 2/x^3  + 3/x^5 = 0.27160496

class Series_22_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=i/pow;
				System.out.print(" - "+n1+"^"+x+"/"+i);
			}
			else
			{
				sum+=i/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"!");
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/x^1  + 2/x^3  - 3/x^5  = - 0.27160496

class Series_22_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0;
		
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=i/pow;
				System.out.print(" + "+n1+"^"+x+"/"+i);
			}
			else
			{
				sum-=i/pow;
				
				System.out.print(" - "+n1+"^"+x+"/"+i);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
 