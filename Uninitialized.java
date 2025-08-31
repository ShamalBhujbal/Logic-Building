// Problem 4: Identify the Values of Uninitialized Variables 
// Scenario: 
// You are working on a program that handles different data types. Your manager has asked you to quickly 
// check the values of various variables, but you’re in a rush and forget to initialize them. As you go through 
// the code, you expect some values to show up, but Java has something else in mind. Your task is to fix the 
// issue and ensure the variables hold proper values. 
// Instructions: 
// 1. Declare the following variables: 
// byte a; 
// short b; 
// int c; 
// long d; 
// float e; 
// double f; 
// char g; 
// boolean h; 
// 2. Print out their values.
class Uninitialized{
	static byte a =120;
	static short b =125;
	static int c=100;
	static  long d = 100000;
	static float e = 23.3f;
	static double f = 98.0d;
	static char g = 'c';
	static boolean h = true;
      public static void main(String args[])
	  {
		 
		  System.out.println("Byte\t\t"+a);
		  
		  System.out.println("Short\t\t"+b);
		  
		  System.out.println("integer\t\t"+c);
		  
		  System.out.println("long\t\t"+d);
		  
		  System.out.println("float\t\t"+e);
		  
		 System.out.println("double\t\t"+f);
		 
		 System.out.println("character\t\t"+g);
		 
		 System.out.println("boolean\t\t"+h);
	  }
}