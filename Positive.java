// Problem 4: User Input for Positive Numbers (Using do-while Loop) 
// Problem Statement: 
// Write a Java program that repeatedly asks the user to enter a positive number.  
// 1. Create a method askForPositiveNumber() that uses a do-while loop to ask the user for a number 
// until they enter a positive number. 
// 2. Use the Scanner class to take the user’s input. 
// 3. Once a positive number is entered, the program should display the number. 
// Sample Input: 
// Enter a positive number: -5 
// Enter a positive number: 0 
// Enter a positive number: 8 
// Expected Output: 
// You entered a positive number: 8 
// C-

import java.util.Scanner;
class Positive{
	Scanner sc = new Scanner(System.in);
	public void askForPositiveNumber()
	{
		int num;
		do{
			System.out.println("Enter Positive no:");
			num = sc.nextInt();
			if(num >0)
			{
				System.out.print(" You Enterde a positive number\t"+num);
			}
			
		}while(num <=0);
			
	}
	public static void main(String args[])
	{
		Positive obj = new Positive();
		obj.askForPositiveNumber();
	}
}