// Question 11: Count Positive and Negative Numbers in an Array 
// Problem Statement: 
// Write a Java program that asks the user to input 6 integers, stores them in an array, and then counts how 
// many positive and negative numbers are present in the array. 
// Sample Input: 
// Enter 6 integers: -5 3 7 -2 0 8 
// Expected Output: 
// Positive numbers: 3 
//  Negative numbers: 2
import java.util.Scanner;
class CountPoNeg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 integers:");
		int[] arr = new int[6];
		
		for(int i=0;i<6;i++){
			arr[i]= sc.nextInt();
		}
		int posCount = 0;
		int negCount = 0;
		for(int i =0;i<6;i++){
			if(arr[i] > 0)
			{
				posCount++;
			}
			else
				negCount++;
		}
		System.out.println("Positive numbers:"+posCount);
		System.out.println("Negative numbers:"+negCount);
		
	}
}