
public class IsraelIdentity {

	

	public static boolean verify(int id) {
		int controlSum = 0;
		boolean res = false;
		int teudats[] = Numbers.getDigits(id);
		for (int i = 0; i < teudats.length; i++) {
			if (i % 2 == 0) {
				controlSum += teudats[i];
			}
			if (i % 2 != 0 && teudats[i] < 5) {
				controlSum = controlSum + teudats[i] * 2;
			}
			if (i % 2 != 0 && teudats[i] > 4) {
				controlSum += Numbers.getSumDigits(teudats[i] * 2);
				
			}
		}
		if (controlSum % 10 == 0) {
			res = true;
		}
		return res;
		
	}

	public static int generateRandomId(int numId) {
			numId = SportBit.getUniqueRandomInt(10000000, 99999999);
			int sumUniqueDigits[] = Numbers.getDigits(numId);
	int controlSum = 0;
	for (int i = 0; i < sumUniqueDigits.length; i++) {
		if (i % 2 == 0) {
			controlSum += sumUniqueDigits[i];
		}
		if (i % 2 != 0 && sumUniqueDigits[i] < 5) {
			controlSum = controlSum + sumUniqueDigits[i] * 2;
		}
		if (i % 2 != 0 && sumUniqueDigits[i] > 4) {
			controlSum += Numbers.getSumDigits(sumUniqueDigits[i] * 2);
		}
	}
	
	if (controlSum % 10 == 0) {
		numId *= 10;
	} else {
		numId = (numId * 10) + Math.abs(controlSum % 10) - 10; 
	}
	return numId;
	
	}
			}

	

	
	
