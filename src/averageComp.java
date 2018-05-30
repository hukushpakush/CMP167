import java.util.Scanner;
public class averageComp 
{
	public static void AverageComp(double sum, double j) 
	{
		double avg = sum/j;
	System.out.println("The average is : " + avg);	
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter the numbers to find out the average: ");
		System.out.println("Please enter a negative number at the end");
		Scanner Keyboard = new Scanner(System.in);
		double i= Keyboard.nextDouble(), j= 0, sum = 0;
		while (i>0)
		{
			sum = sum + i;
			j++;
			i= Keyboard.nextDouble();
		}
		//System.out.println(i);
		//System.out.println(j);
		//System.out.println(sum);

			AverageComp(sum, j);
	}
}

/* extend this program to any collection of value entered by the user */
//sum and value