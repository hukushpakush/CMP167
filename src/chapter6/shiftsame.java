package chapter6;

public class shiftsame { //shift the value in the same array

	public static void main(String[] args) {
		int[] myArray = { 11, 23, 34, 56, -67, -78, 89, 101};
		int temp = myArray[myArray.length-1];
		
		int i = 0;
		for(i = myArray.length-2; i >= 0; --i) {
			myArray[i+1] = myArray[i];
		}
		
		System.out.print(temp + " ");
		for(i = 1; i < myArray.length; ++i) {
			System.out.print(myArray[i] + " ");}
		
	
	}
	

}
