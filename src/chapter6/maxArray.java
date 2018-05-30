package chapter6;
import java.util.Scanner;
public class maxArray {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int [] numCars = {23 , -18, 42, -34, 72, -86, 181, -205};
	
		int max = numCars[0]; //start by assuming this
		int min = numCars[0]; int neg=0; int m = 0;
		for(int i= 0; i<numCars.length;i++) {//numCars.length so we can use this for any size of arrays
			if (max < numCars[i]) {
				max = numCars[i]; }
				else 	if (min > numCars[i]) {
					min = numCars[i];
			}	
			if (numCars[i] < 0) { // to find out all the negative values in the array
				neg = neg + 1; 
			}
			if (numCars[i] > 50) {// to find out all the values more than zero
				m = m + 1;
			}
			System.out.print(numCars [numCars.length - 1 - i] + "  ");//to print the array values in reverse
				
		}
		
		System.out.println("Max is : " + max);
		System.out.println("Min is : " + min);
		System.out.println("There is "+ neg + " negative values");
		System.out.println("There is " + m + " values more than 50");
	}

}