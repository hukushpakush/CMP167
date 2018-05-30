package chapter5;
import java.util.Scanner;
public class name {

	public static void name(String n) {
		System.out.println("Hello, " + n + " , Welcome to Lehman College");
	}
	public static void main(String[] args) {
		System.out.println("Please enter your name: ");
		Scanner Keyboard = new Scanner(System.in);
		String n = Keyboard.next();
		name(n);
	}

}