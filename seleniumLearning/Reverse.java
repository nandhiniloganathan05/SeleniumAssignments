package seleniumLearning;

public class Reverse {

	public static void main(String[] args) {
		String name = "i am Software engineer";
		String[] newname = name.split(" ");
		for (int i = 0; i < newname.length-1; i++) {
			if (i%2==0) {
				System.out.print(" "+newname[i]);
				System.out.print(" ");
				
			} else {
				char[] ch = newname[i].toCharArray();
				for (int j = ch.length-1; j >=0; j--) {
					System.out.print(""+ch[j]);
					
				}

			}
			
		}

	}

}
