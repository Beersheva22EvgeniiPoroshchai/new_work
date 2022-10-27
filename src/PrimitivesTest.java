import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.*;

import org.junit.jupiter.api.Test;

class PrimitivesTest {
	
    @Test
    @Disabled
	void dataTypeTest(int g) {
		int b = 10;
		long a = 20;
		char c = 'd';
		long l = (long) 10.1;
		short d = 20;
		byte b1 = (byte) 1000;
		a = (short) l;
		float f = 10.2F;
		int b2 = 0xfffffff1;
		float h = 10.1F;
		g = 34;
		int m = (int)10.5;
		byte k = -128;
		short p = 128;
		
		assertEquals(-15, b2);
	}
 
    @Test
    @Disabled
    void operatorsTest( ) {
    	int number = 789;
    	assertEquals(7, getThirdDigit(number));
    	assertEquals(8, getSecondDigit(number));
    	assertEquals(9, getFirstDigit(number));
    	getFirstDigit(number);
    	int resultFromFirstMethod = getFirstDigit(number);
    	
    	}

 int getFirstDigit(int number) {
	int result = number % 10;
	return result;
	}


int getSecondDigit(int number) {
	
	int x = getFirstDigit(number); 
	int result = ((number - getFirstDigit(number)) / 10) % 10;
	return result;
	}


int getThirdDigit(int number) {
	
	int result =  (number - getFirstDigit(number) - ((number - getFirstDigit(number)) % 100)) / 100;
	return result;
	}





@Test
@Disabled
void test() {
	
	int number = 5643;
	
	for (int i = 1; number > 0; i++) {
		 
		int difer = number % (int)Math.pow(10, i);
		
		System.out.println(difer/(int)Math.pow(10, i-1));
	
		number = number - difer;
	}
}
}











