import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int max = 0;
		int out = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				out = sum(arr, i, j);
				max = max > out ? max : out;
			}
		}

		System.out.println(max);

	}

	private static int sum(int[][] a, int i, int j) {
		return
				a[i][j]		+ a[i][j + 1]		+ a[i][j + 2]
							+ a[i + 1][j + 1]
			+ a[i + 2][j]	+ a[i + 2][j + 1]	+ a[i + 2][j + 2];
	}

}
