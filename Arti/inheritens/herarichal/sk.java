import java.util.Scanner;
abstract class Shape
{
	String name;
	double a;
	public abstract double area();

} 
 abstract class TwoD extends Shape
{
	public TwoD()
	{
		
	}
	public TwoD (double a)
	{
		super.a=a;
	}
	public abstract double peramiter();
}
abstract class ThreeD extends Shape
{
	public ThreeD()
	{
		
	}
	public ThreeD (double a)
	{
		super.a=a;
	}
	//public abstract double surfacearea();
	
	public abstract double volume();
} 
abstract class SideOne  extends TwoD
{
	public SideOne()
	{
	
	}
	public SideOne(double a)
	{
		super.a=a;
	}
	public abstract double peramiter();
}
class Square extends SideOne
{
	
	public Square(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return super.a*super.a;
	}
	public double peramiter()
	{
		return 4*super.a;
	}
}
class Circle extends SideOne
{
	public Circle(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return 3.14*super.a*super.a;
	}
	public double peramiter()
	{
		return 2*3.14*super.a;
	}
}
class Equilaterd extends SideOne
{
	public Equilaterd(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return (3.14*super.a*2)/4;
	}
	public double peramiter()
	{
		return 3*super.a;
	}
}
class Hexagon extends SideOne
{
	public Hexagon(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return (3*3.14*super.a*2)/2;
	}
	public double peramiter()
	{
		return 6*super.a;
	}
}
abstract class SideTwo  extends TwoD
{
	double b;
	public SideTwo()
	{

	}
	public SideTwo(double a,double b)
	{
		super.a=a;
		this.b=b;
	}
	public abstract double peramiter();
}
class Rectengle extends SideTwo
{
	public Rectengle (double a,double b)
	{
		super.a=a;
		super.b=b;
	}
	public double area()
	{
		return super.a*super.b;
	}
	public double peramiter()
	{
		return 2*(super.a+super.b);
	}
}
class Rhombus extends SideTwo
{
	public Rhombus (double a,double b)
	{
		super.a=a;
		super.b=b;
	}
	public double area()
	{
		return 2*super.a*super.b;
	}
	public double peramiter()
	{
		return 4*super.a;
	}
}
class Parallelogram extends SideTwo
{
	public Parallelogram(double a,double b)
	{
		super.a=a;
		super.b=b;
	}
	public double area()
	{
		return super.a*super.b;
	}
	public double peramiter()
	{
		return 2*super.a+super.b;
	}
}
class IsoscelesTriangle extends SideTwo
{
	public IsoscelesTriangle(double a,double b)
	{
		super.a=a;
		super.b=b;
	}
	public double area()
	{
		return 2*super.a*super.b;
	}
	public double peramiter()
	{
		return 2*super.a+super.b;
	}
}
abstract class SideThree  extends TwoD
{
	double b,c;
	public SideThree()
	{

	}
	public SideThree(double a,double b,double c)
	{
		super.a=a;
		this.b=b;
		this.c=c;
	}
	public abstract double peramiter();
}
 class Tringle extends SideThree
{
	public Tringle(double a,double b,double c)
	{
		super.a=a;
		super.b=b;
		super.c=c;
	}
	public double area()
	{
		return super.a*super.b/2;
	}
	public double peramiter()
	{
		return super.a+super.b+super.c;
	}
}
class Scalene extends SideThree
{
	public Scalene(double a,double b,double c)
	{
		super.a=a;
		super.b=b;
		super.c=c;
	}
	public double area()
	{
		return 2*super.a*super.b;
	}
	public double peramiter()
	{
		return super.a+super.b+super.c;
	}
}
class Trapezium extends SideThree
{
	double d;
	public Trapezium(double a,double b,double c,double d)
	{
		super.a=a;
		super.b=b;
		super.c=c;
		this.d=d;
	}
	public double area()
	{
		return 2*(super.a+super.b)*super.c;
	}
	public double peramiter()
	{
		return super.a+super.b+super.c+this.d;
	}
}
abstract class TsideOne extends ThreeD
{
	public TsideOne()
	{
	
	}
	public TsideOne(double a)
	{
		super.a=a;
	}
	//public abstract double surfacearea();
	public abstract double volume();
}
class Qube extends TsideOne
{
	public Qube(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return 6*super.a*super.a;
	}
	public double volume()
	{
		return super.a*super.a*super.a;
	}
}
class Sphere extends TsideOne
{
	public Sphere(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return 4*3.14*super.a*super.a;
	}
	public double volume()
	{
		return (3*3.14*super.a*super.a*super.a)/4;
	}
}
class Hemisphere extends TsideOne
{
	public Hemisphere(double a)
	{
		super.a=a;
	}
	public double area()
	{
		return 3*3.14*super.a*super.a;
	}
	public double volume()
	{
		return (3*3.14*super.a*super.a*super.a)/2;
	}
}
abstract class TsideTwo  extends ThreeD
{
	double b;
	public TsideTwo()
	{
	
	}
	public TsideTwo(double a,double b)
	{
		super.a=a;
		this.b=b;
	}
	
