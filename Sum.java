// Problem 1: Sum of Two Numbers (Using a Method) 
// Problem Statement: 
// Write a Java program that includes a method to calculate the sum of two numbers. 
// 1. Create a method sumOfTwoNumbers() that takes two integers as parameters, calculates their sum, 
// and returns the result. 
// 2. In the main method, use the Scanner class to prompt the user to enter two integers. 
// 3. Pass the user inputs to the sumOfTwoNumbers() method and print the sum. 
// Sample Input: 
// Enter first number: 15 
// Enter second number: 25 
// Expected Output: 
// The sum of 15 and 25 is 40.
import java.util.Scanner;
class Sum{
	
	    public int sumOfTwoNumbers(int num1,int num2)
		 {
			 int sum = num1 + num2;
			 return sum;
		 }
}	 
class twoSum{
     public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first number:");
		 int num1 = sc.nextInt();
		 System.out.println("Enter Second number:");
		 int num2 = sc.nextInt();
		 
		 Sum sumobj = new Sum();
		 int result = sumobj.sumOfTwoNumbers(num1,num2);
		 
		 System.out.println("Sum of number 1 :\t"+num1+"\tand number 2:\t"+num2+"\tis\t"+result);
		 
		 
	 }
}
