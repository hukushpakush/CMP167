import java.util.Scanner;
public class assignment {

	public static double maxValue1(double num1, double num2)  {
		if (num1 > num2) {
		return num1;}
		
		else { 
		return num2; } 
	}
	
		
	public static void main(String[] args) {
		System.out.println("Please enter two pairs of numbers to find out the sum of the maximum numbers from each pair");
		Scanner Keyboard = new Scanner(System.in);
		double num1 = Keyboard.nextDouble();
		double num2 = Keyboard.nextDouble();
		double num3 = Keyboard.nextDouble();
		double num4 = Keyboard.nextDouble();

		System.out.println((maxValue1(num1,num2)) + (maxValue1(num3,num4)));
	
		
	}

}
