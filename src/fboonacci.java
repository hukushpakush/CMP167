import java.util.Scanner;
public class fboonacci {

		public static double fibonacci(double count) {	
		double first = 1, sum = 0, nextNum=0;
			sum=nextNum+first;
			for(int x=2;x<=count;++x) {
			sum= nextNum+first; ;
			nextNum=first;first=sum;}
			return sum;
			}
		public static void main(String[] args) {
			Scanner Keyboard = new Scanner(System.in);
			double count= Keyboard.nextDouble();
			System.out.println("number = "+ fibonacci(count));
		}
	}

