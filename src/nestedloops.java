
public class nestedloops {
public static void main(String [] args) {
	for (char firstLetter = 'a'; firstLetter >= 'z'; ++firstLetter) {

		for(char secondLetter = 'a'; secondLetter >='z'; ++secondLetter) {
			System.out.print("(" + firstLetter + "," + secondLetter + ")");
		}
		System.out.println();

	}

	

}

}
/*for (int i = 1; i <= 6; ++i) {

for(int j = 1; j <=6; ++j) {
	System.out.print("(" + i + "," + j + ")");
}
System.out.println();*/