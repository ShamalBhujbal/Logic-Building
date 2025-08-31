import java.util.Scanner;
class Positive_No{
	public static void main(String args[])
	{
		System.out.println("Enter any no. do you want");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if(no > 0)
		{
			System.out.println("No. is Positive");
		}
		else
		   System.out.println("No. is Negative");
	}
}