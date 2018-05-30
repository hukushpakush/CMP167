import java.util.Scanner;
import java.lang.Math;

public class Assignment2 {
	public static final double PI = 3.14159; //global variables can be declared before the body
	public static void main(String[] args) {
		System.out.println("Please input the circumference of the circle : ");
		
		double r, c, a,l ;
		Scanner Keyboard = new Scanner(System.in);
		c = Keyboard.nextDouble();
		r = c / (2 * PI);
		a = PI * Math.pow(r, 2);
		System.out.println(Math.sqrt(2));
		
		System.out.println("The area corresponding to circumference " + c + " of the circle is : " + a);

	}

}
