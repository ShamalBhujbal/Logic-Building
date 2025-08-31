// Question 28: String Creation with new Keyword 
// Problem Statement: 
// Write a Java program that creates two string objects using the new keyword with the 
// same content. Then, print whether both objects are the same using the == operator and 
// the .equals() method. 
// Code Example: 
// String str1 = new String("hello"); 
// String str2 = new String("hello"); 
// Expected Output: 
// Using == : false 
// Using .equals(): true 

class StringNew {
    public static void main(String args[]) {
		String str3 = new String("shamal");
        String str4 = new String("shamal");
		
            System.out.println("str3 and str4 point to the SAME object. using =="+(str3 == str4));
        
           // System.out.println("str3 and str4 point to DIFFERENT objects."+(str3 == str4));
 
            System.out.println("str3 and str4 have the SAME value. using equals"+(str3.equals(str4)));
	}
}