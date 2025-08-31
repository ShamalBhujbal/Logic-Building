// Problem 2: Leap Year  
// Problem Statement: 
// Write a Java program that checks whether the year is a leap year or not. A year is a leap year if: 
// It is divisible by 4, but not divisible by 100, or 
// It is divisible by 400. 
// Predefined Value (Try with different values as well): 
// Year = 2024 
//  Year = 1900 
// Expected Output: 
// 2024 is a leap year. 
//  1900 is not a leap year. 

class Leap{
	public static void main(String args[])
	{
		int year = 3000;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap year");
		else
            System.out.println("Not leap year");			
	}
}