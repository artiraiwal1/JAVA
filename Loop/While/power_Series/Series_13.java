
//WAP to 2/x^1 + 3/x^2 + 4/x^3 + 5/x^4 + 6/x^5 = 2.75
import java.util.Scanner;
class Series_13
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i=1,j=2;
		float pow=1,sum=0;
		System.out.println("Enter any two number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		while(i<=n2)
		{
			pow = pow*n1;
			sum+=(j/pow);
			
			System.out.print(j+"/"+n1+"^"+i);
			if(i<n2)
				System.out.print(" + ");
	
			i++;
			j++;
		}
		System.out.println(" = "+sum);
	}
}