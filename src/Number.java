import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		int number1, number2;
		Scanner Keyboard = new Scanner(System.in);
		
		number1 = Keyboard.nextInt();
		number2 = Keyboard.nextInt();
		
		for(int i = number1; i<=number2; i ++) // for is a loop syntax 
			// i ++ means i+1 (operator)
		System.out.println(i + " ");
		Keyboard.close();
		
		
	}

}
