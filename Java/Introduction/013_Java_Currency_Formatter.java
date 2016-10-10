import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		double payment = 922145581.25;

		displayCurrency(Locale.US, payment);
		displayCurrency(new Locale("en", "IN"), payment);
		displayCurrency(Locale.CHINA, payment);
		displayCurrency(Locale.FRANCE, payment);
	}

	static public void displayCurrency(Locale currentLocale, double payment) {

		Double currencyAmount = new Double(payment);
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);

		String displayName;

		if (currentLocale.getISO3Country().equals("USA"))
			displayName = "US";
		else
			displayName = currentLocale.getDisplayCountry(Locale.ENGLISH);

		System.out.println(displayName + ": " + currencyFormatter.format(currencyAmount));
	}


}