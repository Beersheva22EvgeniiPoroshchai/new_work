import java.util.Arrays;

public class Strings {
	/**
	 * 
	 * @param str
	 * @param anagram
	 * @return true if anagram is anagram of str complexity O[N] two passes 1. the
	 *         same length 2. the same symbols just in different order
	 */

	public static boolean isAnagram(String str, String anagram) {

		if (str.length() != anagram.length()) {
			return false;
		}
		byte coun[] = new byte[Byte.MAX_VALUE];

		for (byte i = 0; i < str.length(); i++) {
			coun[str.charAt(i)]++;
			coun[anagram.charAt(i)]--;
		}

		for (byte i = 0; i < Byte.MAX_VALUE; i++) {
			if (coun[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void sortStringNumbers(String[] strArray) {

		byte[] forNum = new byte[strArray.length];
		for (byte i = 0; i < forNum.length; i++) {

			forNum[i] = (byte) Integer.parseInt(strArray[i]);
		}

		Arrays.sort(forNum);

		for (byte i = 0; i < forNum.length; i++) {

			strArray[i] = String.valueOf(forNum[i]);
		}
	}

	public static void sortStringNumbersY(String[] array) {
		int offset = Byte.MAX_VALUE + 1;
		int helper[] = new int[offset * 2];
		fillHelper(helper, array, offset);
		sortFromHelper(array, helper, offset);
	}

	private static void sortFromHelper(String[] array, int[] helper, int offset) {
		int arrayInd = 0;
		for (int i = 0; i < helper.length; i++) {
			for (int j = 0; j < helper[i]; j++) {
				array[arrayInd++] = getStringNumberFromIndex(i, offset);
			}
		}

	}

	private static String getStringNumberFromIndex(int index, int offset) {
		int number = index - offset;

		return Integer.toString(number);
	}

	private static void fillHelper(int[] helper, String[] array, int offset) {
		for (int i = 0; i < array.length; i++) {
			int index = getIndexFromStringNumber(array[i], offset);
			helper[index]++;
		}

	}

	private static int getIndexFromStringNumber(String string, int offset) {
		int number = Integer.parseInt(string);
		return number + offset;
	}

	public static String javaNameExp() {

		return "[a-zA-Z$][\\w$]*|_[\\w$]+";

	}

	public static String ipV4Octet() {

		return "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	}

	public static String ipV4() {

		return "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	}

}
