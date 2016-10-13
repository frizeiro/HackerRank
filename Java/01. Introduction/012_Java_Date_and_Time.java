import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();

		String dateString = String.format("%d-%d-%d", year, month, day);
		String dayOfWeekName = "";

		try {
			Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
			dayOfWeekName = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(dayOfWeekName.toUpperCase());

	}
}
