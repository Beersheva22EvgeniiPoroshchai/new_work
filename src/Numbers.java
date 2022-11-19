
public class Numbers {
	static public final int N_HAPPY_NUMBER_DIGITS = 6;

	static public int getNdigits(long number) {
		int res = 0;
		do {
			number /= 10;
			res++;

		} while (number != 0);
		return res;
	}

	static public boolean isHappyNumber(int number) {
		boolean res = false;
		number = Math.abs(number);
		if (getNdigits(number) == N_HAPPY_NUMBER_DIGITS) {
			int halfDigits = N_HAPPY_NUMBER_DIGITS / 2;
			int numberPartDivider = (int) Math.pow(10, halfDigits);
			int sumFirstPart = getSumDigits(number / numberPartDivider);
			res = sumFirstPart == getSumDigits(number % numberPartDivider);

		}

		return res;
	}

	static public int getSumDigits(int number) {
		int res = 0;
		do {
			res += number % 10;
			number /= 10;
		} while (number != 0);
		return res;

	}
	
	public static int[] getDigits(int number) {
		int res[] = new int[getNdigits(number)];
		for(int i = res.length - 1; i >= 0; i--) {
			res[i] = number % 10;
			number /= 10;
		}
		return res;
	
	}



public static int getNumberFromDigits(int[] digits) {
	int res = 0;
	for (int i = 0; i < digits.length; i++) {
		res = res * 10 + digits[i];  
	}
	return res;
}


public static long getRandomNumber(long min, long max) {
return (long) (min + Math.random() * (max - min + 1));


}

}















// static public boolean isHappyNumber(int number) {
// boolean res = false;
// if(number >= 100000 && number <= 999999) {
// int first = number % 10;
// int second = number / 10 % 10;
// int third = number / 100 % 10;
// int fourth = number / 1000 % 10;
// int fifth = number / 10000 % 10;
// int sixth = number / 100000 % 10;

// if (first + second + third == fourth + fifth + sixth) {

// res = true;

// }

// }

// return res;

// }

//}
