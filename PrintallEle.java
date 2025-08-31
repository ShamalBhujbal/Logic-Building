// Question 6: Print All Elements of an Array 
// Problem Statement: 
// Write a Java program that uses a for-each loop to print all elements of an integer array. The program 
// should ask the user to input 5 integers, store them in an array, and then print all the elements using a 
// for-each loop. 
// Sample Input: 
// Enter 5 integers: 3 7 12 5 8 
// Expected Output: 
// 3 7 12 5 8
import java.util.Scanner;
class PrintallEle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		int[] arr = new int[5];
		System.out.println("Enter 5 array elements:");
		for(int i =0;i<5;i++)
		//for(int ele1 : arr)
		{
			 arr[i]=sc.nextInt();
			
		}
		for(int ele1 : arr)
		
			 System.out.print(ele1+" ");
		}
        
		
		
	}
