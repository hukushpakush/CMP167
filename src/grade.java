import java.util.Scanner;
public class grade {
	public static void main(String[] args) {
		System.out.println("Please enter your number grade: ");
		Scanner Keyboard = new Scanner(System.in);
	double grade = 0;
	String space= " ";
	grade = Keyboard.nextDouble();
	System.out.print("Your grade" + space + "is: ");
	if (grade >= 90)
		{System.out.println('A');}
		else if ((80 <= grade) && (grade > 90))
	{ System.out.println('B');}
	else if ((70 <= grade) && (grade > 80))
	{ System.out.println('C');}
	else if ((60 <= grade) && (grade > 70))
	{ System.out.println('D');}
	else 
	{System.out.println('F');}
Keyboard.close();
	}
}
