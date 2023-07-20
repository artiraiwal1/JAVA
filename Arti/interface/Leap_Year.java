import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year:");	
		int year = sc.nextInt();
		if(year%400==0||year%4==0&&year%100==0)
			System.out.println("The Year is Leap Year");
		else 
			System.out.println("The Year not  is Leap Year");
	}
		
		
}