import java.util.Scanner;
public class multiply {

	public static void main(String[] args) {
	System.out.println(doublingValue(22));	
	System.out.println(absValue(-11));

	}
	
	public static double absValue(double input)
	{
		double absolute = input;
				if (input < 0)
				{ absolute = -1 * input ; } //else System.out.println(input);
				
				return absolute;
	}
	
	public static double doublingValue(double input) {
		return 2 * input;
		
		
	}

}
//method to find the max of two input methods
//ask user to to input four values of double type