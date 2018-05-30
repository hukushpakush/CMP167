package midterm2;
import java.util.Scanner;
public class number3 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter two positive integer");
		double num1= Keyboard.nextDouble();
		double num2 = Keyboard.nextDouble(); double min, max;
		
		if (num1 > num2) {
			min = num2;
			max = num1;
		}
		else {
			min = num1;
			max = num2;
			
		}
		System.out.println("The difference of the entered two numbers is: " + (max-min));

	}
 
}
