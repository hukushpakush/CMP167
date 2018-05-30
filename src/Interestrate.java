import java.util.Scanner;
public class Interestrate {

	public static void main(String[] args) {
	
	System.out.println("Please input the initial inputment : ");
	
	double invest, rate, principal, profit; // declaring the variables
	Scanner Keyboard = new Scanner(System.in);
	
	invest = Keyboard.nextDouble();
	System.out.println("Please input the interest rate in decimal : ");
	rate = Keyboard.nextDouble();
	
	profit = invest * rate; // profit after first year
	principal = profit + invest; // principal after first year
	profit = principal * rate; // profit after second year
	principal = profit + principal; // principal after second year
	profit = principal * rate; // profit after third year
	principal = profit + principal; // principal after third year
	profit = principal * rate; // profit after fourth year
	principal = profit + principal; // principal after forth year
	profit = principal * rate; // profit after fifth year
	principal = profit + principal; // principal after fifth year
	
	System.out.println("The principal amount after five years is " + principal);
	
	}

}
