package chapter5;
import java.util.Scanner;
public class fibonacci {
	public static int fibonacci(int count) {	
	int f = 1, s = 0, n=0;
		s=n+f;
		for(int i=2;i<count;++i) {
		s= n+f; System.out.println(s);
		
		n=f;
		f=s;
		}
		return s;
		}
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int count= Keyboard.nextInt();
		System.out.println("number = "+ fibonacci(count));
	}
}
