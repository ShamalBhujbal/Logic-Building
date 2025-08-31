// Question 9: Find the Largest Element in an Array 
// Problem Statement: 
// Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds and 
// prints the largest element in the array. (Explore in-built method to solve this) 
// Sample Input: 
// Enter 5 integers: 12 45 67 23 89 
// Expected Output: 
// The largest element is: 89
import java.util.Scanner;
class largestele{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers:");
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i]= sc.nextInt();
		}
		
		int largest=arr[0];
		for(int i=1;i<5;i++){//10 2 30 40 34
			if(arr[i] > largest){
				largest = arr[i];
		}
    }
	System.out.println("Largest element is:"+largest);
}

}
