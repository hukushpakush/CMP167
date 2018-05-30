import java.util.Scanner;
public class EnumerationExample {
	enum MovieRating { Excellent, Good, Bad, Avoid}
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		MovieRating rating;
		String inputRating;
		System.out.println("Please enter your rating exactly like this:");
		System.out.println(" Excellent or Good or Bad or Avoid");
		inputRating = Keyboard.next();
		rating = MovieRating.valueOf(inputRating);
		
		switch(rating) {
		case Excellent:
			System.out.println("Excellent movie! Must see!!");
			break;
		case Good:
			System.out.println("An okay movie. Netflix");
			break;
		case Bad:
			System.out.println("Throw em in the trash");
			break;
		case Avoid:
			System.out.println("Don't even think about watching it!");
			break;
		default:
			System.out.println("Please enter your rating EXACTLY as instructed");
		}

	}

}
