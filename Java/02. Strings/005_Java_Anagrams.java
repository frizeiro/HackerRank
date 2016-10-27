import java.io.*;
import java.util.*;

public class Solution {

	static boolean isAnagram(String a, String b) {

		// Complete the function by writing your code here.

		char[] charA = a.toLowerCase().replace(" ", "").toCharArray();
		char[] charB = b.toLowerCase().replace(" ", "").toCharArray();

		Arrays.sort(charA);
		Arrays.sort(charB);

		String strA = new String(charA);
		String strB = new String(charB);

		return strA.equals(strB);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

}