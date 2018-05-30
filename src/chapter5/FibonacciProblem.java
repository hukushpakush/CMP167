package chapter5;
import java.util.Scanner;
public class FibonacciProblem {
	public static double fibonacci(double count) { 
		double fir = 1, sum = 0, number = 0;
		
		sum = number + fir;
		for(int x = 2; x <= count; ++x) {
			sum = number + fir; ;
			number = fir; fir = sum;}
		return sum;
}

public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	double userNum;
	userNum = Keyboard.nextDouble();
	System.out.println (" The number is = " + fibonacci(userNum));
	}
}
