package lab4.v2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.v2.MyBigNumber;

public class TestSub {

	@Test
	public void test() {
		////Declare
		MyBigNumber bigNumber = null;
		MyBigNumber rs = null;
		////End Declare
		////Start UseCase
		bigNumber = new MyBigNumber("13");
		rs = bigNumber.sub(new MyBigNumber("12"));
		assertEquals(rs.toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("12");
		rs = bigNumber.sub(new MyBigNumber("13"));
		assertEquals(rs.toString(), "-1");
		////End UseCase
		
	}
	@Test
	public void auto() {
	////Declare
		MyBigNumber bigNumber = null;
		MyBigNumber rs = null;
		////End Declare
		////Start UseCase
		bigNumber = new MyBigNumber("95297");
		rs = bigNumber.sub(new MyBigNumber("94"));
		assertEquals(rs.toString(), "95203");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2549");
		rs = bigNumber.sub(new MyBigNumber("23"));
		assertEquals(rs.toString(), "2526");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("52397");
		rs = bigNumber.sub(new MyBigNumber("5"));
		assertEquals(rs.toString(), "52392");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("534");
		rs = bigNumber.sub(new MyBigNumber("47"));
		assertEquals(rs.toString(), "487");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("64532");
		rs = bigNumber.sub(new MyBigNumber("37"));
		assertEquals(rs.toString(), "64495");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("61");
		rs = bigNumber.sub(new MyBigNumber("77"));
		assertEquals(rs.toString(), "-16");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39");
		rs = bigNumber.sub(new MyBigNumber("3"));
		assertEquals(rs.toString(), "36");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("74731");
		rs = bigNumber.sub(new MyBigNumber("4"));
		assertEquals(rs.toString(), "74727");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("728");
		rs = bigNumber.sub(new MyBigNumber("45"));
		assertEquals(rs.toString(), "683");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9222");
		rs = bigNumber.sub(new MyBigNumber("3"));
		assertEquals(rs.toString(), "9219");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("38");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "32");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("49721");
		rs = bigNumber.sub(new MyBigNumber("29"));
		assertEquals(rs.toString(), "49692");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("76");
		rs = bigNumber.sub(new MyBigNumber("72"));
		assertEquals(rs.toString(), "4");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("939");
		rs = bigNumber.sub(new MyBigNumber("45"));
		assertEquals(rs.toString(), "894");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("328");
		rs = bigNumber.sub(new MyBigNumber("87"));
		assertEquals(rs.toString(), "241");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("35157");
		rs = bigNumber.sub(new MyBigNumber("83"));
		assertEquals(rs.toString(), "35074");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2955");
		rs = bigNumber.sub(new MyBigNumber("16"));
		assertEquals(rs.toString(), "2939");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("25886");
		rs = bigNumber.sub(new MyBigNumber("57"));
		assertEquals(rs.toString(), "25829");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("48636");
		rs = bigNumber.sub(new MyBigNumber("25"));
		assertEquals(rs.toString(), "48611");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7524");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "7523");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("247");
		rs = bigNumber.sub(new MyBigNumber("25"));
		assertEquals(rs.toString(), "222");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("237");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "231");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("526");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "525");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("584");
		rs = bigNumber.sub(new MyBigNumber("62"));
		assertEquals(rs.toString(), "522");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9548");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "9542");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("748");
		rs = bigNumber.sub(new MyBigNumber("31"));
		assertEquals(rs.toString(), "717");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("23");
		rs = bigNumber.sub(new MyBigNumber("7"));
		assertEquals(rs.toString(), "16");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("946");
		rs = bigNumber.sub(new MyBigNumber("19"));
		assertEquals(rs.toString(), "927");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("26");
		rs = bigNumber.sub(new MyBigNumber("4"));
		assertEquals(rs.toString(), "22");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("83823");
		rs = bigNumber.sub(new MyBigNumber("29"));
		assertEquals(rs.toString(), "83794");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6817");
		rs = bigNumber.sub(new MyBigNumber("58"));
		assertEquals(rs.toString(), "6759");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4291");
		rs = bigNumber.sub(new MyBigNumber("8"));
		assertEquals(rs.toString(), "4283");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6685");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "6679");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("749");
		rs = bigNumber.sub(new MyBigNumber("3"));
		assertEquals(rs.toString(), "746");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("18325");
		rs = bigNumber.sub(new MyBigNumber("66"));
		assertEquals(rs.toString(), "18259");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9452");
		rs = bigNumber.sub(new MyBigNumber("9"));
		assertEquals(rs.toString(), "9443");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("928");
		rs = bigNumber.sub(new MyBigNumber("74"));
		assertEquals(rs.toString(), "854");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("86");
		rs = bigNumber.sub(new MyBigNumber("56"));
		assertEquals(rs.toString(), "30");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("73133");
		rs = bigNumber.sub(new MyBigNumber("98"));
		assertEquals(rs.toString(), "73035");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("244");
		rs = bigNumber.sub(new MyBigNumber("7"));
		assertEquals(rs.toString(), "237");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("31944");
		rs = bigNumber.sub(new MyBigNumber("5"));
		assertEquals(rs.toString(), "31939");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3261");
		rs = bigNumber.sub(new MyBigNumber("73"));
		assertEquals(rs.toString(), "3188");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("172");
		rs = bigNumber.sub(new MyBigNumber("35"));
		assertEquals(rs.toString(), "137");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("87177");
		rs = bigNumber.sub(new MyBigNumber("3"));
		assertEquals(rs.toString(), "87174");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("516");
		rs = bigNumber.sub(new MyBigNumber("11"));
		assertEquals(rs.toString(), "505");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("891");
		rs = bigNumber.sub(new MyBigNumber("75"));
		assertEquals(rs.toString(), "816");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("37894");
		rs = bigNumber.sub(new MyBigNumber("22"));
		assertEquals(rs.toString(), "37872");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("34");
		rs = bigNumber.sub(new MyBigNumber("8"));
		assertEquals(rs.toString(), "26");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("61327");
		rs = bigNumber.sub(new MyBigNumber("73"));
		assertEquals(rs.toString(), "61254");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9217");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "9211");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("271");
		rs = bigNumber.sub(new MyBigNumber("7"));
		assertEquals(rs.toString(), "264");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9652");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "9651");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("18");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "17");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2147");
		rs = bigNumber.sub(new MyBigNumber("86"));
		assertEquals(rs.toString(), "2061");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5616");
		rs = bigNumber.sub(new MyBigNumber("38"));
		assertEquals(rs.toString(), "5578");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2997");
		rs = bigNumber.sub(new MyBigNumber("93"));
		assertEquals(rs.toString(), "2904");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("544");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "538");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1655");
		rs = bigNumber.sub(new MyBigNumber("25"));
		assertEquals(rs.toString(), "1630");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("979");
		rs = bigNumber.sub(new MyBigNumber("9"));
		assertEquals(rs.toString(), "970");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("835");
		rs = bigNumber.sub(new MyBigNumber("5"));
		assertEquals(rs.toString(), "830");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("59492");
		rs = bigNumber.sub(new MyBigNumber("42"));
		assertEquals(rs.toString(), "59450");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8435");
		rs = bigNumber.sub(new MyBigNumber("26"));
		assertEquals(rs.toString(), "8409");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7874");
		rs = bigNumber.sub(new MyBigNumber("9"));
		assertEquals(rs.toString(), "7865");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("48332");
		rs = bigNumber.sub(new MyBigNumber("71"));
		assertEquals(rs.toString(), "48261");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6643");
		rs = bigNumber.sub(new MyBigNumber("69"));
		assertEquals(rs.toString(), "6574");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4668");
		rs = bigNumber.sub(new MyBigNumber("8"));
		assertEquals(rs.toString(), "4660");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("11563");
		rs = bigNumber.sub(new MyBigNumber("62"));
		assertEquals(rs.toString(), "11501");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2822");
		rs = bigNumber.sub(new MyBigNumber("2"));
		assertEquals(rs.toString(), "2820");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("18611");
		rs = bigNumber.sub(new MyBigNumber("77"));
		assertEquals(rs.toString(), "18534");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9713");
		rs = bigNumber.sub(new MyBigNumber("81"));
		assertEquals(rs.toString(), "9632");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1622");
		rs = bigNumber.sub(new MyBigNumber("5"));
		assertEquals(rs.toString(), "1617");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("41");
		rs = bigNumber.sub(new MyBigNumber("32"));
		assertEquals(rs.toString(), "9");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("626");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "625");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("449");
		rs = bigNumber.sub(new MyBigNumber("9"));
		assertEquals(rs.toString(), "440");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("61");
		rs = bigNumber.sub(new MyBigNumber("84"));
		assertEquals(rs.toString(), "-23");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("452");
		rs = bigNumber.sub(new MyBigNumber("67"));
		assertEquals(rs.toString(), "385");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("36");
		rs = bigNumber.sub(new MyBigNumber("15"));
		assertEquals(rs.toString(), "21");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57");
		rs = bigNumber.sub(new MyBigNumber("4"));
		assertEquals(rs.toString(), "53");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("78");
		rs = bigNumber.sub(new MyBigNumber("32"));
		assertEquals(rs.toString(), "46");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("587");
		rs = bigNumber.sub(new MyBigNumber("11"));
		assertEquals(rs.toString(), "576");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5965");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "5964");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("52284");
		rs = bigNumber.sub(new MyBigNumber("1"));
		assertEquals(rs.toString(), "52283");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9642");
		rs = bigNumber.sub(new MyBigNumber("63"));
		assertEquals(rs.toString(), "9579");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("651");
		rs = bigNumber.sub(new MyBigNumber("66"));
		assertEquals(rs.toString(), "585");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("23886");
		rs = bigNumber.sub(new MyBigNumber("8"));
		assertEquals(rs.toString(), "23878");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4356");
		rs = bigNumber.sub(new MyBigNumber("23"));
		assertEquals(rs.toString(), "4333");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("32");
		rs = bigNumber.sub(new MyBigNumber("7"));
		assertEquals(rs.toString(), "25");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("44");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "38");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("81");
		rs = bigNumber.sub(new MyBigNumber("88"));
		assertEquals(rs.toString(), "-7");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("56");
		rs = bigNumber.sub(new MyBigNumber("61"));
		assertEquals(rs.toString(), "-5");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("383");
		rs = bigNumber.sub(new MyBigNumber("55"));
		assertEquals(rs.toString(), "328");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9698");
		rs = bigNumber.sub(new MyBigNumber("57"));
		assertEquals(rs.toString(), "9641");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("84");
		rs = bigNumber.sub(new MyBigNumber("8"));
		assertEquals(rs.toString(), "76");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("35917");
		rs = bigNumber.sub(new MyBigNumber("42"));
		assertEquals(rs.toString(), "35875");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("391");
		rs = bigNumber.sub(new MyBigNumber("63"));
		assertEquals(rs.toString(), "328");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39276");
		rs = bigNumber.sub(new MyBigNumber("7"));
		assertEquals(rs.toString(), "39269");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("33999");
		rs = bigNumber.sub(new MyBigNumber("5"));
		assertEquals(rs.toString(), "33994");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57727");
		rs = bigNumber.sub(new MyBigNumber("23"));
		assertEquals(rs.toString(), "57704");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5943");
		rs = bigNumber.sub(new MyBigNumber("7"));
		assertEquals(rs.toString(), "5936");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("89252");
		rs = bigNumber.sub(new MyBigNumber("6"));
		assertEquals(rs.toString(), "89246");
		////End UseCase




		
	}

}
