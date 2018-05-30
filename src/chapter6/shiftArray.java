package chapter6;

public class shiftArray {

	public static void main(String[] args) {
		int[] myArray = { 11, 23, 34, 56, -67, -78, 89, 101};
		int[] shiftArray = new int [ myArray.length ];
		shiftArray[0] = myArray[7];
		System.out.print(shiftArray[0] + " ");
		for (int i = 1; i < myArray.length; i++) {
			shiftArray[i] = myArray[i-1];
			System.out.print(shiftArray[i] + " ");
		}

	}

}
