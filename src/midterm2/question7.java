package midterm2;

public class question7 {

	public static void main(String[] args) {
		for ( int row = 6; row > 0; row--) {
			for (int column = 0; column < 6-row; column ++) {
				System.out.print("*");
			}
			System.out.println(row);
		}
	}

}
