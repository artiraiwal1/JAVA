interface MyProgram
{
	public abstract void display();
}
class Opretion implements MyProgram
{
	public void display()
	{
		System.out.println(" Hello  Aarti.");
	}
}
class Test
{
	public static void main(String args[])
	{
		Opretion ob=new Opretion();
		ob.display();
	}
}