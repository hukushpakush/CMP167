import java.util.Scanner;
 
public class numberTwo {

	public static void main(String[] args) {
	
		float x;
		int y;
		byte z;
		Scanner keyboard = new Scanner(System.in);
		x = keyboard.nextFloat();
		y = (int) x;
		System.out.println("The float number entered is " + x );
		System.out.println("The integer value is " + y);
		z = (byte) (x);
		System.out.println("The byte value is " + z);
		
		
		
		
		
		

	}

}
