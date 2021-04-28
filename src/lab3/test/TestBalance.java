package lab3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab3.Balance;

public class TestBalance {
	@Test
	public void testError() throws Exception {
		String input="5 6 + 8";
		Balance balance= new Balance(input);		
		assertThrows(Exception.class, ()->{
			balance.compute();
		});
		
	}
	@Test
	public void testTestCase1() throws Exception {
		String input="5 6 + 8 *";
		Balance balance= new Balance(input);
		assertEquals(88, balance.compute());		
	}
	@Test
	public void testTestCase2() throws Exception{
		String input="4 8 + 10 2 - * 4 /";
		Balance balance= new Balance(input);
		assertEquals(24, balance.compute());		
	}
	@Test
	public void testTestCase3()throws Exception {
		String input="1 2 + 3 -";
		Balance balance= new Balance(input);
		assertEquals(0, balance.compute());		
	}
	@Test
	public void testComputePlus2()throws Exception {
		String input="2 1 + 1 +";
		Balance balance= new Balance(input);
		assertEquals(4, balance.compute());		
	}
	@Test
	public void testComputePlus() throws Exception{
		String input="2 1 +";
		Balance balance= new Balance(input);
		assertEquals(3, balance.compute());		
	}
	@Test
	public void testComputeMinus()throws Exception {
		String input="2 1 -";
		Balance balance= new Balance(input);
		assertEquals(1, balance.compute());		
	}

	@Test
	public void testComputeNumber()throws Exception {
		String input="2";
		Balance balance= new Balance(input);
		assertEquals(2, balance.compute());		
	}

	

}
