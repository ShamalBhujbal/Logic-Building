// Question 10: Find the Average of Elements in an Array 
// Problem Statement: 
// Write a Java program that asks the user to input 5 integers, stores them in an array, and then calculates and 
// prints the average of the elements in the array. 
// Sample Input: 
// Enter 5 integers: 10 20 30 40 50 
// Expected Output: 
// The average of the numbers is: 30.0 
import java.util.Scanner;
class Avg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i]= sc.nextInt();
		}
		
		int sum=0;
		for(int i =0;i<5;i++)
		{
			sum+= arr[i];
		}
		int avg=sum/5;
		System.out.println("The average of the numbers is:"+avg);
	}
}