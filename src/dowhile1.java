import java.util.Scanner;
public class dowhile1 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter a Positive Integer : ");
		int input = Keyboard.nextInt();
		int sumOdd = 0;
		while (input >= 0) {
		for(int i = 1; i <= input  ;    i += 2) { //i+=2 means i = i+2
			sumOdd = sumOdd + i;
			
		}
	System.out.println("The sum of the odd integers from 1 to " + input + " is " + sumOdd  );
	input = Keyboard.nextInt(); 
		}
	
		}
		
}
