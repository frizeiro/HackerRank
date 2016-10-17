import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		String[] strings;
		String odd, even;

		for (int i = 0; i < cases; i++) {

			strings = scan.next().split("");

			odd = "";
			even = "";

			for (int c = 0; c < strings.length; c++) {
				if (c % 2 == 0)
					even += strings[c];
				else
					odd += strings[c];
			}

			System.out.println(odd + " " + even);

		}
	}
}