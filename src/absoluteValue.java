import java.util.Scanner;
public class absoluteValue {
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	System.out.println("Please enter a real number to find out its absolute value");
		double x;
		x = Keyboard.nextDouble();
	if (x < 0)
		{
		  x = x * -1;
		}
	System.out.println("The absolute value of the number is " + x);
		
	}
}