import java.util.Scanner;
/*
interface MyLambda	
{
	void display();
}
class Myfirst
{
	public static void main(String agrs[])
	{
		MyLambda ob=()->{System.out.println("hello display");};
		MyLambda ob1=()->{System.out.println("hello Aarti");};
		ob.display();
		ob1.display();
	}	
} */
interface MyLambda	
{
	String display();
}
class Myfirst
{
	public static void main(String agrs[])
	{
		MyLambda ob=()->("a");
		//MyLambda ob1=( b)->(return b*b);
		System.out.println(ob.display());
		//System.out.println(ob1.display(8));
	}
}	