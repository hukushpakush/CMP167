import java.util.Scanner;
public class ConeVolume {
	public static final double PI = 3.14159; 
	public static double Volume(double r, double h) {
			r = Math.pow(r,2); 
			double v = PI * r * (h/3);
			return v;
		}
		public static void main(String[] args) {
			Scanner Keyboard = new Scanner(System.in);
			System.out.println("This Program Computes The Volume of a Cone");
			System.out.print("Please Enter the Radius");
			double r = Keyboard.nextDouble();
			System.out.print("And the Height");
			double h = Keyboard.nextDouble();
		
			System.out.println("The volume of the cone is : " + Volume(r,h));
		}
	}

