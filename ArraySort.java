// Question 12: Sort an Array in Ascending Order 
// Problem Statement: 
// Write a Java program that asks the user to input 5 integers, stores them in an array, and then sorts the 
// array in ascending order using the Arrays.sort() method. After sorting, print the sorted array. 
// Sample Input: 
// Enter 5 integers: 12 45 23 8 90 
// Expected Output: 
// Sorted array: 8 12 23 45 90 
import java.util.Scanner;
class ArraySort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i]= sc.nextInt();
		}
		
	for(int i =0;i<5;i++)
	{//6 5 7 2 1
		for (int j = 0; j < 5- 1 - i; j++)
		{
			if(arr[j] > arr[j+1])//
			{
			int temp = arr[j];//
			arr[j] = arr[j+1];
			arr[j+1]=temp;
			}
		  }	
		}
		System.out.println("Sorted array");
		for(int num : arr)
		{
			System.out.println(num+" ");
		}
		
	}
}
