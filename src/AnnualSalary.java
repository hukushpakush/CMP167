import java.util.Scanner;

public class AnnualSalary {
public static void main(String[] args) {
	System.out.println("This program is going to calculte your annnual wage. To find out your annual salary please enter your hourly wage followed by the ENTER key");
	
	int hw = 0; // hw = hourlyWage
	Scanner Keyboard = new Scanner(System.in);
	
	hw = Keyboard.nextInt();
	
	System.out.print("Your annual salary is : ");
	System.out.println(hw * 50 * 40);
	
}
}
