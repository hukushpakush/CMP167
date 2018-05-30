package chapter5;
import java.util.Scanner;
public class perimeter {

	public static double perimeter(double length, double width) {
		double perimeter = 2 * (length+width);
		return perimeter;
	}
	public static double area(double length, double width) {
		double area = length * width;
		return area;
	}
	
	
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter the length and width of a rectangle to get the perimeter");
		double length = Keyboard.nextDouble();
		double width = Keyboard.nextDouble();
		System.out.print("The perimeter of the rectangle is : ");
		System.out.println(perimeter(length,width));
		System.out.println("and the area of the rectangle is : " + area(length,width));

	}

}
