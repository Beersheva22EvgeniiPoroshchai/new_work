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
	
	public static String javaNameExp () {
		
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
		
		
	}
	
	public static String ipV4Octet () {
		
		
		
		return "[0-1][0-9]{2}|2[0-4][0-9]|2[0-5][0-5]";
		
		 
		
	
	}
	
	public static String ipV4() {
		

		
return "(((([0-1][0-9]{2}|2[0-4][0-9]|2[0-5][0-5])[.]){3})([0-1][0-9]{2}|2[0-4][0-9]|2[0-5][0-5]))";	
		
		
	}
	
	
	
	
	
	

}
