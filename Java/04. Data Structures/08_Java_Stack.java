import java.util.*;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();

			//Complete the code
			int last = 0;

			while (input.length() > 0 && input.length() != last) {
				last = input.length();
				input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "");
			}

			System.out.println(input.length() == 0 ? "true" : "false");

		}

	}
}
