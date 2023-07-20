
// Fectorial
import java.util.Scanner;
class FactoriyalH
{
  public static void main(String[]args)
	{
		int n=100;
		long fact,i;
		Scanner sc = new Scanner(System.in);
		for( i=1,fact=1; i<=n;i++);
			fact*=i;
		System.out.println("Fact = "+fact);
	}
}		
