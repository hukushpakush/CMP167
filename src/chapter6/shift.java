package chapter6;

public class shift {

	public static void main(String[] args) {
		int[] myArray = { 11, 23, 34, 56, -67, -78, 89, 101};
		int[] shiftArray = new int [ myArray.length ];
		shiftArray[0] = myArray[myArray.length - 1];
		int i = 0; //loop counter
		for( i = 0; i < myArray.length - 1; ++i) {
			shiftArray[i+1] = myArray[i];
			
		}
		for (i = 0; i < myArray.length; ++i) {
			System.out.print(shiftArray[i] + " ");
		}
			
	}

}
