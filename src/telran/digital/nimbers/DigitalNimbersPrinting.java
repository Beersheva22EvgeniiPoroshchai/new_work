
package telran.digital.nimbers;

public class DigitalNimbersPrinting {

	private static final String SYMBOL = "*";

	public static void displayDigitalNumber(int number, int offset, int width, int height) {
	

		
	String[] res = new String[height];
	int [] digitToScreen = getDigits(number);
	for (int i =0; i<digitToScreen.length; i++) {
		String [] oneNumberForDigit = kitDigits(offset, width, height, digitToScreen[i]);
		for (int j = 0; j< oneNumberForDigit.length; j++) {
			res[j] = res[j] + oneNumberForDigit[j]; 
		}
	}
	displayStrings(res);
	}


	public static int[] getDigits(int number) {
		int res[] = new int[getNdigits(number)];
		for(int i = res.length - 1; i >= 0; i--) {
			res[i] = number % 10;
			number /= 10;
		}
		return res;
	
	}
	
	static public int getNdigits(long number) {
		int res = 0;
		do {
			number /= 10;
			res++;

		} while (number != 0);
		return res;
	}
	
	
	public static String[] kitDigits(int offset, int width, int height, int digitToScreen) {
		
			
			String[] res = new String[height];
			switch (digitToScreen) {
			case 0: res = zero(offset, width, height); break;
			case 1: res = one(offset, width, height); break;
			case 2: res = two(offset, width, height); break;
			case 3: res = three(offset, width, height); break;
			case 4: res = four(offset, width, height); break;
			case 5: res = five(offset, width, height); break;
			case 6: res = six(offset, width, height); break;
			case 7: res = seven(offset, width, height); break;
			case 8: res = eight(offset, width, height); break;
			case 9: res = nine(offset, width, height); break;
			default: break;
			}
		
	return res; 
		
		
	}


	
	
	public static String line(int offset, int length) {
		return " ".repeat(offset) + SYMBOL.repeat(length);

	}

	public static String[] verticalLine(int offset, int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL;
		}
		return res;
	}

	public static String[] twoVerticalLines(int offset, int width, int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL + " ".repeat(width - 2) + SYMBOL;

		}
		return res;
	}

	public static String[] zero(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height - 2);
		System.arraycopy(lines, 0, res, 1, lines.length);
		res[height - 1] = line(offset, width);
		return res;

	}

	public static String[] one(int offset, int width, int height) {

		return verticalLine(offset + width - 1, height);

	}

	public static String[] two(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] firstSideLine = verticalLine(offset + width - 1, height / 2 - 1);
		String[] secondSideLine = verticalLine(offset, height / 2 - 1);
		for (int i=0; i<secondSideLine.length; i++) {
			secondSideLine[i] += " ".repeat(width - 1);
		}
		System.arraycopy(firstSideLine, 0, res, 1, firstSideLine.length);
		System.arraycopy(secondSideLine, 0, res, height / 2 + 1, secondSideLine.length);
		
		res[height - 1] = line(offset, width);
		res[height / 2] = line(offset, width);
		return res;

	}

	public static String[] three(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] sideLine = verticalLine(offset, height - 1);
		System.arraycopy(verticalLine(offset + width - 1, height), 0, res, 1, sideLine.length);
		res[height - 1] = line(offset, width);
		res[height / 2] = line(offset, width);

		return res;

	}

	public static String[] four(int offset, int width, int height) {
		String[] res = new String[height];
		res[height / 2] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height / 2);
		System.arraycopy(lines, 0, res, 0, lines.length);
		String[] sideLine = verticalLine(offset + width - 1, height / 2);
		System.arraycopy(sideLine, 0, res, height / 2 + 1, sideLine.length);

		return res;

	}

	public static String[] five(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] firstSideLine = verticalLine(offset, height / 2 - 1);
		for (int i=0; i<firstSideLine.length; i++) {
			firstSideLine[i] += " ".repeat(width - 1);
		}
		String[] secondSideLine = verticalLine(offset + width - 1, height / 2 - 1);
		System.arraycopy(firstSideLine, 0, res, 1, firstSideLine.length);
		System.arraycopy(secondSideLine, 0, res, height / 2 + 1, secondSideLine.length);
		res[height - 1] = line(offset, width);
		res[height / 2] = line(offset, width);
		return res;

	}

	public static String[] six(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		res[height - 1] = line(offset, width);
		res[height / 2] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height / 2 - 1);
		System.arraycopy(lines, 0, res, height / 2 + 1, lines.length);
		String[] sideLine = verticalLine(offset, height / 2 - 1);
		for (int i=0; i<sideLine.length; i++) {
			sideLine[i] += " ".repeat(width - 1);
		}
		System.arraycopy(sideLine, 0, res, 1, sideLine.length);
		return res;

	}

	public static String[] seven(int offset, int width, int height) {
		String[] res = verticalLine(offset + width - 1, height);
		res[0] = line(offset, width);
		return res;

	}

	public static String[] eight(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height - 2);
		System.arraycopy(lines, 0, res, 1, lines.length);
		res[height - 1] = line(offset, width);
		res[height / 2] = line(offset, width);
		return res;

	}

	public static String[] nine(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		res[height - 1] = line(offset, width);
		res[height / 2] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height / 2 - 1);
		System.arraycopy(lines, 0, res, 1, lines.length);
		String[] sideLine = verticalLine(offset + width - 1, height / 2 - 1);
		System.arraycopy(sideLine, 0, res, height / 2 + 1, sideLine.length);

		return res;

	}

	public static void displayStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

	}
}
