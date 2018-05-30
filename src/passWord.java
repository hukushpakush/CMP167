import java.util.Scanner;
public class passWord {
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	String phrase = Keyboard.nextLine();
	int p = 0;
	p = phrase.indexOf("hell");

	if (p < 0)
		{System.out.println("Your phrase is good");}
	else 
	{System.out.println(phrase.replace("hell", "love"));}
	
	
	}

}
