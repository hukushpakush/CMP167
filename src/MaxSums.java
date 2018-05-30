import java.util.Scanner;
public class MaxSums {



		public static double TwoValues(double num1, double num2)  {
			if (num1 > num2) {return num1;}
			else { return num2; } 
		}
		 public static double TwoValues2(double num3, double num4) {
			if (num3 > num4) {return num3;}
			else { return num4; }
		 }
			
		public static void main(String[] args) {
			System.out.println("This Program will take two different set of numbers");
			System.out.println("It ill take the maximum number of both sets and add the nubmers together");
			System.out.println("PLease Enter four different numbers each followd by enter.");
			Scanner Keyboard = new Scanner(System.in);
			double num1 = Keyboard.nextDouble();double num2 = Keyboard.nextDouble();
			double num3 = Keyboard.nextDouble();double num4 = Keyboard.nextDouble();
			System.out.print( "The sum is: ");
			System.out.print((TwoValues(num1,num2)) + (TwoValues2(num3,num4)));
		
			
		}

	}
