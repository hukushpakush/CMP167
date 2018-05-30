import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		String mystring = Keyboard.next();
		int length = mystring.length();
		int blankSpace = 0;
		for(int n = 0; n <= length; n++){
			if(n == length){
			String match = mystring.substring(n);
			}else{
			String match = mystring.substring(n, n+1);
			if(match.equals(" ")){
			blankSpace++;
			}
			} 
			}
		System.out.println("The number of blank characters in a given string is " + blankSpace);


	}

}
