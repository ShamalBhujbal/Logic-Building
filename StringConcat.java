// Question 29: String Concatenation and Object Creation 
// Problem Statement: 
// Write a Java program that concatenates two strings using the + operator. Print whether the 
// concatenated string is a new object or a reference to an existing string object using the == 
// operator. 
// Code Example: 
// String str1 = "hello"; 
// String str2 = "world"; 
// String str3 = str1 + str2; 
// Expected Output: 
// Is str3 pointing to the same object as str1? false 
class StringConcat{
	public static void main(String args[]){
		String str1 = "Hello";
		String str2 = "world";
		String str3 = str1 + str2;
		System.out.println("Is str3 pointing to the same object as str1?"+(str3 == str1));
		
		System.out.println("Do str3 and str1 have the same content? " +str3.equals(str1));
	}
}