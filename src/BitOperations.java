/** 
*
*right nBit value [0 - 63]
*All methods return -1 in the case of wrong nBit value
*	
* @param number any number
* @param nBit - number of bit
* @return value of bit with number nBit
*/


public class BitOperations {
	
	
static public int getBitValue(long number, int nBit) {
int res = -1;
if (checkNbit(nBit)) {
long mask = 1 << nBit; // all bits are zero except bit with number nBit
if ((number & mask) == 0) {
res = 0;
} else {
		res = 1;
	}
}
	
	return res;
	}
	
	private static boolean checkNbit (int nBit) {
		return nBit > -1 && nBit < 64;
	}

	
	/*	
	* 	
	* @param number any number
	* @param nBit - number of bit
	* @param value true for 1 or false for 0
	* return number in which value of nBit'th will have a given value 
*/
	
	
	static	public long setBitValue(long number, int nBit, boolean Value) {
		if (checkNbit(nBit)) {
			if (Value) {
			long mask = 1 << nBit; // all bits are zero except bit with number nBit
			//System.out.println(mask);
			//System.out.println(number);
			//System.out.println(nBit);
			number = number | mask;
			//System.out.println(number);
			}	
		}
		return number;
	}
	

static public long revertBitValue(long number, int nBit) {
		long res = 0;
		if (checkNbit(nBit)) {	
			long mask = 1 << nBit; // all bits are zero except bit with number nBit
			res = number ^ mask;
		}
		return res;
	}
		
}

/*	
* 	
* @param number any number
* @param nBit - number of bit
* return new number in which nBit will be replaced (old value - 1, new value -0)
* 

	
	
*/


