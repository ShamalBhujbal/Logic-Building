// Problem 6: Calculate the Sum of Numbers from 1 to N (Using for Loop) 
// Problem Statement: 
 // Write a Java program that calculates the sum of all integers from 1 to N (where N is a positive integer) 
// using a for loop. The program should: 
// 1. Create a method calculateSum() that takes a number N and calculates the sum of all integers from 
// 1 to N. 
// 2. Use a for loop to iterate through all integers from 1 to N and add them up. 
 
// Sample Input: 
// Enter a number: 5 
// Expected Output: 
// The sum of numbers from 1 to 5 is: 15 

import java.util.Scanner;
class SumUsingLoop{
	
	int sum =0;
	public void calculateSum(int n)
	{
		for(int i =1;i<=n;i++)
		{
			sum += i;
		}
		System.out.println("The sum of Numbers from: 1 to\t"+n+"is\t:"+sum);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any No. do u want");
		int n = sc.nextInt();
		SumUsingLoop obj = new SumUsingLoop();
		obj.calculateSum(n);
		
	}
}