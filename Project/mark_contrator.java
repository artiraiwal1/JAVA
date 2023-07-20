import java.util.Scanner; 
	 
	class DataClass      //POJO Class 
	{ 
		private String name; 
		private String fname; 
		private String mname; 
		private String sem;  
		private String branch; 
		private int year; 
		private int total; 
		private double per; 
		private String corse; 
		private int roll;         
		private int physics; 
		private int chemistry; 
		private int math; 
		private int hindi; 
		private int english; 
		public DataClass(int roll,String name,String fname,String mname,String corse,String branch,String sem,int year,int physics,int chemistry,int math,int hindi,int english,int total) 
        { 
            this.roll = roll; 
            this.name = name; 
            this.fname = fname; 
            this.mname = mname; 
            this.corse = corse; 
            this.branch = branch; 
            this.sem = sem; 
            this.year = year; 
            this.physics = physics; 
            this.chemistry = chemistry; 
            this.math = math; 
            this.hindi = hindi; 
			this.english = english;
			this.total=total;
			
		}
		public void setRoll(int roll) 
		{ 
            this.roll = roll; 
		} 
		public void setName(String name) 
		{ 
            this.name = name; 
		} 
		public void setFatherName(String fname) 
		{ 
            this.fname = fname; 
		} 
		public void setMotherName(String mname) 
		{ 
            this.mname = mname; 
		} 
		public void setCorse(String corse) 
		{ 
            this.corse = corse; 
		} 
		public void setBranch(String branch) 
		{ 
            this.branch = branch; 
		}	 
		public void setSem(String sem) 
		{ 
            this.sem = sem; 
		} 
		public void setYear(int year) 
		{ 
            this.year = year; 
		} 
		public void setPhysics(int physics) 
		{ 
            this.physics = physics; 
		} 
		public void setChemistry(int chemistry) 
		{ 
            this.chemistry = chemistry; 
		} 
		public void setMath(int math) 
		{ 
            this.math = math; 
		} 
		public void setHindi(int hindi) 
		{ 
            this.hindi = hindi; 
		} 
		public void setEnglish(int english) 
		{ 
            this.english = english; 
		} 
		public void setTotel() 
		{ 
            this.total = getphysics()+getchemistry()+getmath()+gethindi()+getenglish(); 
		}	 
		public void setPer() 
		{ 
            this.per = getTotal()/5.0; 
		}
		public int getRollNumber() 
		{ 
           return this.roll; 
		} 
		public String getName() 
		{ 
           return this.name; 
		} 
		public String getFName() 
		{ 
           return this.fname; 
		} 
		public String getMName() 
		{ 
           return this.mname; 
		} 
		public String getCorse() 
		{ 
           return this.corse; 
		}	 
		public String getBranch() 
		{ 
           return this.branch; 
		} 
		public String getSem() 
		{ 
            return this.sem; 
		} 
		public int getYear() 
		{ 
            return this.year; 
		} 
		public int getphysics() 
		{ 
            return this.physics; 
		} 
		public int getchemistry() 
		{ 
            return this.chemistry; 
		} 
		public int getmath() 
		{ 
            return this.math; 
		} 
		public int gethindi() 
		{ 
           return this.hindi; 
		} 
		public int getenglish() 
		{ 
          return this.english; 
		} 
		public double getPer() 
		{ 
          return this.per; 
		} 
		public int getTotal() 
		{ 
          return this.total; 
		} 
	} 
 class Operation     //Buisnnis logic Class 
 { 
         public void choice(DataClass student[],int n,Operation ob2) 
        { 
            Scanner sc = new Scanner(System.in); 
            int choice,searchRoll; 
            boolean flag; 
            String searchName; 
                do 
                { 
                    flag = true; 
				    System.out.println("_____________________________________________________________________________");
                    System.out.println("|                           |    Your choices are   |                        |");
				    System.out.println("|                           ------------------------                         |");
					System.out.println("|    ______________________________      ________________________            |");
                    System.out.println("|   | 1. For Search by Roll Number |    | 2. For Search by Name  |           |");
					System.out.println("|   -------------------------------      ------------------------            |");
					System.out.println("|    ______________________________     ___________________________          |");
					System.out.println("|   |  3. For Search by Division   |   | 4. For All MarkSheet      |         |"); 
					System.out.println("|   -------------------------------    -----------------------------         |");
					System.out.println("|   __________________________________       __________________              |");
                    System.out.println("|  | 5. For search by parsentege      |     | 6. For Exit      |             |");
					System.out.println("|   ----------------------------------       -------------------             |");
					System.out.println("|____________________________________________________________________________|");
                    System.out.println("  Enter Your choice :  ");
					choice = sc.nextInt(); 
					sc.nextLine(); 
					switch(choice) 
					{ 
						case 1: 
								System.out.print("Enter Your Roll Number : "); 
								searchRoll = sc.nextInt(); 
								for(int i=0;i<n;i++) 
								{ 
									if(student[i].getRollNumber()==searchRoll) 
									{ 
										ob2.printMarksheet(student,i); 
										flag = false; 
										break; 
									} 
								} 
								if(flag) 
								{ 
									System.out.print("Enter Roll Number Is Not avileble : "); 
								} 
							break;  
						case 2: 
								System.out.print("Enter Your Name : "); 
								searchName = sc.nextLine(); 
								for(int i=0;i<n;i++) 
								{ 
									if(student[i].getName().equals(searchName)) 
									{ 
										ob2.printMarksheet(student,i); 
										flag = false; 
									} 
								} 
								if(flag) 
								{ 
									System.out.print("Enter Name Is Not avileble : "); 
								} 
							break; 
						case 3: 
								ob2.searchDivision(student,n,ob2); 
							break; 
						case 4: 
								for(int i=0;i<n;i++) 
								{ 
									ob2.printMarksheet(student,i); 
								} 
							break;
						case 5: 
								ob2.searchPer(student,n,ob2);
							break;
                    } 
                }while(choice!=5);         
        }
		public void searchPer(DataClass student[],int n,Operation ob2)
		{
			Scanner sc=new Scanner(System.in);
			//double searchPer;
			boolean flag;
			int choice;
			do
			{
				flag=true;
				System.out.println(" ______________________________________________________________ ");
				System.out.println("|                     |   Your choices are |                    |");
				System.out.println("|                      --------------------                     |");
				System.out.println("|    _______________________       ________________________     |");
				System.out.println("|   | 1. For 60  Parsentege |     | 2. For  75 parsentege  |    |"); 
				System.out.println("|    -----------------------       ------------------------     |");
				System.out.println("|    _______________________       ________________________     |"); 
				System.out.println("|   | 3. For 85  Parsentege |     | 4. For 95  Parsentege |     |"); 
				System.out.println("|    -----------------------       -----------------------      |");
				System.out.println("|     _______________________      ________________________     |"); 
				System.out.println("|    |    5. For Exit       |     |  6 . For back        |      |"); 
				System.out.println("|     -----------------------      -----------------------      |");
				System.out.println("|_______________________________________________________________|"); 
				System.out.print("   Enter Your choice : ");
				choice = sc.nextInt();				
				switch(choice)
				{
					case  1 :
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=60)
									{
									  ob2.printMarksheet(student,i); 
									   flag = false;
									}
								}if(flag)
								{
									System.out.println("Enter your parsentege is Not avileble :");
								}
							break;
					case  2 :
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=75)
									{
									  ob2.printMarksheet(student,i); 
									   flag = false;
									}
								}if(flag)
								{
									System.out.println("Enter your parsentege is Not avileble :");
								}
							break;
					case  3 :
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=85)
									{
									  ob2.printMarksheet(student,i); 
									   flag = false;
									}
								}if(flag)
								{
									System.out.println("Enter your parsentege is Not avileble :");
								}
							break;
					case  4 :
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=95)
									{
									  ob2.printMarksheet(student,i); 
									   flag = false;
									}
								}if(flag)
								{
									System.out.println("Enter your parsentege is Not avileble :");
								}
							break;
					
							
				}
			}while(choice!=6);
		}
        public void searchDivision(DataClass student[],int n,Operation ob2) 
        { 
			Scanner sc = new Scanner(System.in); 
			boolean flag; 
			int choice; 
			do 
			{ 
				flag = true; 
				System.out.println(" ______________________________________________________________ ");
				System.out.println("|                     |   Your choices are |                    |");
				System.out.println("|                      --------------------                     |");
				System.out.println("|    _______________________       ________________________     |");
				System.out.println("|   | 1. For First Division |     | 2. For Second Division |    |"); 
				System.out.println("|    -----------------------       ------------------------     |");
				System.out.println("|    _______________________       ________________________     |"); 
				System.out.println("|   | 3. For Third Division |     |     6. For Back       |     |"); 
				System.out.println("|    -----------------------       -----------------------      |");
				System.out.println("|_______________________________________________________________|"); 
				System.out.print("   Enter Your choice : "); 
				choice = sc.nextInt(); 
				switch(choice) 
				{ 
					case 1: 
							for(int i=0;i<n;i++) 
							{ 
								if(student[i].getPer()>=60&&student[i].getPer()<=100&&student[i].getphysics()>33&&student[i].getchemistry()>33&&student[i].getmath()>33&&student[i].gethindi()>33&&student[i].getenglish()>33) 
								{ 
									ob2.printMarksheet(student,i); 
									flag = false; 
								} 
							} 
							if(flag) 
							{ 
								System.out.println("First Division student Not avileblele"); 
							} 
							break; 
					case 2: 
							for(int i=0;i<n;i++) 
							{ 
								if(student[i].getPer()>=45&&student[i].getPer()<60&&student[i].getphysics()>33&&student[i].getchemistry()>33&&student[i].getmath()>33&&student[i].gethindi()>33&&student[i].getenglish()>33) 
									{ 
										ob2.printMarksheet(student,i); 
										flag = false; 
									} 
							} 
							if(flag) 
							{ 
								System.out.println("Second Division student Not avileble"); 
							} 
							break; 
					case 3: 
							for(int i=0;i<n;i++) 
							{ 
								if(student[i].getPer()>=33&&student[i].getPer()<45&&student[i].getphysics()>33&&student[i].getchemistry()>33&&student[i].getmath()>33&&student[i].gethindi()>33&&student[i].getenglish()>33) 
									{ 
										ob2.printMarksheet(student,i); 
										flag = false; 
										} 
									} 
							if(flag) 
								{ 
									System.out.println("Third Division student Not avileble"); 
								}
							}									
							break;
						
			}while(choice!=6); 
        } 
  
        public void printMarksheet(DataClass ref[],int i) 
        {         
			Operation ob = new Operation(); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println("   |\t\t\t - : VIKARM UNIVERSITY : -   \n   | "); 
			System.out.println("   |\n"); 
			System.out.println("   |\tName  : " + ref[i].getName() + "\t\t\t\t\tBranch : " + ref[i].getBranch()); 
			System.out.println("   |\tFName : " + ref[i].getFName() + "\t\t\t\t\tSem    : " + ref[i].getSem()); 
			System.out.println("   |\tMName : " + ref[i].getMName() + "\t\t\t\t\tYear   : " + ref[i].getYear()); 
			System.out.println("   |\tRoll  : " + ref[i].getRollNumber() + "\t\t\t\t\tCourse : " + ref[i].getCorse() + "\n"); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" ); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\tBSC501       Physics        100            33            " + ref[i].getphysics() ); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\tBSC502       Chemistry      100            33            " + ref[i].getchemistry() ); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\tBSC503       Math           100            33            " + ref[i].getmath()); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\tBSC504       Hindi          100            33            " + ref[i].gethindi() ); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\tBSC505       English        100            33            " + ref[i].getenglish()); 
			System.out.println("   --------------------------------------------------------------------"); 
			System.out.println( "   |\n   |" ); 
			ob.division(ref,i); 
			System.out.println("\n"); 
			System.out.println("   ------------------- This Marksheet is of "+ref[i].getName()+ "  ---------------------"); 
  
        } 
        public void division(DataClass ref[],int i) 
        { 
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 &&ref[i].getmath() < 33 &&ref[i].gethindi() < 33 &&ref[i].getenglish() < 33)  
			{ 
				System.out.println("   |\tFail in All sub"); 
			}  
			else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 & ref[i].getenglish() < 33) ||(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||(ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)) 
			{ 
				System.out.println("   |\tStatus     : Fail"); 
				if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33)  
					{ 
						System.out.println("   |\tFail in phycics,getchemistry(),mathes,Hindi"); 
					}  
					else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 & ref[i].getenglish() < 33) 
					{ 
						System.out.println("   |\tFail in phycics,chemistry,mathes,enlish"); 
					}  
					else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
					{ 
						System.out.println("   |\tFail in phycics,mathes,hindi,enlish"); 
					}          
					else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
					{ 
						System.out.println("   |\tFail in phycics,chemistry,hindi,enlish"); 
					} 
					else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
					{ 
						System.out.println("   |\tFail in chemistry,mathes,hindi,enlish"); 
					} 
			} 
			else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) || 
					(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) || 
					(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) || 
					(ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) || 
					(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) || 
					(ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) || 
					(ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) || 
					(ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) || 
					(ref[i].getenglish() < 33 && ref[i].getmath() < 33 && ref[i].getchemistry() < 33) || 
					(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33)) 
					{ 
						System.out.println("   |\tStatus     : Fail"); 
						if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33)  
						{ 
					
							System.out.println("   |\tFail in physics,chemistry,mathes"); 
						} 
						else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33)  
						{ 
							System.out.println("   |\tFail in physics,chemistry,Hindi"); 
                        } 
						else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33)  
						{ 
							System.out.println("   |\tFail in physics,mathes,hindi"); 
						}  
						else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) 
						{ 
							System.out.println("   |\tFail in chemistry,mathes,hindi"); 
						} 
                        else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33)  
                        { 
							System.out.println("   |\tFail in physics,chemistry,enlish"); 
						} 
						else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
						{ 
							System.out.println("   |\tFail in chemistry,Hindi,enlish"); 
						} 
						else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
						{ 
							System.out.println("   |\tFail in mathes,Hindi,enlish"); 
						}  
						else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
						{ 
							System.out.println("   |\tFail in physics,Hindi,english"); 
						} 
						else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33) 
						{ 
							System.out.println("   |\tFail in chemistry,mathes,enlish"); 
						} 
						else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33)  
						{ 
							System.out.println("   |\tFail in physics,mathes,enlish"); 
						} 
					} 
					else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33) ||(ref[i].getphysics() < 33 && ref[i].getmath() < 33) || 
							(ref[i].getphysics() < 33 && ref[i].gethindi() < 33) ||(ref[i].getphysics() < 33 && ref[i].getenglish() < 33) || 
							(ref[i].getchemistry() < 33 && ref[i].getmath() < 33) ||(ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) || 
							(ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) ||(ref[i].getmath() < 33 && ref[i].getenglish() < 33) || 
							(ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||(ref[i].gethindi() < 33 && ref[i].getenglish() < 33)) 
							{ 
								System.out.println("   |\tStatus     : Supply in two Subject"); 
								if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33) 
								{ 
									System.out.println("   |\tFail in physics,chemistry"); 
								} 
								else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33) 
								{ 
									System.out.println("   |\tFail in physics,getmath()es"); 
								}  
								else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33)  
								{ 
									System.out.println("   |\tFail in physics,gethindi()"); 
								}  
								else if (ref[i].getphysics() < 33 && ref[i].getenglish() < 33) 
								{ 
									System.out.println("   |\tFail in physics,english"); 
								}	 
								else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33)  
								{ 
									System.out.println("   |\tFail in chemistry,getmath()es"); 
								} 
								else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33)  
								{ 
									System.out.println("   |\tFail in chemistry,Hindi"); 
								} 
								else if (ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) 
								{ 
									System.out.println("   |\tFail in chemistry,english"); 
								} 
								else if (ref[i].getmath() < 33 && ref[i].getenglish() < 33)  
								{ 
									System.out.println("   |\tFail in Mathes,English"); 
								}  
								else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33) 
								{ 
									System.out.println("   |\tFail in Mathes,Hindi"); 
								}  
								else if (ref[i].gethindi() < 33 && ref[i].getenglish() < 33) 
								{ 
									System.out.println("   |\tFail in Hindi,English"); 
								} 
							} 
							else if (ref[i].getphysics() < 33 ||ref[i].getchemistry() < 33 ||ref[i].getmath() < 33 ||ref[i].gethindi() < 33 ||ref[i].getenglish() < 33 ) 
							{ 
							System.out.println("   |\tStatus     : Supply in one Subject"); 
							if (ref[i].getphysics() < 33)  
							{ 
                                System.out.println("   |\tFail in physics"); 
							}  
							else if (ref[i].getchemistry() < 33) 
                            { 
								System.out.println("   |\tFail in chemistry"); 
							}  
							else if (ref[i].getmath() < 33) 
							{ 
								System.out.println("   |\tFail in mathes"); 
							} 
							else if (ref[i].gethindi() < 33)  
							{ 
								System.out.println("   |\tFail in hindi"); 
							}
							else if (ref[i].getenglish() < 33)  
							{ 
								System.out.println("   |\tFail in English"); 
							} 
						}  
						else  
						{ 
						System.out.println("   |\tPercentage : " + ref[i].getPer()); 
						if (ref[i].getPer() >= 60)  
						{ 
							System.out.println("   |\tStatuse    : Pass"); 
							System.out.println("   |\tPass in first division"); 
						}  
						else if (ref[i].getPer() >= 45)  
						{ 
							System.out.println("   |\tStatuse : Pass"); 
							System.out.println("   |\tPass in Second division"); 
						} 
						else  
						{ 
							System.out.println("   |\tStatuse : Pass"); 
							System.out.println("   |\tPass in Third division"); 
						} 
               } 
        } 
} 
class Mark         //Clinte Class 
{ 
    public int takeRoll(DataClass student[],int i) 
	{ 
		Scanner sc = new Scanner(System.in); 
		boolean flag; 
		int roll; 
		do 
		{ 
			roll= sc.nextInt(); 
			flag = false; 
			for(int j = 0;i>0&&j<i;j++) 
			{ 
				if(student[j].getRollNumber()==roll) 
				{ 
					System.out.println("Duplicate Roll Number Please Enter agen roll number"); 
					flag = true; 
				} 
			}                                 
		}while(flag); 
		return roll; 
	} 
	public int takeMark() 
	{ 
		Scanner sc = new Scanner(System.in); 
		int mark; 
		do 
		{ 
			mark = sc.nextInt(); 
			if(mark<0||mark>100) 
			{ 
				System.out.println("Invalide marks of Please enter Agen mark!"); 
			} 
		}while (mark<0||mark>100); 
                 return mark; 
	} 
	public void run() 
	{ 
		Scanner sc = new Scanner(System.in); 
		Mark ob = new Mark(); 
		Operation ob1 = new Operation();
		int n,roll,year,phycics,chemistry,math,hindi,english;
		String name,fname,mname,corse,branch,sem;		
		DataClass []student = new DataClass[100];
		System.out.print("\nEnter number of student : "); 
		n = sc.nextInt(); 	
		for(int i=0;i<n;i++) 
		{ 
			
			System.out.println("\nEnter Roll number : ");
			roll=sc.nextInt();
			sc.nextLine(); 	
			System.out.println("\nEnter Your name : "); 
			name=sc.nextLine(); 
			System.out.println("\nEnter Your Father name : "); 
			fname=sc.nextLine(); 
			System.out.println("\nEnter Your Mother Name : "); 
			mname=sc.nextLine();
			System.out.println("\nEnter Course name : "); 
			corse=sc.nextLine(); 
			System.out.println("\nEnter Your Branch name : "); 
			branch=sc.nextLine(); 
			System.out.println("\nEnter Your Sem : "); 
			sem=sc.nextLine();   
			System.out.println("\nEnter Your year : "); 
			year=sc.nextInt(); 
			System.out.println("\nEnter marks of phycics : "); 
			phycics=ob.takeMark(); 
			System.out.println("\nEnter marks of chemistry : "); 
			chemistry=ob.takeMark(); 
			System.out.println("\nEnter marks of mathes : "); 
			math=ob.takeMark(); 
			System.out.println("\nEnter marks of Hindi : "); 
			hindi=sc.nextInt();
			System.out.println("\nEnter marks of English : "); 
			english=sc.nextInt(); 
			int total= phycics+chemistry+math+hindi+english;
			student[i] = new DataClass(roll,name,fname,mname,corse,branch,sem,year,phycics,chemistry,math,hindi,english,total);
			System.out.println(" _________________________"); 
  
		} 
                 ob1.choice(student,n,ob1); 
    
	}	
	public static void main(String[]args) 
	{ 
		Mark ob = new Mark(); 
		//ob1.choice();
		ob.run();
	} 
 }