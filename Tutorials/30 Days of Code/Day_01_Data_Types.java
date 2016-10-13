import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		 /* Declare second integer, double, and String variables. */
		int iS;
		double dS;
		String sS;

        /* Read and save an integer, double, and String to your variables.*/
		iS = Integer.valueOf(scan.nextLine());
		dS = Double.valueOf(scan.nextLine());
		sS = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
		System.out.println(i + iS);

        /* Print the sum of the double variables on a new line. */
		System.out.println(d + dS);

        /* Concatenate and print the String variables on a new line; the 's' variable above should be printed first. */
		System.out.println(s + sS);

		scan.close();
	}
	
}