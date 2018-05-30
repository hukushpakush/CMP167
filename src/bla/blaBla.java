package BacteriaCycle;

import java.util.Scanner;

	public class BacteriaCycle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Please enter the amount of bacteria present in integer form followed by the ENTER key");
			int aOB ; // aOB = amount of Bacteria
			Scanner Keyboard = new Scanner(System.in);
			aOB = Keyboard.nextInt();
			
		System.out.println("If the initial amount of bacteria present is " + aOB + " then the total number of bacteria after 5 cycles is " + aOB * 2 * 2 * 2 * 2 * 2);
		
		}
}

	
	
	
	import java.util.Scanner;

	public class BacteriaCycle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int aOB ; // aOB = amount of Bacteria
			Scanner Keyboard = new Scanner(System.in);
			aOB = Keyboard.nextInt();
			int i = aOB;
			int square =  (int) Math.pow(i,6);
			
		System.out.println(Math.pow(i, 6));
			
			//P(n) = (1 = I) ^ P.I
		// (1+I)^n Math.pow(1+I, n)