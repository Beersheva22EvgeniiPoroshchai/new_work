import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ObjectTests {

	@Test
	@Disabled
	void wrapperTest(){
		Integer a = 11;
		a.equals(a);
		Integer b = 12;
		//assertEquals(a, b);
		Integer c = 202;
		Integer d = 202;
		//assertEquals(c, d);
		Integer e = 129;
		Integer f = 128;
		assertTrue(a < b && b > a);
		assertFalse (c == d);
		assertTrue (e >= f);
		assertTrue(c.equals(d));
		
	}
	@Test
	@Disabled
	void stringTest() {
		String hello = "hello";
		System.out.println(hello);
		char[] helloAr = hello.toCharArray();
		System.out.println(helloAr);
		assertEquals('l', helloAr[2]);
		System.out.println((byte)helloAr[4]);
		assertEquals(5, hello.length());
		
	}
	
	@Test
	@Disabled
	void isAnagramTest() {
	assertTrue(Strings.isAnagram("yellow", "loweyl"));
	assertTrue(Strings.isAnagram("yellow", "elolyw"));
	assertTrue(Strings.isAnagram("yellow", "wolley"));
	assertTrue(Strings.isAnagram("yellow", "loleyw"));
	assertFalse(Strings.isAnagram("yellow",""));
	assertFalse(Strings.isAnagram("yellow", "yellob"));
	assertFalse(Strings.isAnagram("yellow","yello"));
	assertFalse(Strings.isAnagram("yellow","yelllo"));
	assertTrue(Strings.isAnagram("yellow","yellow"));
	
	
	}
	
	
	@Test
	@Disabled
	void sortStringNumbersTest() {
		String [] strArray = 	{"55","0", "5", "-5", "-117", "-9","-9", "47", "60","1","1","0"};
		String [] forNum = {"-117", "-9", "-9", "-5", "0", "0", "1", "1", "5", "47", "55", "60" };
		Strings.sortStringNumbers(strArray);
		for (int i =0; i<strArray.length; i++) {
		
		
		assertEquals(strArray[i], forNum[i]);

	}
		
		
		
		@Test
		@Disabled
		void javaVariableTest() {
			
			assertTrue("java".matches(Strings.javaNameExp()));
			assertFalse("1java".matches(Strings.javaNameExp()));
			assertFalse("_".matches(Strings.javaNameExp()));
			assertTrue("__".matches(Strings.javaNameExp()));
			assertTrue("java_1_2".matches(Strings.javaNameExp()));
			assertTrue("$".matches(Strings.javaNameExp()));
			assertFalse("$ _".matches(Strings.javaNameExp()));
			
			}
	
	
		@Test
		void ipV4OctetTest() {
			
			assertTrue("196".matches(Strings.ipV4Octet()));
			assertTrue("249".matches(Strings.ipV4Octet()));
            assertTrue("009".matches(Strings.ipV4Octet()));
			assertTrue("058".matches(Strings.ipV4Octet()));
			assertTrue("255".matches(Strings.ipV4Octet()));
			assertTrue("179".matches(Strings.ipV4Octet()));
			assertTrue("093".matches(Strings.ipV4Octet()));
			assertFalse("384".matches(Strings.ipV4Octet()));
			assertFalse("621".matches(Strings.ipV4Octet()));
			assertFalse("267".matches(Strings.ipV4Octet()));
			assertFalse("256".matches(Strings.ipV4Octet()));
			}
	
		@Test
		void ipV4Test() {
			
			assertTrue("255.255.255.158".matches(Strings.ipV4()));
			assertTrue("136.202.235.002".matches(Strings.ipV4()));
			assertTrue("255.255.000.117".matches(Strings.ipV4()));
			assertTrue("179.196.090.235".matches(Strings.ipV4()));
			assertTrue("093.100.000.010".matches(Strings.ipV4()));
			assertFalse("384.255.000.111".matches(Strings.ipV4()));
			assertFalse("010.621.231.006".matches(Strings.ipV4()));
			assertFalse("202.255.259.255".matches(Strings.ipV4()));
			assertFalse("020.212.100.791.".matches(Strings.ipV4()));
			}
	
	
	}