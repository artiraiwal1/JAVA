
//WAP to 1!/x^1 - 2!/x^2 + 3!/x^3 - 4!x^4 + 5!/x^5 =  3.0
import java.util.Scanner;
class Series_26
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float pow=1,sum=0,fact=1;
		for(int i=1;i<=y;i++)
		{
			pow = pow*x;
			fact*=i;
			if(i%2==0)
			{
				sum-=fact/pow;
				System.out.print(" - "+i+"!/"+x+"^"+i);
			}
			else 
			{
				sum+=fact/pow;
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!/"+x+"^"+i);
			}	
		}
		System.out.println(" = "+sum);
	}
}