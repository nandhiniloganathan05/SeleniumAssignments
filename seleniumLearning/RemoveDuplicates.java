package seleniumLearning;

import org.apache.poi.util.SystemOutLogger;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String a1 ="we learn java basics as part of java sessions in java week1";
		String b1[] = a1.split("");
		
for (int i = 0; i < b1.length; i++) {
	for (int j = i+1; j < b1.length; j++) {
		if (b1[i].equalsIgnoreCase(b1[j]))
			b1[j]=" ";
		
	}
	System.out.print(b1[i]);
}
	}
      
}
