package chapter6;

public class moreArray {

	public static void main(String[] args) {
		int[] myArray = {23 , -18, 42, -34, 72, -86, 181, -205};
		int[] numCopy = new int[myArray.length];
		for (int i = 0; i < myArray.length; i++) {// to copy myArray array values in to numCopy array
			numCopy[i] = myArray[i];
		}
//		for (int i = 0; i < myArray.length; i++) {
//			System.out.print(" " + numCopy[i]);
//		}
		
		int[] myArray2 = { 10, 20, 30, 40, 55, 66, 77, 88, 99};
		int[] sumArray = new int[myArray.length];
		for (int i = 0; i < myArray.length; i++) {
			sumArray[i] = myArray[i] + myArray2[i];
			System.out.print(sumArray[i] + " ");
		}
		
	}

}
