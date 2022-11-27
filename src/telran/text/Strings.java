package telran.text;

import java.util.Arrays;

public class Strings {

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

		return "([01]?\\d\\d?|2([0-4]\\d|5[0-5]))";

	}

	public static String ipV4() {
		String octetExp = ipV4Octet();
		return String.format("(%1$s\\.){3}%1$s", octetExp);

	}

	private static String arithmeticExpression() {

		String operatorExp = operator();
		String operandExp = operand();

		return String.format("\\(*%1$s\\)*(%2$s\\(*%1$s\\)*)*", operandExp, operatorExp);

	}

	private static String operand() {

		return "(\\d+\\.?\\d*|\\.\\d+|" + javaNameExp() + ")";

	}

	public static boolean isArithmeticExpression(String expression) {
		expression = expression.replaceAll("\\s+", "");
		return expression.matches(arithmeticExpression());
	}

	private static String operator() {

		return "([-+*/])";
	}

	public static Double computeArithmenticExpression(String expression, double values[], String names[]) {

		Double res = Double.NaN;
		if (isArithmeticExpression(expression) && checkBraces(expression)) {
			expression = expression.replaceAll("[\\s()]+", "");
			String operands[] = expression.split(operator());
			String operators[] = expression.split(operand());
			res = getOperandValue(operands[0], values, names);
			int index = 1;
			while (index < operands.length && !res.isNaN()) {
				double operandValue = getOperandValue(operands[index], values, names);
				res = computeOperation(res, operandValue, operators[index]);
				index++;
			}
		}
		return res;
	}

	private static Double computeOperation(Double operand1, double operand2, String operator) {
		Double res = Double.NaN;
		if (!Double.isNaN(operand2)) {
			switch (operator) {
			case "+":
				res = operand1 + operand2;
				break;
			case "-":
				res = operand1 - operand2;
				break;
			case "*":
				res = operand1 * operand2;
				break;
			case "/":
				res = operand1 / operand2;
				break;
			default:
				res = Double.NaN;

			}
		}
		return res;
	}

	private static Double getOperandValue(String operand, double[] values, String[] names) {
		double res = Double.NaN;
		if (values == null && names == null || operand.matches("\\d+\\.?\\d*")) {
			res = Double.parseDouble(operand);
		} else {
			if (values.length == names.length) {
				int index = 0;
				while (index < values.length && Double.isNaN(res)) {
					if (operand.equals(names[index])) {
						res = values[index];
					}
					index++;
				}

			}
		}
		return res;
	}

	public static boolean checkBraces(String expression) {
		boolean res = false;
		int count = 0;
		char braces[] = expression.toCharArray();
		for (int i = 0; i < braces.length; i++) {
			if (braces[i] == '(') {
				count++;
			}
			if (braces[i] == ')') {
				count--;
			}
		}

		if (count == 0) {
			res = true;

		}

		return res;

	}

}
