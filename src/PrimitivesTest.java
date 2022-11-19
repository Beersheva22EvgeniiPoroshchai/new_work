
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
	long number = 0x3ab7f5; 
    assertEquals(0x3ab7e5, BitOperations.setBitValue(number, 5, false));
	assertEquals(0x3ab7f5, BitOperations.setBitValue(number, 5, true));
	assertEquals(0x3ab7f7, BitOperations.setBitValue(number, 1, true));
	assertEquals(0x3ab7f5, BitOperations.setBitValue(number, 1, false));
    assertEquals(0x3ab7fd, BitOperations.setBitValue(number, 3, true));
    assertEquals(0x3ab7f1, BitOperations.setBitValue(number, 2, true));
	
}

@Test
@Disabled
void revertBitValueTest() {
	long number = 0x3ab7f5; 
	assertEquals(0x3ab7e5, BitOperations.revertBitValue(number, 5));
	assertEquals(0x3ab7f4, BitOperations.revertBitValue(number, 0));
	assertEquals(0x3ab7e5, BitOperations.revertBitValue(number, 4));
	assertEquals(0x3ab7d5, BitOperations.revertBitValue(number, 5));
	assertEquals(0x3ab7f1, BitOperations.revertBitValue(number, 2));
	assertEquals(0x2ab7f5, BitOperations.revertBitValue(number, 20));
}


@Test
@Disabled
void digitsNumberTest() {
	long number = 456322;
	assertEquals(6, Numbers.getNdigits(456322));
	
}
	
	
	

@Test
@Disabled
void leadingZerosTest() {
	long number = 17;
	assertEquals(59, BitOperations.leadingZeros(number));
}


@Test
@Disabled
void onesInNumberTest() {
	long number = 17;
	assertEquals(2, BitOperations.onesInNumber(number));

}


@Test
@Disaled
void isHappyNumberTest() {
	int expectedTrue = 123321;
	int expectedFalse = 123467;
	assertTrue (Numbers.isHappyNumber(expectedTrue));
	assertFalse (Numbers.isHappyNumber(expectedFalse));

	
}

@Test
void getDigitsTest() {
	int expected[] = {1, 2, 3, 4, 6};
	assertArrayEquals(expected, Numbers.getDigits(12346));
}


@Test
void getNumberFromDigitsTest () {
	int expectedNumber = 1234;
	assertEquals(expectedNumber, Numbers.getNumberFromDigits(new int[] {1,2,3,4}));
}



@Test
void verifyTest () {
	boolean expectedNumber = true;
	assertEquals(expectedNumber, IsraelIdentity.verify(346816788));
}


@Test
@Disabled
void generateRandomIdTest () {
	int expectedNumber = 123456782;
	assertEquals(expectedNumber, IsraelIdentity.generateRandomId(123456782));

	}

@Test
@Disabled
void addsNumberTest () {
	 int [] array = {3, 2, 4543, 123123, 0};
	 assertArrayEquals (new int []{3, 2, 4543, 123123, 0, 22}, MyArrays.addsNumber(array, 22));
}
	 

@Test
@Disabled
void removeNumberTest () {
	 int [] array = {3, 2, 5, 4, 6, 3, 456743,  455345, 3342, 2223};
	 assertArrayEquals (new int []{3, 2, 5, 4, 6, 3, 456743, 3342, 2223}, MyArrays.removeNumber(array, 7));
}
@Test
@Disabled
void searchSameFirstElem () {
	//System.out.println(MyArrays.binarySearch(new int[] {1,3,3,5,5,9,10}, 9));
	System.out.println (MyArrays.bubbleSort(new int[] {1,3, 8, 2, 9, 3, 6, 4, 4, 2, 4, 7, 8, 10, 8}));
}

@Test

void isSum2Test() {
	short sum = 6;
	short [] array = {3, 2, 5, 1, 6};
	//short [] expected = {3, 2, 5, -3, 4, 6, 3, 0, 1};
	assertEquals (true, MyArrays.isSum2(new short[] {2, 0, 1, 6, 3}, sum));
	assertEquals (false, MyArrays.isSum2(new short[] {2, 9, 5, 0}, sum));
}

@Test
@Disabled
void getDifValueTest() {
	short sum = 10;
	short [] arrayForDif = {2, 9, 8, 1, 6, 3};
	short expected[] = {8, 1, 2, 9, 4, 7};
	assertArrayEquals(expected, MyArrays.getDifValue(arrayForDif, sum));
	

}
}












	