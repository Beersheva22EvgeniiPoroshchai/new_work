

public class SportBit {

	static long mask = 0; 
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.print(getUniqueRandomInt(1, 49) + " ");
		}
			
	}
	public static int getUniqueRandomInt(int min, int max) {
		int res = 0;
		do {
			res = (int) (min + Math.random() * (max - min +1));
		} while (BitOperations.getBitValue(mask, res) == 1);
		mask = BitOperations.setBitValue(mask, res, true);
		return res;
		
	}
}


