
// 1/2!  + 3/4!  + 5/6!  =  0.6319444

import java.util.Scanner;
class Series_26
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i,x=1;
		float fact=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
			}
			sum += x/fact;
			System.out.print(x+"/"+(x+1)+"!");
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 1/2!  - 3/4!  + 5/6! =  0.38194445

class Series_26_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
	
		int i,x=1;
		float fact=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				
				fact*=j+1;
			}
			if(i%2==0)
			{
				sum-=x/fact;
				System.out.print(" - "+x+"/"+(x+1)+"!");
			}
			else
			{
				sum+=x/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"/"+(x+1)+"!");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- 1/2!  + 3/4!  - 5/6!  = - 0.38194445

class Series_26_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();

		int i,x=1;
		float fact=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
			}
			if(i%2==0)
			{
				sum+=x/fact;
				System.out.print(" + "+x+"/"+(x+1)+"!");
			}
			else
			{
				sum-=x/fact;
				
				System.out.print(" - "+x+"/"+(x+1)+"!");
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
 