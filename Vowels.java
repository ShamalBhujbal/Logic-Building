// Question 25: Count Vowels in a String 
// Problem Statement: 
// Write a Java program that asks the user for a string and counts the number of vowels (a, 
// e, i, o, u) in the string. The program should then print the total number of vowels. 
// Sample Input: 
// Enter a string: programming 
// Expected Output: 
// The number of vowels in 'programming' is: 3
import java.util.Scanner;
class Vowels{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int count=0;
		for(int i =0;i<=str.length()-1;i++)
		{
			if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
			{
				count++;
			}
		}
		System.out.println("Vowels in "+str+"is: "+count);
	}
}