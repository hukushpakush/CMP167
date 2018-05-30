package midterm2;
import java.util.Scanner;
public class number4 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		double userNum = Keyboard.nextDouble();
		double absVal = userNum;
		if (userNum < 0)
		{ absVal = userNum * (-1);}
		System.out.println(absVal);

	}

}
