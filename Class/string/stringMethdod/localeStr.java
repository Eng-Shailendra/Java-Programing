package string.stringMethdod;

import java.util.Locale;

public class localeStr {
	// equalsIgnoreCase does not let you specify a Locale. For instance, if you
	// compare the two words "Taki"
	// and "TAKI" in English they are equal

	public static void main(String[] args) {
		String s1 = "taki";
		String s2 = "TAki";
		System.out.println(s1.equalsIgnoreCase(s2)); // true;

		Locale locale = Locale.forLanguageTag("tr-TR");

		System.out.println(s1.toLowerCase(locale).equals(s2.toLowerCase(locale)));
	}
}