	//public abstract double area();
	public abstract double volume();
}
class Cylider extends TsideTwo
{
	public Cylider(double a,double b)
	{
		super.a=a;
		super.b=b;
	}
	public double area()
	{
		return 2*3.14*super.a*(super.a+super.b);
	}
	public double volume()
	{
		return 3.14*super.a*super.a*super.b;
	}
}
abstract class TsideThree  extends ThreeD
{
	double b,c;
	public TsideThree()
	{
	
	}
	public TsideThree(double a,double b,double c)
	{
		super.a=a;
		this.b=b;
		this.c=c;
	}
	//public abstract double area();
	public abstract double volume();
}
class Cone extends TsideThree
{
	public Cone(double a,double b,double c)
	{
		super.a=a;
		super.b=b;
		super.c=c;
	}
	public double area()
	{
		double base = 3.14*super.a*super.a;
		double area = 3.14*super.a*(super.a+Math.sqrt(super.b*super.b+super.a*super.a));
		return base+area;
	}
	public double volume()
	{
		return 3.14*super.a*super.a*(super.b/3);
	}
}
class Cuboid extends TsideThree
{
	
	public Cuboid (double a,double b,double c)
	{
		super.a=a;
		super.b=b;
		super.c=c;
	}
	public double area()
	{
		return 2*(super.a * super.b + super.b * super.a + super.c * super.a);
	}
	public double volume()
	{
		return super.b*super.c*super.a;
	}
} 
class Main
{
	public static void main(String args[])
	{
		int choice;
		double a,l,w,d;
		Scanner sc=new Scanner(System.in);
		do{
			
			
			System.out.println("---------------------------------------------");
			System.out.println("|                                           |");
			System.out.println("|           1  For TWO D                    |");
			System.out.println("|           2  For THREE D                  |");
			System.out.println("|           3  For Exit                     |");
			System.out.println("|___________________________________________|");
			System.out.println("ENtre your choice :");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 :
				do{
						System.out.println("--------------------------------------------");
						System.out.println("|                                           |");
						System.out.println("|   1 for : Area and peramiter Squar        |");
						System.out.println("|   2 for : Area and peramiter Circle       |");
						System.out.println("|   3 for : Area and peramiter Equilaterd   |");
						System.out.println("|   4 for : Area and peramiter Hexagon      |");
						System.out.println("|   5 for : exit                            |");
						System.out.println("|___________________________________________|");
						System.out.println("ENter your choice :");
						choice=sc.nextInt();
						switch(choice)
						{
							case  1 :

								System.out.println(" Enter vlaue of side :");
								a=sc.nextDouble();
								Square s=new Square(a);
								System.out.println("Square of area :"+s.area());
								System.out.println("Square of peramiter :"+s.peramiter());
								break;
						
							case  2 :
						
								System.out.println(" Enter vlaue of redius :");
								a=sc.nextDouble();
								Circle c=new Circle(a);
								System.out.println("Circle of area :"+c.area());
								System.out.println("Circle of peramiter :"+c.peramiter());
								break;
								
							case  3 :
						
								System.out.println(" Enter vlaue of redius :");
								a=sc.nextDouble();
								Equilaterd e=new Equilaterd(a);
								System.out.println("Equilaterd of area :"+e.area());
								System.out.println("Equilaterd of peramiter :"+e.peramiter());
								break;
							
							case  4 :
							
								System.out.println(" Enter vlaue of redius :");
								a=sc.nextDouble();
								Hexagon h=new Hexagon(a);
								System.out.println("Hexagon of area :"+h.area());
								System.out.println("Hexagon of peramiter :"+h.peramiter());
								break;

										//case  5 :	
													//System.exit(0);
						}
					
				case  2 :
									
					do{
						System.out.println("-----------------------------------------------");
						System.out.println("|                                              |");
						System.out.println("|   1 for : Area and peramiter Rectrengle      |");
						System.out.println("|   2 for : Area and peramiter Rhombus         |");
						System.out.println("|   3 for : Area and peramiter Parallelogram   |");
						System.out.println("|   4 for : Area and peramiter Isoscles        |");
						System.out.println("|   5 for : exit                               |");
						System.out.println("|______________________________________________|");
						System.out.println("Enter your choice :");
						choice=sc.nextInt();
						switch(choice)
						{
							case 1 :

								System.out.println(" Enter vlaue of haight :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of weight :");
								l=sc.nextDouble();
								Rectengle r=new Rectengle(a,l);
								System.out.println("Tringle of area :"+r.area());
								System.out.println("Tringle of peramiter :"+r.peramiter());
								break;
								
							case  2 :
						
								System.out.println(" Enter vlaue of haight :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of weight :");
								l=sc.nextDouble();
								Rhombus h=new Rhombus(a,l);
								System.out.println("Rhombus of area :"+h.area());
								System.out.println("Rhombus of peramiter :"+h.peramiter());
								break;
								
							case  3 :
					
								System.out.println(" Enter vlaue of haight :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of weight :");
								l=sc.nextDouble();
								Parallelogram p=new Parallelogram(a,l);
								System.out.println("Parallelogram of area :"+p.area());
								System.out.println("Parallelogram of peramiter :"+p.peramiter());
								break;
								
							case  4 :
						
								System.out.println(" Enter vlaue of haight :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of weight :");
								l=sc.nextDouble();
								IsoscelesTriangle i=new IsoscelesTriangle(a,l);
								System.out.println("IsoscelesTriangle of area :"+i.area());
								System.out.println("IsoscelesTriangle of peramiter :"+i.peramiter());
								break;	

											//case   5 :
															//System.exit(0);
						}
					}while(choice!=5);
					
					
				case 3 :
							
					do{
						System.out.println("|-----------------------------------------|");
						System.out.println("|                                         |");
						System.out.println("|   1 for : Area and peramiter Tringle    |");
						System.out.println("|   2 for : Area and peramiter Scalene    |");
						System.out.println("|   3 for : Area and peramiter Trapezium  |");
						System.out.println("|   4 for : Exit                          |");
						System.out.println("|_________________________________________|");
						System.out.println("Enter your choice :");
						choice=sc.nextInt();
						switch(choice)
						{
							case  1 :
							
								System.out.println(" Enter vlaue of base :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of langth :");
								l=sc.nextDouble();
								System.out.println(" Enter vlaue of haight :");
								w=sc.nextDouble();
								Tringle t=new Tringle(a,l,w);
								System.out.println("Tringle of area :"+t.area());
								System.out.println("Tringle of peramiter :"+t.peramiter());
								break;

							case  2 :
					
								System.out.println(" Enter vlaue of haight :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of weight :");
								l=sc.nextDouble();
								System.out.println(" Enter vlaue of langth :");
								w=sc.nextDouble();
								Scalene sl=new Scalene(a,l,w);
								System.out.println("Scalene of area :"+sl.area());
								System.out.println("Scalene of peramiter :"+sl.peramiter());
								break;
							
							case  3 :
					
								System.out.println(" Enter vlaue of haight :");
								a=sc.nextDouble();
								System.out.println(" Enter vlaue of weight :");
								l=sc.nextDouble();
								System.out.println(" Enter vlaue of langth :");
								w=sc.nextDouble();
								System.out.println(" Enter vlaue of langth :");
								d=sc.nextDouble();
								Trapezium tr=new Trapezium(a,l,w,d);
								System.out.println("Trapezium of area :"+tr.area());
								System.out.println("Trapezium of peramiter :"+tr.peramiter());
								break;			//System.exit(0);
						}
					}while(choice!=5);
			}	
							case  1 :
								do{
							
									System.out.println("----------------------------------------------");
									System.out.println("|                                             |");
									System.out.println("|   1 for : surfacearea and volume Qube       |");
									System.out.println("|   2 for : surfacearea and volume Sphere     |");
									System.out.println("|   3 for : surfacearea and volume Hemispher  |");
									System.out.println("|   4 for : Exit                              |");
									System.out.println("|_____________________________________________|");
									System.out.println("Enter your choice :");
									choice=sc.nextInt();
									switch(choice)
									{
											case 1 :
							
													System.out.println(" Enter vlaue of side :");
													a=sc.nextDouble();
													Qube q=new Qube(a);
													System.out.println("Qube of surfacearea :"+q.area());
													System.out.println("Qube of volume :"+q.volume());
													break;
									
											case 2 :
									
													System.out.println(" Enter vlaue of side :");
													a=sc.nextDouble();
													Sphere s=new Sphere(a);
													System.out.println("Sphere of surfacearea :"+s.area());
													System.out.println("Sphere of volume :"+s.volume());
													break;
									
											case  3 :
								
													System.out.println(" Enter vlaue of side :");
													a=sc.nextDouble();
													Hemisphere h=new Hemisphere(a);
													System.out.println("Hemispher of surfacearea :"+h.area());
													System.out.println("Hemispher of volume :"+h.volume());
													break;
											case  4 :
													System.exit(0);
									}
								}while(choice!=5);
							case 2 :
									
									do{
										System.out.println("--------------------------------------------");
										System.out.println("|                                          |");
										System.out.println("|   1 for : surfacearea and volume Cylider |");
										System.out.println("|   2 for : Exit                           |");
										System.out.println("|__________________________________________|");
										System.out.println("Enter your choice :");
										choice=sc.nextInt();
										switch(choice)
										{
											case  1 :
											
													System.out.println(" Enter vlaue of redius :");
													a=sc.nextDouble();
													System.out.println(" Enter vlaue of haight :");
													l=sc.nextDouble();
													Cylider y=new Cylider(a,l);
													System.out.println("Cylider of surfacearea :"+y.area());
													System.out.println("Cylider of volume :"+y.volume());
													break;
													
											case  2 :
													System.exit(0);
										}
									}while(choice!=3);	
									
							case 3 :
										do{
											System.out.println("--------------------------------------------");
											System.out.println("|                                          |");
											System.out.println("|   1 for : surfacearea and volume Cone    |");
											System.out.println("|   2 for : surfacearea and Volume Cuboid  |");
											System.out.println("|   3 for : Exit                           |");
											System.out.println("|__________________________________________|");
											System.out.println("Enter your choice :");
											choice=sc.nextInt();
											switch(choice)
											{
												case 1 :
													
														System.out.println(" Enter vlaue of redius :");
														a=sc.nextDouble();
														System.out.println(" Enter vlaue of haight :");
														l=sc.nextDouble();
														System.out.println(" Enter vlaue of weight :");
														w=sc.nextDouble();
														Cone co=new Cone(a,l,w);
														System.out.println("Cone of surfacearea :"+co.area());
														System.out.println("Cone of volume :"+co.volume());
														break;
												
												case  2 :
															
														System.out.println(" Enter vlaue of langth :");
														l=sc.nextDouble();
														System.out.println(" Enter vlaue of breadth :");
														w=sc.nextDouble();
														System.out.println(" Enter vlaue of haight :");
														a=sc.nextDouble();
														Cuboid cu=new Cuboid(l,w,a);
														System.out.println("Cuboid of surfacearea :"+cu.area());
														System.out.println("Cuboid of volume :"+cu.volume());
														break;
														
											//	case  3 :

														//System.exit(0);
												}
										}while(choice!=3);
									/* case 4 :
										System.exit(0); */
			}while(choice!=4);		
		}
	}while(choice!=3);
	}
		
}	
			