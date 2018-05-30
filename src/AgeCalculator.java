import java.util.Scanner;

public class AgeCalculator {
	private static Scanner keyboard;

	public static void main(String[] args) {
	System.out.println("To find your age please intput your birth year followed by the ENTER key");
	
	int birthYear, age;
	
	keyboard = new Scanner(System.in);
    birthYear = keyboard.nextInt();
    
    System.out.println("To know the year please enter the desired age");
    age = keyboard.nextInt();
    
   
    System.out.println("You are going to be " + age + " in the year : ");
    System.out.println(birthYear+age);
    
	
}
}
