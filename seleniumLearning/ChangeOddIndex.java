package seleniumLearning;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test = "changeme";
		char[] odd = test.toCharArray();
		for (int i = 0; i < odd.length; i++) {
		if (i%2==0) {
			char chartest = Character.toUpperCase(odd[i]);
			System.out.print(chartest);
			
		} else {
			System.out.print(odd[i]);

		}
			
		}
			
		}


	}


