
import java.util.Scanner; 
class AddNum
{ 
	public static void main(String[]args)
	{
		int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int a=sc.nextInt();  
		int b=sc.nextInt(); 
		
		AddNum operation = new AddNum();
		
		sum =operation.addNum(a,b);
		
		System.out.println("Sum = "+sum);		
	}
	 int addNum(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
 }
