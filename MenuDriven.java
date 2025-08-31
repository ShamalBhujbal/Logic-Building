// Bonus Problem: Menu-Driven Java Program 
// (Switch-Case) 
// Problem Statement: 
// You are required to write a menu-driven Java program that implements four separate 
// problems. The program should allow the user to select which problem to run, execute the 
// corresponding logic, and then return to the menu until the user chooses to exit. 
// The four problems are as follows (Already done in assignment 2, just put it in switch 
// case): 
// Problem 1: Grade Evaluation System 
// Problem 2: Leap Year Check 
// Problem 3: Day of the week 
// Problem 4: Identify Default Values of Variables 
// Case 5: Exit 
// C-DAC
import java.util.Scanner;
class MenuDriven
{   static byte a;
	static short b;
	static int c;
	static  long d;
	static float e;
	static double f;
	static char g ;
	static boolean h;
    public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int ch;
	int choice;
	do
	{
	System.out.println("1) Grade evaluation System \n2)Leap Year check \n3)Day of the week \n4)Default values Identidy \n5)Exit");
	System.out.println("Enter Your choice that you want");
	ch = sc.nextInt();
	switch(ch)
	{
		case 1:
		      System.out.println("Welcome to grade Evaluation System");
			  System.out.println("Enter marks for three subjects Maths English Java");
			  int math = sc.nextInt();
			  int english = sc.nextInt();
			  int java = sc.nextInt();
			  int avg = (math + english + java)/3;
			  if(avg >= 90)
			  {
				  System.out.println("Grade A");
			  }
			  else if(avg >=89 || avg <=70)
			  {
			       System.out.println("Grade B");
			  }
			  else if(avg >=69 || avg <=50)
			  {
				  System.out.println("Grade C");
			  }
			  else if(avg < 30)
			  {
				  System.out.println("Fail");
			  }
			  
		break;
		
		case 2:
		     System.out.println("Welcome to Leap Year Check");
			 System.out.println("Enter year that you want:");
			 int year = sc.nextInt();
			 if((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0))
			 {
				 System.out.println(year+"\t is a Leap Year");
			 }
			 else
				 System.out.println(year+"\tis not leap year");
			 
		break;
		
		case 3:
		         System.out.println("Welcome to day of the week");
				 System.out.println("Enter no.");
				 int day = sc.nextInt();
				 switch(day)
				 {
					 case 1:
					      System.out.println("Monday");
					 break;
					     
			   
				   case 2:
						 System.out.println("Tuesday");
				   break;
				   
				   case 3:
						 System.out.println("Wednesday");
				   break;
				   
				   case 4:
						 System.out.println("Thrusday");
				   break;
				   
				   case 5:
						 System.out.println("Friday");
				   break;
				   
				   case 6:
						 System.out.println("Saturday");
				   break;
				   
				   case 7:
						  System.out.println("Sunday");
				   break;
				   
				   default:
					  System.out.println("Invalid day Number");
					 }
		break;
		
		case 4:
		  System.out.println("Welcome to Default values identify");
		  
		  System.out.println("Byte\t\t"+a);
		  
		  System.out.println("Short\t\t"+b);
		  
		  System.out.println("integer\t\t"+c);
		  
		  System.out.println("long\t\t"+d);
		  
		  System.out.println("float\t\t"+e);
		  
		 System.out.println("double\t\t"+f);
		 
		 System.out.println("character\t\t"+g);
		 
		 System.out.println("boolean\t\t"+h);
			             
		break;
	  
	  case 5:
	         System.out.println("Exit");
	  break;
		
	
		
    default:
	         System.out.println("Enter valid choice");
	}
    System.out.println("Do you want to continue press 6:");	
	choice = sc.nextInt();
	}while(choice == 6);
	
}
	
}
