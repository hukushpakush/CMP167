import java.util.Scanner;
public class LegalorNot {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int userAge = 0;
		String firstName = "";
		System.out.println("Please type your First name");
		firstName = Keyboard.next();
		System.out.println("Hello " + firstName + ", Please enter your age : ");
		userAge = Keyboard.nextInt();
		
		if (userAge%2 != 0) {
			System.out.println("You lived an ODD number of years ");
			System.out.println("Triangle has odd number of angles, Illuminati Confirmed");
		}
		
		else {
	
			System.out.println("You lived an EVEN number of years ");
		}
		
		
		/*if (userAge >= 21) {
			System.out.println("Congrats" + firstName + ", You may drink, call a cab");
		}
		else {
			System.out.println("Don't you fucking drink, " + firstName);
		} */

	}
	

}
