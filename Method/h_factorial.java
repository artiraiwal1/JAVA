import java.util.Scanner;
import java.math.BigInteger;
//import java.lang.Math;
class Hfactorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		BigInteger fact = new BigInteger("1");
		
		for(int i = 1;i<=n;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);		
	}
}