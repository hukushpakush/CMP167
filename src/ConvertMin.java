import java.util.Scanner;
public class ConvertMin {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		int amount = 0, days = 0, totalMin = 0, hours = 0, min = 0;
		System.out.println("Please Enter Totatl Minutes :");
		totalMin = Keyboard.nextInt();
		amount = totalMin;
		
		days = totalMin / (24*60);
		amount = totalMin % (24*60);
		hours = amount / 60;
		min = amount % 60;
		int n=3, m=5;
		
		System.out.println((n--)*(m++)+(++m)*(++n));
		System.out.println("A total amount of " + totalMin + " Minutes is equivlent to : ");
		System.out.println(days + " days " + hours + " hours " + min + " Minutes ");
		
		
	}

}
