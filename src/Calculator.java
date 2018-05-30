import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To find the sum of two integers enter two intergers and each follwed with the ENTER key");
				
	    int n1, n2;
	    
	    Scanner Keyboard = new Scanner(System.in);
	    n1 = Keyboard.nextInt();
	    n2 = Keyboard.nextInt();
	    
	    System.out.print("The sum of the integers is :  ");
	    System.out.println(n1 + n2);
	    System.out.print("The difference of the integers is : ");
	    System.out.println(n1 - n2);
	    System.out.print("The product of the integers is : ");
	    System.out.println(n1 * n2);
	    System.out.print("The quotient of the integers is : ");
	    System.out.println(n1 / n2);
	   		
	}

}
