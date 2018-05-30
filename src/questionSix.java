
public class questionSix {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
				int x = 10, Test1= 0, Test2=0, test3=0, y=3, z=2;
				
				System.out.println("Test 1 " + x * 3 * 2.0);
				System.out.println("Test 2 " + x * 3 + 2.0);
				System.out.println("Test 3 " + x * 3 + -2.0);*/
				//System.out.print('\0'+0);

	String mystring = " She loves String Theory ";
	System.out.println(mystring.substring(1,5));
	
	String firstword = ""; //initialize string to empty
	String secondWord = "";
	mystring = mystring.trim();
	int spaceIndex = mystring.indexOf(" ");
	firstword = mystring.substring(0, spaceIndex);
	System.out.println(firstword);
	
	mystring = mystring.substring(spaceIndex);
	mystring = mystring.trim();
	System.out.println(mystring);
	
	spaceIndex = mystring.indexOf(" ");
	firstword = mystring.substring(0, spaceIndex);
	System.out.println(firstword);
	
	mystring = mystring.substring(spaceIndex);
	mystring = mystring.trim();
	System.out.println(mystring);
	
	spaceIndex = mystring.indexOf(" ");
	firstword = mystring.substring(0, spaceIndex);
	System.out.println(firstword);
	
	mystring = mystring.substring(spaceIndex);
	mystring = mystring.trim();
	System.out.println(mystring);
	
	
	
	
	
	}

}
