
// 1!/1  + 3!/2  + 5!/3  =  44.0

import java.util.Scanner;
class Series_19
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i,x=1;
		float sum=0,fact=1;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
			sum += fact/i;
			System.out.print(x+"!/"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 1!/1  - 3!/2  + 5!/3 = 38.0

class Series_19_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		int i,x=1;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=fact/i;
				System.out.print(" - "+x+"!/"+i);
			}
			else
			{
				sum+=fact/i;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+i);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 1!/1  + 3!/2  - 5!/3  = -38.0

class Series_19_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i,x=1;
		float sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
			if(i%2==0)
			{
				sum+=fact/i;
				System.out.print(" + "+x+"!/"+i);
			}
			else
			{
				sum-=fact/i;
				
				System.out.print(" - "+x+"!/"+i);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 