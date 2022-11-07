import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
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

void getBitValueTest() {
	long number = 17; //0011_1010_1011_0111_1111_0101
	assertEquals(1, BitOperations.getBitValue(number, 5));
	assertEquals(0, BitOperations.getBitValue(number, 11));
	assertEquals(0, BitOperations.getBitValue(number, 1));
	assertEquals(1, BitOperations.getBitValue(number, 2));
	assertEquals(-1, BitOperations.getBitValue(number, -2));
	
	
} 

@Test
@Disabled
void setBitValueTest() {
	long number = 0x3ab7f5; //0011_1010_1011_0111_1111_0101
   //assertEquals(0x3ab7e5, BitOperations.setBitValue(number, 5, false));
	//assertEquals(0x3ab7f5, BitOperations.setBitValue(number, 5, true));
	assertEquals(0x3ab7f7, BitOperations.setBitValue(number, 1, true));
	assertEquals(0x3ab7f5, BitOperations.setBitValue(number, 1, false));
    assertEquals(0x3ab7fd, BitOperations.setBitValue(number, 3, true));
  //assertEquals(0x3ab7f1, BitOperations.setBitValue(number, 2, true));
	
}

@Test
@Disabled
void revertBitValueTest() {
	long number = 0x3ab7f5; //0011_1010_1011_0111_1111_0101
	//assertEquals(0x3ab7e5, BitOperations.revertBitValue(number, 5));
	assertEquals(0x3ab7f4, BitOperations.revertBitValue(number, 0));
	assertEquals(0x3ab7e5, BitOperations.revertBitValue(number, 4));
	assertEquals(0x3ab7d5, BitOperations.revertBitValue(number, 5));
	assertEquals(0x3ab7f1, BitOperations.revertBitValue(number, 2));
	assertEquals(0x2ab7f5, BitOperations.revertBitValue(number, 20));
}


@Test
void digitsNumberTest() {
	long number = 456322;
	assertEquals(6, Numbers.getNdigits(456322));
	
}
	
	
	

@Test
void leadingZerosTest() {
	long number = 17;
	assertEquals(59, BitOperations.leadingZeros(number));
}


@Test
void onesInNumberTest() {
	long number = 17;
	assertEquals(2, BitOperations.onesInNumber(number));

}


@Test
void isHappyNumberTest() {
	assertEquals(true, Numbers.isHappyNumber(123321));
	assertEquals(false, Numbers.isHappyNumber(123322));
	assertEquals(true, Numbers.isHappyNumber(465933));
	
}
}
	