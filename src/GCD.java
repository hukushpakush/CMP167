import java.util.Scanner;

public class GCD {

	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter two integers");
		int numA = keyboard.nextInt();
		int numB = keyboard.nextInt();

		while(numA != numB) {
			if (numA > numB) 
			{ 
				numA = numA - numB;
			}
			else 
			{ 
				numB = numB - numA;
		    }
							}
		System.out.println("The GCD of the numbers inputed is " + numA );

	}

}