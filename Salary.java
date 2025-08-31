import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your salary");
		int sal = sc.nextInt();
		
		for(int i =1;i<=12;i++)
		{
		    
			System.out.println("you are saving -\t\t"+(sal * i)+"\tafter\t\t"+i+"\tMonth");
		}
	}
}
// int sumSalary = 0;
        // for(int i = 1;i <= 12; i++){
            // sumSalary += 20000;
            // System.out.println("Salary After Moth "+ i+ "is " + sumSalary);
        // }