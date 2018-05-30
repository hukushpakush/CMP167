// nested loop but for WHILE LOOPS

import java.util.Scanner;

public class whileNested {

	public static void main(String[]args) {

	

		int i = 1;

		

		while( i <= 6 ) {

			 

		int j = 1;

			

			while ( j <= 6 )

				{System.out.print("(" + i + "," + j + ")"); 

				j++;}

				System.out.println();

				++i;

					}			

}

}

