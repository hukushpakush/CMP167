package chapter6;

import java.util.Scanner;

public class alternate {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int [] numCars = {-2 , 4, -6, 7, -9};
		int max = numCars[0]; int min = numCars[0];//to print the alternate values of the array
		for(int i= 0; i<numCars.length;i=i+2) {
			System.out.println(numCars[i]);
			
		}
	}

}
