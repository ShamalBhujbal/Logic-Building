// Question 7: Find the Sum of All Elements in an Array 
// Problem Statement: 
// Write a Java program that uses a for-each loop to calculate the sum of all elements in a given integer 
// array. The program should ask the user to input 5 integers, store them in an array, and then compute the 
// sum of these numbers using the for-each loop. 
// Sample Input: 
// Enter 5 integers: 4 6 8 2 10 
// Expected Output: 
// The sum of all numbers is: 30 
import java.util.Scanner;
class ArraySum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		int[] arr = new int[5];
		System.out.println("enter 5 element");
		for(int i =0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		int total=0;
		for(int num : arr)
		{
			total += num;
			
		}
		System.out.println(total+" ");
	}
}
		