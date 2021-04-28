package lab3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab3.StringEncode;
public class TestStringEncode {
	@Test
	public void test() {
		String input="toi di hoc";
		int password=123;
		StringEncode stringEncode= new StringEncode(input, password);
		
		assertEquals("*tioid  oh  c*", stringEncode.encode());
		
	}
	@Test
	public void testCase1() {
		String input="truong dai hoc nong lam tphcm";
		int password=1234;
		StringEncode stringEncode= new StringEncode(input, password);
		assertEquals("*turgnoiad  ohn c gnolmapt  mch*", stringEncode.encode());
	}
	@Test
	public void testCase2() {
		String input="phuong linh trung quan thu duc";
		int password=1452;
		StringEncode stringEncode= new StringEncode(input, password);
		assertEquals("*pnouhnil g htgnurnauq t hud u    c*", stringEncode.encode());
	}
	@Test
	public void testCase3() {
		String input="mot ngay dep troi";
		int password=164;
		StringEncode stringEncode= new StringEncode(input, password);
		assertEquals("*magn toed yp iort *", stringEncode.encode());
	}
	@Test
	public void testNext() {
		String input="to";
		int password=12;
		StringEncode stringEncode= new StringEncode(input, password);
		
		assertEquals(1, stringEncode.nextPasswordInt());
		assertEquals(2, stringEncode.nextPasswordInt());
		assertEquals(1, stringEncode.nextPasswordInt());
		assertEquals('t', stringEncode.nextInputChar());
		assertEquals('o', stringEncode.nextInputChar());
		assertEquals(' ', stringEncode.nextInputChar());
	}

}
