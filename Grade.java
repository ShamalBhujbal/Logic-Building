// Problem Statement: 
// Write a Java program that calculates the average marks of a student and determines the grade based on the 
// following criteria: 
// Grade A: Average marks ≥ 90 
// Grade B: Average marks between 70 and 89 
// Grade C: Average marks between 50 and 69 
// Grade D: Average marks between 30 and 49 
// Fail: Average marks < 30 
// Predefined Values (Try with different values as well): 
//  Marks in Maths = 80 
//  Marks in Science = 85 
//  Marks in History = 90 
// Expected Output: 
// Average Marks: 85 
// Grade: B
class Grade{
      public static void main(String args[])
	  {
		  int Maths = 80;
		  int Science = 85;
		  int History = 90;
		  int avg = (Maths+Science+History) / 3;

		  System.out.println("Average Marks:"+avg);
		  if(avg >= 90)
			  System.out.println("Grade A");
		  else if(avg >=70 || avg <=89)
			  System.out.println("Grade B");
		  else if( avg >=50 || avg <=69)
			  System.out.println("Grade C");
		  else if(avg < 30)
		     System.out.println("Fail");
	  }
}