class X
{
	static int x = 4040;
	static class Y
	{
		static int y = x++;
		static class Z
		{
			static int z=y;
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		System.out.println(X.x);
		System.out.println(X.Y.y);
		System.out.println(X.Y.Z.z);
	}
}