package lab4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.MyBigNumber;

public class TestDivBigNumber {

	@Test
	public void test() {
		assertArrayEquals(MyBigNumber.div("51379","36"), new String[]{"1427","7"});
		assertArrayEquals(MyBigNumber.div("487888824249827","49168"), new String[]{"9922893431","34419"});
		assertArrayEquals(MyBigNumber.div("157368","934872671"), new String[]{"0","157368"});
		assertArrayEquals(MyBigNumber.div("1826263223","2881"), new String[]{"633899","204"});
		assertArrayEquals(MyBigNumber.div("5942385","67218"), new String[]{"88","27201"});
		assertArrayEquals(MyBigNumber.div("493146198","1361489"), new String[]{"362","287180"});
		assertArrayEquals(MyBigNumber.div("832171","1878"), new String[]{"443","217"});	
		assertArrayEquals(MyBigNumber.div("7661822348513","91434"), new String[]{"83796206","49109"});
		assertArrayEquals(MyBigNumber.div("95741273634126","279147"), new String[]{"342977978","9360"});
		assertArrayEquals(MyBigNumber.div("46332","268673419"), new String[]{"0","46332"});
		assertArrayEquals(MyBigNumber.div("3879769417498","13422"), new String[]{"289060454","3910"});
		assertArrayEquals(MyBigNumber.div("5254774","191366"), new String[]{"27","87892"});
		assertArrayEquals(MyBigNumber.div("837456529482","82"), new String[]{"10212884505","72"});
		assertArrayEquals(MyBigNumber.div("3979789423","335751"), new String[]{"11853","132820"});
	}
	@Test
	public void testMini() {
		assertArrayEquals(MyBigNumber.div("66","3"), new String[]{"22","0"});
		assertArrayEquals(MyBigNumber.div("44","36"), new String[]{"1","8"});
		assertArrayEquals(MyBigNumber.div("378","8"), new String[]{"47","2"});
		assertArrayEquals(MyBigNumber.div("63","18"), new String[]{"3","9"});
		assertArrayEquals(MyBigNumber.div("89","7"), new String[]{"12","5"});
		assertArrayEquals(MyBigNumber.div("21","92"), new String[]{"0","21"});
		assertArrayEquals(MyBigNumber.div("84","58"), new String[]{"1","26"});
		assertArrayEquals(MyBigNumber.div("671","7"), new String[]{"95","6"});
		assertArrayEquals(MyBigNumber.div("35","81"), new String[]{"0","35"});
		assertArrayEquals(MyBigNumber.div("372","5"), new String[]{"74","2"});
		assertArrayEquals(MyBigNumber.div("131","68"), new String[]{"1","63"});
		assertArrayEquals(MyBigNumber.div("333","86"), new String[]{"3","75"});
		assertArrayEquals(MyBigNumber.div("482","5"), new String[]{"96","2"});
		assertArrayEquals(MyBigNumber.div("33","38"), new String[]{"0","33"});
		assertArrayEquals(MyBigNumber.div("33","37"), new String[]{"0","33"});
		assertArrayEquals(MyBigNumber.div("145","21"), new String[]{"6","19"});
		assertArrayEquals(MyBigNumber.div("148","1"), new String[]{"148","0"});
		assertArrayEquals(MyBigNumber.div("96","35"), new String[]{"2","26"});
		assertArrayEquals(MyBigNumber.div("437","58"), new String[]{"7","31"});
		assertArrayEquals(MyBigNumber.div("968","23"), new String[]{"42","2"});
		assertArrayEquals(MyBigNumber.div("41","57"), new String[]{"0","41"});
		assertArrayEquals(MyBigNumber.div("663","4"), new String[]{"165","3"});
		assertArrayEquals(MyBigNumber.div("73","3"), new String[]{"24","1"});
		assertArrayEquals(MyBigNumber.div("825","73"), new String[]{"11","22"});
		assertArrayEquals(MyBigNumber.div("898","1"), new String[]{"898","0"});
		assertArrayEquals(MyBigNumber.div("965","1"), new String[]{"965","0"});
		assertArrayEquals(MyBigNumber.div("681","58"), new String[]{"11","43"});
		assertArrayEquals(MyBigNumber.div("85","84"), new String[]{"1","1"});
		assertArrayEquals(MyBigNumber.div("98","9"), new String[]{"10","8"});
		assertArrayEquals(MyBigNumber.div("94","9"), new String[]{"10","4"});

	}
	@Test
	public void bug() {
		
	}
	

}
