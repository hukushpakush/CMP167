import java.util.Scanner;
public class numberThree {

	public static void main(String[] args) {
	
		System.out.println("Please enter a floating point value ");
		float x;
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.nextFloat();
		double y = x % 2.0;
		int z = (int) x;
		System.out.println("The entered value x = " + x + " the z value is " + z);
		System.out.println("z % 2 is " + z % 2);
		
		

	}

}
