package chapter6;

public class shiftleft {

	public static void main(String[] args) {
		int[] myArray = { 11, 23, 34, 56, -67, -78, 89, 101};// 23, 34, 56, -67, -78, 89, 101, 11
		int[] shiftArray = new int [ myArray.length ];
		shiftArray[shiftArray.length -1] = myArray[0];
		int i = 0; //loop counter
		for( i = 0; i < myArray.length-1; ++i) {
			shiftArray[i] = myArray[i+1];
			
		}
		for (i = 0; i < myArray.length; ++i) {
			System.out.print(shiftArray[i] + " ");
		}

	}

}
