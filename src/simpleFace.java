
public class simpleFace {
	
	public static void PrintFace(char eye, int nose, char mouth) 
	{	
		System.out.println("  " + eye + "   " + eye);//eyes
		System.out.println("    " + nose);//nose
		System.out.println("  " + mouth + mouth + mouth + mouth + mouth);
		
	}
	public static void Pattern() {
		System.out.println("XOXOXOXO");
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; ++i)
		{
		PrintFace('O', 2 , 'v');
		Pattern();
		}
		
	}
}
