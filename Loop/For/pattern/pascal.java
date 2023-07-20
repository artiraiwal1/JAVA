import java.util.Scanner;
class Pascal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of Row");
		int row = sc.nextInt();
		int a,b,sum;
		for(int i=1;i<=row;i++)
		{
			int n = 1;
			int r = 1;
			int nr = 1;
			for(int j=1;j<=i;j++)
			{
				 n = n*=i;
				 r = r*=j;
				 nr = nr*=
				System.out.print(sum+" ");
				a=b;
				b=sum;
			}
			System.out.println();
		}
	}
}