

public class BitOperations {
	
	private static final int N_BITS = 64;




static public int getBitValue(long number, int nBit) {
int res = -1;
if (checkNbit(nBit)) {
long mask = getMask(nBit); // all bits are zero except bit with number nBit
res = (number & mask) == 0 ? 0 : 1;


}
	
	return res;
}



private static long getMask(int nBit) {
	return 1L << nBit;
}



	private static boolean checkNbit (int nBit) {
		return nBit > -1 && nBit < N_BITS;
	}

	
	
	

 	static	public long setBitValue(long number, int nBit, boolean Value) {
 		long res =- 1;
 			if (checkNbit(nBit)) {
 			long mask = getMask(nBit);
 			res = Value ? number | mask : number & ~mask; 
 			
 		}
 		return res;
 		}
 	
 	
 
	

static public long revertBitValue(long number, int nBit) {
		long res = 0;
		if (checkNbit(nBit)) {	
			long mask = getMask(nBit); // all bits are zero except bit with number nBit
			res = number ^ mask;
		}
		return res;
	}
		



static public int leadingZeros(long number) {
	int res = 0;
	int nBit = N_BITS - 1;
	while(nBit >= 0 && getBitValue(number, nBit) == 0) {
		nBit--;
		res++;
	}
	return res;
	
}


static public int onesInNumber(long number) {
	int res = 0;
	for (int i = 0; i < N_BITS; i++) {
		if (getBitValue(number, i) == 1) {
			res++;
		}
	}
	return res;
		
}

}




	

