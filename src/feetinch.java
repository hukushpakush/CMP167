import java.util.Scanner;
public class feetinch 
{
	public static void printFtInShort(int feet, int inch) 
	{
		System.out.println(feet + "' " + inch + "\" ");
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter your height in feet and followed by inches : ");
		Scanner Keyboard = new Scanner(System.in);
		int feet = Keyboard.nextInt();
		int inch = Keyboard.nextInt();
		
		printFtInShort(feet, inch);
	}
}