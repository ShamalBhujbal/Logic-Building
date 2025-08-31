// Question 30: String Pool with intern() Method 
// Problem Statement: 
// Write a Java program that creates a string using the new keyword and then calls the 
// intern() method. Print whether the interned string is pointing to the same object as the 
// original string literal. 
// Code Example: 
// String str1 = new String("hello"); 
// String str2 = str1.intern(); 
// String str3 = "hello"; 
// Expected Output: 
// Is str2 and str3 pointing to the same object? true 

class StringIntern{
	public static void main(String args[]){
		String s1 = new String("hello");
		String s2 = s1.intern();
		String s3 = "hello";
		
		System.out.println("Is str2 and str3 pointing to the same object?"+(s2 == s3));
		System.out.println("Is str2 and str3 pointing to the same value?"+(s2.equals(s3)));
		System.out.println("Is str1 and str3 pointing to the same object?"+(s1 == s3));
		System.out.println("Is str1 and str3 pointing to the same value?"+(s2.equals(s3)));


		
	}
}