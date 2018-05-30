package chapter5;
import java.util.Scanner;
public class coneVolume {
	public static final double PI = 3.14159; //declaring PI as a final variable 
	public static double volume(double r, double h) {
		r = Math.pow(r,2); //using the math.pow method to find the square of r
		double v = PI * r * (h/3);
		return v;
	}
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("This program is going to compute the volume of a cone using the given radius and height.");
		System.out.print("Please enter the radius : ");
		double r = Keyboard.nextDouble();
		System.out.print("And the height : ");
		double h = Keyboard.nextDouble();
	
		System.out.println("The volume of the cone is : " + volume(r,h));
	}
}
