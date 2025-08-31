import java.util.Scanner;
class OddNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no do you want");
		Scanner sc1 = new Scanner(System.in);
		int no = sc1.nextInt();
		if(no % 2 == 0)
			System.out.println("No. is even");
		else
			System.out.println("No. is Odd");
		
	}
      
}