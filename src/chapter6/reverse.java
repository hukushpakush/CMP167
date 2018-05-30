package chapter6;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int [] numCars = {-2 , 4, -6, 7, -9};
		int max = numCars[0]; int min = numCars[0];
		for(int i= numCars.length - 1; i>=0;i--) { // another way to print the array value in reverse
			System.out.print(numCars[i]);
			
		}
	}

}
