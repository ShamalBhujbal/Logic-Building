// Problem 2: Simple Age Checker (Using a Method) 
// Problem Statement: 
// Write a Java program that includes a method to check the age category.  
// 1. Create a method checkAgeCategory() that takes an integer (age) as a parameter and prints 
// whether the user is a minor, adult, or senior citizen. 
// 2. In the main method, use the Scanner class to prompt the user to enter their age. 
// 3. Pass the user's age to the checkAgeCategory() method. 
// Sample Input: 
// Enter your age: 30 
// Expected Output: 
// You are an adult. 
import java.util.Scanner;
class agech{
	public void checkAgeCategory(int age)
	{
		if(age>1 && age <=17)
		{
			System.out.println("Minor");
		}
		else if(age >=18 && age <=55)
		{
		  System.out.println("Adult");	
		}
		else{
			System.out.println("Senior citizen");
		}
		
	}
}
class AgeCheck{
	public static void main(String args[])
	{
		agech obj = new agech();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age = sc.nextInt();
		obj.checkAgeCategory(age);
		//System.out
		
		
	}
}