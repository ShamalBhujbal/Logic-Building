// Problem Statement: 
 // Write a Java program that prints the multiplication table for a given number (e.g., number 5) using a for 
// loop. The program should: 
// 1. Create a method printMultiplicationTable() that takes a number as a parameter and prints its 
// multiplication table from 1 to 10. 
// 2. Use a for loop to iterate through numbers 1 to 10 and print the multiplication results. 
// Sample Input: 
// Enter a number: 5 
// Expected Output: 
// 5 x 1 = 5 
// 5 x 2 = 10 
// 5 x 3 = 15 
// 5 x 4 = 20 
// 5 x 5 = 25 
// 5 x 6 = 30 
// 5 x 7 = 35 
// 5 x 8 = 40 
// 5 x 9 = 45 
// 5 x 10 = 50 

import java.util.Scanner;
class MultiplicationTable{
	Scanner sc = new Scanner(System.in);
	public void  printMultiplicationTable()
	{
		System.out.println("Enter any Number do u want");
		int num = sc.nextInt();
		for(int i = 1;i<=10;i++)
		{
			System.out.println(num+"\tX\t"+i+"\t=\t"+(num * i));
		}
	}
	public static void main(String args[])
	{
		MultiplicationTable mtbl = new MultiplicationTable();
		mtbl.printMultiplicationTable();
	}
}
