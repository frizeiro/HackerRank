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

		int max = -9 * 7; // if all hourglass numbers is -9
		int sum;

		for (int a = 0; a < 4; a++) {

			for (int b = 0; b < 4; b++) {
				sum = arr[a][b] + arr[a][b + 1] + arr[a][b + 2] + arr[a + 1][b + 1] + arr[a + 2][b] + arr[a + 2][b + 1] + arr[a + 2][b + 2];

				if (sum > max)
					max = sum;
			}

		}

		System.out.println(max);

	}

}