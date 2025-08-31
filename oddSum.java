// Question 5: Sum of Odd Numbers between 1 and N 
// Problem Statement: 
// Write a Java program that asks the user for a number N and calculates the sum of all odd numbers 
// between 1 and N using a for loop. 
// Sample Input: 
// Enter a number: 10
//The sum of odd numbers from 1 to 10 is: 25 


import java.util.Scanner;
class oddSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum =0;
		int[] arr = new int[number];
		for(int i =1;i<=number;i++){
			if(i % 2 != 0)
			{
				sum += i;
				
			}
		
		}
			System.out.print("The sum of 1 to:" +number+ "is:"+sum);
	}
}