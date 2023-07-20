import java.util.Scanner;
class Count
{
		static int count;
		public Count()
		{
			count++;
		}
}
class Test
{
	public static void main(String args[])
	{
		Count ob=new Count();
		Count ob1=new Count();
		Count ob2=new Count();
		Count ob3=new Count();
		Count ob4=new Count();
		System.out.println(Count.count);
	}
}