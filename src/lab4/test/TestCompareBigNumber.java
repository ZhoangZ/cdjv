package lab4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.MyBigNumber;

public class TestCompareBigNumber {

	@Test
	public void tesPlus() {
		assertEquals(MyBigNumber.compare("91", "91"), 0);
		assertEquals(MyBigNumber.compare("091", "91"), 0);
		assertEquals(MyBigNumber.compare("910", "91"), 1);
		assertEquals(MyBigNumber.compare("910", "991"), -1);
		
	
	}

}
