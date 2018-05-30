import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
	System.out.println("Please enter a positive integer");
	Scanner Keyboard = new Scanner(System.in);
	int input = Keyboard.nextInt();

	while (input > 0)
	{ System.out.println(input%10);
	input = input/10;}
	System.out.println();
	
	/*n1 = input%10;
	System.out.println(n1);
	input = input/10;
	System.out.println(input);
	n1 = input%10;
	System.out.println(n1);
	input = input/10;
	System.out.println(input);
	n1 = input%10;
	System.out.println(n1);
	input = input/10;
	System.out.println(input);*/



}
}