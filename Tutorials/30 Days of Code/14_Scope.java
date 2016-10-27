import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
	private int[] elements;
	public int maximumDifference;

	// Add your code here

	Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {

		maximumDifference = 0;

		for (int a = 0; a < elements.length; a++) {
			for (int b = a; b < elements.length; b++) {

				int diff;
				if (elements[a] > elements[b])
					diff = elements[a] - elements[b];
				else
					diff = elements[b] - elements[a];

				if (diff > maximumDifference)
					maximumDifference = diff;

			}
		}
	}

}

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		sc.close();
		
		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}