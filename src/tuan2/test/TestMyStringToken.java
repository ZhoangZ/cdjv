package tuan2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tuan2.MyStringToken;

public class TestMyStringToken {
	@Test
	public void test106() {
		MyStringToken myStringToken = new MyStringToken("Trường đại học Nông Lâm", "[Tm]");
		System.out.println("Count Token: "+myStringToken.countToken());
		while(myStringToken.nextToken()) {
			System.out.println("Token: "+myStringToken.token());
		}
//		assertEquals(3, myStringToken.countToken());
//		assertTrue(myStringToken.nextToken());
//		assertEquals("12", myStringToken.token());
//		assertTrue(myStringToken.nextToken());
//		assertEquals("", myStringToken.token());
//		assertTrue(myStringToken.nextToken());
//		assertEquals("3", myStringToken.token());
//		assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testDeliLimitHalveInput() {
		MyStringToken myStringToken = new MyStringToken("--", "-");
		assertEquals(1, myStringToken.countToken());
		//assertTrue(myStringToken.nextToken());		
		assertEquals("", myStringToken.token());		
		assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testToltal() {
		MyStringToken myStringToken = new MyStringToken("-12--3", "-");
		assertEquals(3, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("12", myStringToken.token());
		assertTrue(myStringToken.nextToken());
		assertEquals("", myStringToken.token());
		assertTrue(myStringToken.nextToken());
		assertEquals("3", myStringToken.token());
		assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testDeliLimitCharStartInput() {
		MyStringToken myStringToken = new MyStringToken("-123", "-");
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("123", myStringToken.token());
		//assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testDeliLimitRexStartInput() {
		MyStringToken myStringToken = new MyStringToken("-123", "[-]");
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("123", myStringToken.token());
		//assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testDeliLimitRexEqualInput() {
		MyStringToken myStringToken = new MyStringToken("-", "[-]");
		assertEquals(0, myStringToken.countToken());
		
	}
	@Test
	public void testDeliLimitCharEqualInput() {
		MyStringToken myStringToken = new MyStringToken("-", "-");
		assertEquals(0, myStringToken.countToken());
		
	}
	@Test
	public void testDeliLimitCharAtEndInput() {
		MyStringToken myStringToken = new MyStringToken("123-", "-");
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("123", myStringToken.token());
		assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testDeliLimitRexAtEndInput() {
		MyStringToken myStringToken = new MyStringToken("123-", "[.-]");
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("123", myStringToken.token());
		assertFalse(myStringToken.nextToken());
	}
	@Test
	public void testDeliLimitStringAtEndInput() {
		MyStringToken myStringToken = new MyStringToken("123--", "--");
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("123", myStringToken.token());
		assertFalse(myStringToken.nextToken());
	}


	@Test
	public void testMyStringToken() {
		MyStringToken myStringToken = new MyStringToken("0-1234-567", "-");
		assertEquals(3, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("0", myStringToken.token());
		assertEquals(2, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("1234", myStringToken.token());
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("567", myStringToken.token());
		assertEquals(0, myStringToken.countToken());
		assertFalse(myStringToken.nextToken());
	}

	@Test
	public void testMyStringToken2() {
		MyStringToken myStringToken = new MyStringToken("0--1234--567", "--");
		assertEquals(3, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("0", myStringToken.token());
		assertEquals(2, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("1234", myStringToken.token());
		assertEquals(1, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("567", myStringToken.token());
		assertEquals(0, myStringToken.countToken());
		assertFalse(myStringToken.nextToken());
	}

	@Test
	public void testMyStringToken3() {
		MyStringToken myStringToken = new MyStringToken("0-1.2+3", "[-.+]");
		// System.out.println(myStringToken.countToken());
		assertEquals(4, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("0", myStringToken.token());
		assertEquals(3, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("1", myStringToken.token());
		assertEquals(2, myStringToken.countToken());
		assertTrue(myStringToken.nextToken());
		assertEquals("2", myStringToken.token());
		assertTrue(myStringToken.nextToken());
		assertEquals("3", myStringToken.token());
		assertEquals(0, myStringToken.countToken());
		assertFalse(myStringToken.nextToken());
	}

	@Test
	public void testNextToken() {
		MyStringToken myStringToken = new MyStringToken("123", "2");
		assertTrue(myStringToken.nextToken());
	}

	@Test
	public void testToken() {
		MyStringToken myStringToken = new MyStringToken("123", "2");
		assertEquals("1", myStringToken.token());
		assertEquals("3", myStringToken.token());
		assertEquals(null, myStringToken.token());
		assertEquals(null, myStringToken.token());
	}

	@Test
	public void testToken2() {
		MyStringToken myStringToken = new MyStringToken("0--1234--567", "--");
		assertEquals("0", myStringToken.token());
		assertEquals("1234", myStringToken.token());
		assertEquals("567", myStringToken.token());
		assertEquals(null, myStringToken.token());
	}

	@Test
	public void testMatch() {
		assertTrue(MyStringToken.match("123", "1", 0));
		assertTrue(MyStringToken.match("123", "2", 1));
		assertTrue(MyStringToken.match("123", "3", 2));
		assertFalse(MyStringToken.match("123", "2", 2));
		assertTrue(MyStringToken.match("1234", "34", 2));
		assertFalse(MyStringToken.match("1234", "345", 2));
		assertFalse(MyStringToken.match("0--1234--567", "--", 9));
	}

}
