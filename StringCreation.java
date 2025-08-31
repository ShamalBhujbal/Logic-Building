// Question 27: String Literal and Object Creation 
// Problem Statement: 
// Write a Java program that creates two string variables using string literals with the same 
// content. Then, print whether both variables point to the same object. 
// Code Example: 
// String str1 = "hello"; 
// String str2 = "hello"; 
// Expected Output: 
// Both variables point to the same object: true 
class StringCreation {
    public static void main(String args[]) {
        String str1 = "shamal";
        String str2 = "shamal";
        
           // System.out.println("str1 and str2 point to the SAME object (string pool).");
		     System.out.println("Both variables point to the same object using ==:"+(str1 == str2));

         
            System.out.println("str1 and str2 have the SAME value using equals."+(str1.equals(str2)));

    }
}
