// Question 24: Reverse a String 
// Problem Statement: 
// Write a Java program that asks the user for a string and then prints the reverse of that 
// string. 
// Sample Input: 
// Enter a string: hello 
// Expected Output: 
// Reversed string: olleh
import java.util.Scanner;
class ReverseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Reverse String:");
		for(int i=str.length() -1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}