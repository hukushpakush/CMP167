package midterm2;
import java.util.Scanner;
public class number5 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter the number of cars you have sold: ");
		int carSold = Keyboard.nextInt(); int bonus = 0;
		
		if ((carSold >= 5) && (carSold <= 8)){
			bonus = 5;}
			else if ((carSold > 8) && (carSold < 15)){
				bonus = 10;}
				else if (carSold >= 15) {
					bonus = 20;}
				else { bonus = 0;}
		System.out.print("Congrats! You sold " + carSold + " cars. ");
		System.out.println("You have " + bonus + " bonus points!");
				
			
		

	}

}
