import java.util.Scanner;
public class letterGrade {

	public static void main(String[] args) {
		System.out.println("Please enter your letter grade: ");
		Scanner Keyboard = new Scanner(System.in);
		String grade;
		grade = Keyboard.next();
		switch (grade)
		{
		case "A":
		System.out.println("4.0");
			break;
		case "B" :
			System.out.println("3.0");
			break;
		case "C" :
			System.out.println("2.0");
			break;
		case "D" :
			System.out.println("1.0");
			break;
		case "F" :
			System.out.println("0.0");
		default :
			System.out.println("Please enter a valid input");
		
		}
	
		switch(result){
		case "A+" : 
		System.out.println("4.25");
		break;
		
		case "A-": 
		System.out.println("3.75");
		break;
		}



	}

}
