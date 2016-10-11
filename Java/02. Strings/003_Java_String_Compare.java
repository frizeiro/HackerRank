import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt();

		String first = s.substring(0, k);
		String last = s.substring(0, k);
		String current;

		for (int i = 0; i < s.length() - k + 1; i++) {

			current = s.substring(i, i + k);

			if (current.compareTo(first) < 0)
				first = current;
			else if (current.compareTo(last) > 0)
				last = current;

		}

		System.out.println(first);
		System.out.println(last);
	}
}