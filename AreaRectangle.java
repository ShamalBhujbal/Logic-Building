import java.util.Scanner;
class AreaRectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
		int le = sc.nextInt();
		System.out.println("Enter width of rectangle");
		int wi = sc.nextInt();
		int area = le * wi;
		System.out.println("Area of Rectangle is:"+area);
	}
}