import java.util.Scanner;
class BubbleSort
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[20];
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1) +" Element of array : ");
			a[i]= sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j = i+1; j<n; j++)
			{
				if(a[i] > a[j+1])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}