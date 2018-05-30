package chapter6;
import java.util.Scanner;
public class arrayBasics {
	public static void main(String[] args) {
	Scanner Keyboard = new Scanner(System.in);
	int[] numCars = {-2 , 4, -6, 7, -9};
		
		for(int i = 0; i<5; i++) { //populating the array
			System.out.println("Please Enter Car Number : ");
			numCars[i] = Keyboard.nextInt();
	
		}

		int sum = 0;for(int i= 0; i<5; i++) {
			System.out.print(numCars[i]+ " ");
			sum = sum + numCars[i];
			
		}
		System.out.println();
		System.out.println("Sum is " + sum );
		System.out.println("Average is " + sum/(double)numCars.length);
		
	}
	

}
