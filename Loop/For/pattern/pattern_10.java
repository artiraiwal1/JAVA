/*
1 
2 3
4 5 6
7 8 9 10
*/
/*
7 8 9 10
4 5 6
2 3
1
*/

//not compleat

import java.util.Scanner;
class Pattern_10
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of row");
		int row = sc.nextInt();
		int i,k=row<<1,l=row<<1;
		/*for (i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.print("\n");
		}
		*/
		for (i=1;i<=row;i++)
		{
			if(i%2==0)
			{
				k=l;
				for(int j=1;j<=row-i+1;j++)
				{
					System.out.print(k+" ");
					k--;
					l--;
				}
			}
			else
			{
				
				k=l+i+1;
				for(int j=1;j<=row-i+1;j++)
				{
					System.out.print(k+" ");
					
					l--;
					k++;
				}
				
			}
			System.out.print("\n");
		}
		
	}
}