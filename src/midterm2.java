import java.util.Scanner;
public class midterm2 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
	for (int i = 1; i <= 7; i++) {
		for (int j = 2; j < i; j= j+2) {
			System.out.print(j);
		}
		System.out.println(i);
	}
		
	}

}
