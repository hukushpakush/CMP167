import java.util.Scanner;
public class janina {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int input = 0;
		
		while(input >= 0)
		{
			System.out.println(" \n Please enter number of stars ( to quit enter negative integer )");
			input = Keyboard.nextInt();
			
			for (int n= 1; n <= input; ++n) 
			{
				System.out.print("*");
			}
		}
		System.out.println("Good Bye!");
			

	}

}
