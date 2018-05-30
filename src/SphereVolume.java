import java.util.Scanner;
import java.lang.Math;

public class SphereVolume {
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		double volume = 0, radius = 0 ;
		System.out.println("Please Enter the Sphere's Radius: ");
		radius = Keyboard.nextDouble();
		
		Math.sqrt(radius);
		volume = (4.0/3.0) * PI * Math.pow(radius, 3);
		System.out.println("The volume of a sphere with a radius of " + radius + " is " + volume);
		System.out.println("The square root of the radius of the sphere is " + Math.sqrt(radius));
		
		
		

	}

}
