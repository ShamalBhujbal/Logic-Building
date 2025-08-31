// Question 26: Check if a String is a Palindrome 
// Problem Statement: 
// Write a Java program that asks the user for a string and checks whether the string is a 
// palindrome. A palindrome is a string that reads the same backward as forward (ignoring 
// spaces and punctuation). 
// Sample Input: 
// Enter a string: madam 
// Expected Output: 
// The string 'madam' is a palindrome.
import java.util.Scanner;
class PallindromString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr = newStr +str.charAt(i);
		}
		if(str.equals(newStr))
		{
			System.out.println("The string "+str+" is a Palindrome");
		}
		else
		{
			System.out.println("The string "+str+" is not a Palindrome");
		}
		
	}
}