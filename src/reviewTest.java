
public class reviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abcdefg";
		System.out.println(test.length());
		System.out.println(test.charAt(1));
		
		System.out.println(test.substring(3));
		System.out.println("abc\ndef");
		System.out.println("abc\\ndef");
		
		String test1 = "Hello John";
		test1 = test1.toUpperCase();
		System.out.println(test1);
		
		String s1 = "Hello John";
		String s2 = "hello john";
		System.out.println(s1.equals(s2));
		
		String s3 = "Hello John";
		String s4 = "hello john";
		s3 = s3.toUpperCase();
		s4 = s4.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.equals(s4));
	
	}

}
