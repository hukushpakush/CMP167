package midterm2;
import java.util.Scanner;
public class midterm2 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter the letter grade to know the number grade :");
		String input = Keyboard.next();
	
		double gradeValue = 0.0 ; char grade = input.charAt(0);
		switch (grade) {
		case 'A' :
			gradeValue = 4.0;
			System.out.println(gradeValue);
			break;
		case 'B' :
			gradeValue = 3.0;
			System.out.println(gradeValue);
			break;
		case 'C' :
			gradeValue = 2.0;
			System.out.println(gradeValue);
			break;
		case 'D' :
			gradeValue = 1.0;
			System.out.println(gradeValue);
			break;
		default :
			gradeValue = 0.0;
			System.out.println(gradeValue + " Please enter a valid input");
			
			
		
		
		}
	}

}
