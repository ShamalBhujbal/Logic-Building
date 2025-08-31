// Question 13: Check if an Array Contains a Specific Element 
// Problem Statement: 
// Write a Java program that asks the user to input 5 integers, stores them in an array, and then checks 
// whether a specific number (input by the user) is present in the array using the Arrays.asList() method. If 
// the number is found, print "Found", otherwise print "Not Found". 
// Sample Input: 
// Enter 5 integers: 10 20 30 40 50 
// Enter the number to search: 30 
// Expected Output: 
// Found
import java.util.Scanner;
class SearchEle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many nos. do you want:");
		int n = sc.nextInt();
		System.out.println("Enter"+n+"elements");
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter no to search:");
		int search = sc.nextInt();
		int count=0;
		for(int i =0;i<n;i++)
		{
			if(arr[i] == search)
			{
				count++;
			}
		}
		if(count >0)
		System.out.println("Found");
	    else
		System.out.println("Not Found");
				
			
	}
}