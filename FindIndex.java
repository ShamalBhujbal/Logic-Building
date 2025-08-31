// Question 14: Find the Index of an Element in an Array 
// Problem Statement: 
// Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds the 
// index of a specific number (input by the user) using the Arrays.binarySearch() method. If the number is 
// found, print the index, otherwise print "Not Found". 
// Sample Input: 
// Enter 5 integers: 5 10 15 20 25 
// Enter the number to search: 15 
// Expected Output: 
// The number 15 is found at index 2
import java.util.Scanner;
class FindIndex{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements do u want in array");
		int n =sc.nextInt();
		System.out.println("Enter "+n+ " array elements");
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter ele to find index:");
		int ele = sc.nextInt();
		int index = -1;
		int i=0;
		for(i =0;i<n;i++)
		{
			if(arr[i] == ele)
			{
				index = i;
				break;
			}
			
		}
		if(index != 0)
		{
			System.out.println("the no. "+ele+" found at index "+i);
		}
		else
		{
			System.out.println(" Not found ");
		}
		
	}
}