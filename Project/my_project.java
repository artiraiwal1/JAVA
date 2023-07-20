import java.util.Scanner;
class MyProject
{
	
  public static void main(String[]args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Your choice are ");
		System.out.println("\t 1 For Meanu\n\t 2 For Exit");
		choice = sc.nextInt();
		int day,per;
		do
		{
			switch(choice)
			{
				case 1:
					System.out.println("Your choice are ");
					System.out.println("\t 3 For AC\t\t\t 4 For Non AC\n\t\t\t 2 For Exit");
					choice = sc.nextInt();
					
					switch(choice)
					{
						case 3:
							System.out.println("Your choice are ");
							System.out.println("\t 5 For 1-5 person\nt\t\t 6 For 5-8 person\n\t\t\t 2 For Exit");
							choice = sc.nextInt();
							switch(choice)
							{
								case 5:
									System.out.println("\t 5k par day");
									System.out.println("\t Enter number of day");
									day = sc.nextInt();
									System.out.println("\t Enter number of person");
									per = sc.nextInt();
									System.out.println("\t your Bill "+day*per);
									break;
								case 6:
									System.out.println("\t 5k par day");
									System.out.println("\t Enter number of day");
									day = sc.nextInt();
									System.out.println("\t Enter number of person");
									per = sc.nextInt();
									System.out.println("\t your Bill "+day*per);
									break;
							}
							break;
						case 4:
							System.out.println("Your choice are ");
							System.out.println("\t 5 For 1-5 person\n\t 6 For 5-8");
							choice = sc.nextInt();
					}
					break;
				case 2:
					System.exit(0);
			}
			
		}while(choice!=2);
	}
}