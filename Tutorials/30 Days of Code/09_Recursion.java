import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		System.out.println(factorial(N));
	}

	private static int factorial(int f) {
		if (f <= 1)
			return 1;
		else
			return f * factorial(f - 1);
	}


}