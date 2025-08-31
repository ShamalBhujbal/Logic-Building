// Question 3: Calculate the Factorial of a Number 
// Problem Statement: 
// Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop. 
// Sample Input: 
// Enter a number: 5 
// Expected Output: 
// Factorial of 5 is 120 
// 1*5 =5
//5 *2 10 *3 30 *4 =120
import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number do u want:");
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++)
		{
			 fact *= i;//5 
			
		}
		System.out.println(fact);
	}
}