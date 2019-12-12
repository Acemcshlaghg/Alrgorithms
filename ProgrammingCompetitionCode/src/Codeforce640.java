import java.util.ArrayList;
import java.util.Scanner;

public class Codeforce640 {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 3 
		 * a???cb a??bbc a?b?c
		 */
		int numTestCases = s.nextInt();
		for (int i = 0; i < numTestCases; i++) {

			String str = s.next();
			String[] lets = str.split("");
			boolean changed = false;
			for (int let = 0; let < lets.length; let++) {
				if (!changed && lets[let].equals("?")) {
					if (let == 0) {
						lets[let] = lets[let + 1];
					} else {
						lets[let] = lets[let - 1];
					}
					changed = true;
				}
				else if (changed && lets[let].equals("?")) {
					ArrayList<String> abc = new ArrayList<String>();
					abc.add("a");
					abc.add("b");
					abc.add("b");
					abc.remove(lets[let - 1]);
					abc.remove(lets[let + 1]);
					lets[let] = abc.get(0);
					
				}
			}
			if(!changed) {
				System.out.println("-1");
			}
			for (String letter : lets) {
				System.out.print(letter);
			}

		}
	}
}
