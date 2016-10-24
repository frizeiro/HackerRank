import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		int n = 13;

		String bin = Integer.toString(n, 2);

		int count = 0;
		int max = 0;

		for (int i = 0; i < bin.length(); i++) {

			if (String.valueOf(bin.charAt(i)).equals("1")) {

				count++;

				if (count > max)
					max = count;

			} else {

				count = 0;

			}

		}

		System.out.println(max);

	}


}
