// Question 8: Print All Names in a String Array 
// Problem Statement: 
// Write a Java program that uses a for-each loop to print all the names stored in a String array. The program 
// should ask the user to input 4 names, store them in an array, and then print each name using the for-each 
// loop. 
// Sample Input: 
// Enter 4 names: Manoj Aditya Shilbhushan Shweta 
// Expected Output: 
// Manoj  
// Aditya  
// Shilbhushan  
// Shweta

import java.util.Scanner;
class StringArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] str = new String[4];
		System.out.println("Enter 4 names");
		for(int i=0;i<4;i++){
			str[i]=sc.nextLine();
		}
		System.out.println("Your names are:");
		for(String str1 :str )
		{
			System.out.println(str1);
		}
	}
}