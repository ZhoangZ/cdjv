package tuan1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tuan1.DateEncode;

public class TestDateEncode {
	

	@Test
	public void testEncode1() {
		assertEquals(1024033, DateEncode.encodeDate(1, 1, 2000));
	}
	@Test
	public void testDecode1() {
		assertEquals("Year: 2000, month: 1, day: 1", DateEncode.decodeDate(1024033));
	}

	@Test
	public void testEncode2() {		
		assertEquals(1024063, DateEncode.encodeDate(31, 1, 2000));
	}
	
	@Test
	public void testDecode2() {
		assertEquals("Year: 2000, month: 1, day: 31", DateEncode.decodeDate(1024063));
	}


	@Test
	public void testDecode3() {
		assertEquals("Year: 2000, month: 12, day: 31", DateEncode.decodeDate(1024415));
	}

	@Test
	public void testEncode3() {
		assertEquals(1024415, DateEncode.encodeDate(31, 12, 2000));
	}
	
	@Test
	public void testDecode() {
		//System.out.println(DateEncode.decodeDate(1024415));
		
	}

	@Test
	public void testEncode() {
		//System.out.println(DateEncode.encodeDate(31, 12, 2000));
		
	}
}
