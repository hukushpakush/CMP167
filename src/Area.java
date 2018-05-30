import java.util.Scanner;
public class Area {
	// user inputs radius of a circle in inches. This program is going to compute area of a circle.
	public static void main(String[] args) {
		
		
		
		System.out.println("Please enter the radius of a circle in inches followed by the ENTER key");
		
		Scanner Keyboard = new Scanner(System.in);
		double radius, area, circumference, PI ;
		public static final double PI = 3.14159 ;
		radius = Keyboard.nextDouble();
		
		area = radius * radius * 3.14159 ;
		circumference = 2 * 3.14159 * radius ;
		
		
		System.out.println("If the radius of the circle is " + radius + " then the area of the circle is " + area);
		System.out.println("And the circumference of the circle is " + circumference);
		
		
	}
}
