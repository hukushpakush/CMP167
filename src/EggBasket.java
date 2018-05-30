import java.util.Scanner;

public class EggBasket {

	public static void main(String[] args) {
		//  
		int numberOfBaskets = 0, eggsPerBasket = 0, totalEggs;
		Scanner Keyboard = new Scanner(System.in);
	
		System.out.println("Please first enter the eggs per basket and then the number of baskets followed by the ENTER key");
		eggsPerBasket =  Keyboard.nextInt(); 
		numberOfBaskets = Keyboard.nextInt();
		
		System.out.print("If you have ");
		System.out.print(eggsPerBasket + " eggs per basket and ");
		System.out.print(numberOfBaskets + " baskets, then");
		totalEggs = numberOfBaskets * eggsPerBasket;
		System.out.println(" the total number of eggs is " + totalEggs);
		
		
	}

}
