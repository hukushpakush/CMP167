import java.util.Scanner;

public class numberOne {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a float number");
		float x, y, xy;
		Scanner Keyboard = new Scanner(System.in);
		x = Keyboard.nextFloat();
		y = (float) (1.0/x);
		xy = x * y;
		System.out.println("x = " + x + " and y = " + y);
		System.out.println("xy = " + xy);
		System.out.println("The final result is " + (xy-1) );
		
		
		
		
		
		
	}

}
