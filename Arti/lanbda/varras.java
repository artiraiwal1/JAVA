import java.util.Scanner;
class Var
{
	public static void display(int ... x)
	{
		int total=0;
		for(int x1:x)
		{
			total=total+x1;
		}
		System.out.println(total);
	}
	public static void main(String args[])
	{
		Var.display(10,20);
	}
}