package seleniumLearning;

public class FindPalindrome {

	public static void main(String[] args) {
		String a1 = "AMMA";
		String b1 = "";
		char[] character = a1.toCharArray();
		int length = a1.length();
		for (int i = length-1; i >=0; i--) {
			b1 +=Character.toString(character[i]);
			
		}
		if (a1.equalsIgnoreCase(b1)) {
			System.out.println(b1);
			System.out.println("palidrome");
			
		} else {
			System.out.println("Not a palidrome");

		}

	}

}
