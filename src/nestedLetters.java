
public class nestedLetters {

	public static void main(String[] args) {
	char firstLetter = 'a', secondLetter = 'a';

	while (firstLetter <= 'z')
		{
		secondLetter = 'a'; 
		while(secondLetter <= 'z')
			{
			System.out.println("" + firstLetter + secondLetter + ".com ");
			secondLetter++;
			}
		for (int i = 0; i <= 9; ++i)
		{
			System.out.println("" + firstLetter + i + ".com");
		}
			
		firstLetter++;	
		}
	
	}
}

