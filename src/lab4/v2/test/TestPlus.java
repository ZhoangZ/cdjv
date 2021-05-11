package lab4.v2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.v2.MyBigNumber;

public class TestPlus {

	@Test
	public void test() {
		MyBigNumber bigNumber = new MyBigNumber("12");
		MyBigNumber rs = bigNumber.plus(new MyBigNumber("13"));
		assertEquals(rs.toString(), "25");
		
	}
	@Test
	public void auto() {
	////Declare
		MyBigNumber bigNumber = null;
		MyBigNumber rs = null;
		////End Declare
		////Start UseCase
		bigNumber = new MyBigNumber("142");
		rs = bigNumber.plus(new MyBigNumber("66"));
		assertEquals(rs.toString(), "208");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("661");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "669");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("19");
		rs = bigNumber.plus(new MyBigNumber("82"));
		assertEquals(rs.toString(), "101");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1165");
		rs = bigNumber.plus(new MyBigNumber("32"));
		assertEquals(rs.toString(), "1197");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("971");
		rs = bigNumber.plus(new MyBigNumber("2"));
		assertEquals(rs.toString(), "973");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5912");
		rs = bigNumber.plus(new MyBigNumber("54"));
		assertEquals(rs.toString(), "5966");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("13365");
		rs = bigNumber.plus(new MyBigNumber("42"));
		assertEquals(rs.toString(), "13407");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7751");
		rs = bigNumber.plus(new MyBigNumber("38"));
		assertEquals(rs.toString(), "7789");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7638");
		rs = bigNumber.plus(new MyBigNumber("66"));
		assertEquals(rs.toString(), "7704");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("799");
		rs = bigNumber.plus(new MyBigNumber("94"));
		assertEquals(rs.toString(), "893");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("566");
		rs = bigNumber.plus(new MyBigNumber("87"));
		assertEquals(rs.toString(), "653");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("317");
		rs = bigNumber.plus(new MyBigNumber("3"));
		assertEquals(rs.toString(), "320");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("81");
		rs = bigNumber.plus(new MyBigNumber("14"));
		assertEquals(rs.toString(), "95");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "48");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("79");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "87");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("53827");
		rs = bigNumber.plus(new MyBigNumber("11"));
		assertEquals(rs.toString(), "53838");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("22787");
		rs = bigNumber.plus(new MyBigNumber("3"));
		assertEquals(rs.toString(), "22790");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4344");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "4348");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9352");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "9360");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("12599");
		rs = bigNumber.plus(new MyBigNumber("14"));
		assertEquals(rs.toString(), "12613");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("873");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "881");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("17");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "21");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("846");
		rs = bigNumber.plus(new MyBigNumber("3"));
		assertEquals(rs.toString(), "849");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("73");
		rs = bigNumber.plus(new MyBigNumber("56"));
		assertEquals(rs.toString(), "129");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1246");
		rs = bigNumber.plus(new MyBigNumber("83"));
		assertEquals(rs.toString(), "1329");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8522");
		rs = bigNumber.plus(new MyBigNumber("7"));
		assertEquals(rs.toString(), "8529");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5284");
		rs = bigNumber.plus(new MyBigNumber("67"));
		assertEquals(rs.toString(), "5351");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("434");
		rs = bigNumber.plus(new MyBigNumber("47"));
		assertEquals(rs.toString(), "481");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("56");
		rs = bigNumber.plus(new MyBigNumber("26"));
		assertEquals(rs.toString(), "82");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1621");
		rs = bigNumber.plus(new MyBigNumber("6"));
		assertEquals(rs.toString(), "1627");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("76");
		rs = bigNumber.plus(new MyBigNumber("5"));
		assertEquals(rs.toString(), "81");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("962");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "971");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("58521");
		rs = bigNumber.plus(new MyBigNumber("75"));
		assertEquals(rs.toString(), "58596");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5237");
		rs = bigNumber.plus(new MyBigNumber("7"));
		assertEquals(rs.toString(), "5244");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("939");
		rs = bigNumber.plus(new MyBigNumber("52"));
		assertEquals(rs.toString(), "991");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("38");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "46");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("194");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "198");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8979");
		rs = bigNumber.plus(new MyBigNumber("69"));
		assertEquals(rs.toString(), "9048");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8418");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "8426");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("25357");
		rs = bigNumber.plus(new MyBigNumber("2"));
		assertEquals(rs.toString(), "25359");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("319");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "323");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("82252");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "82256");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("274");
		rs = bigNumber.plus(new MyBigNumber("8"));
		assertEquals(rs.toString(), "282");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("697");
		rs = bigNumber.plus(new MyBigNumber("61"));
		assertEquals(rs.toString(), "758");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4169");
		rs = bigNumber.plus(new MyBigNumber("64"));
		assertEquals(rs.toString(), "4233");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5719");
		rs = bigNumber.plus(new MyBigNumber("93"));
		assertEquals(rs.toString(), "5812");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("98");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "102");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5879");
		rs = bigNumber.plus(new MyBigNumber("64"));
		assertEquals(rs.toString(), "5943");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("74395");
		rs = bigNumber.plus(new MyBigNumber("59"));
		assertEquals(rs.toString(), "74454");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7289");
		rs = bigNumber.plus(new MyBigNumber("43"));
		assertEquals(rs.toString(), "7332");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("38959");
		rs = bigNumber.plus(new MyBigNumber("45"));
		assertEquals(rs.toString(), "39004");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("97");
		rs = bigNumber.plus(new MyBigNumber("27"));
		assertEquals(rs.toString(), "124");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("881");
		rs = bigNumber.plus(new MyBigNumber("7"));
		assertEquals(rs.toString(), "888");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("34635");
		rs = bigNumber.plus(new MyBigNumber("28"));
		assertEquals(rs.toString(), "34663");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("88828");
		rs = bigNumber.plus(new MyBigNumber("6"));
		assertEquals(rs.toString(), "88834");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5138");
		rs = bigNumber.plus(new MyBigNumber("37"));
		assertEquals(rs.toString(), "5175");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("58");
		rs = bigNumber.plus(new MyBigNumber("67"));
		assertEquals(rs.toString(), "125");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("84");
		rs = bigNumber.plus(new MyBigNumber("2"));
		assertEquals(rs.toString(), "86");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("934");
		rs = bigNumber.plus(new MyBigNumber("27"));
		assertEquals(rs.toString(), "961");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("27");
		rs = bigNumber.plus(new MyBigNumber("55"));
		assertEquals(rs.toString(), "82");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("14261");
		rs = bigNumber.plus(new MyBigNumber("45"));
		assertEquals(rs.toString(), "14306");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("53697");
		rs = bigNumber.plus(new MyBigNumber("57"));
		assertEquals(rs.toString(), "53754");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("159");
		rs = bigNumber.plus(new MyBigNumber("27"));
		assertEquals(rs.toString(), "186");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("11");
		rs = bigNumber.plus(new MyBigNumber("89"));
		assertEquals(rs.toString(), "100");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3894");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "3903");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("957");
		rs = bigNumber.plus(new MyBigNumber("62"));
		assertEquals(rs.toString(), "1019");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("15");
		rs = bigNumber.plus(new MyBigNumber("6"));
		assertEquals(rs.toString(), "21");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("75249");
		rs = bigNumber.plus(new MyBigNumber("26"));
		assertEquals(rs.toString(), "75275");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3235");
		rs = bigNumber.plus(new MyBigNumber("33"));
		assertEquals(rs.toString(), "3268");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("71952");
		rs = bigNumber.plus(new MyBigNumber("13"));
		assertEquals(rs.toString(), "71965");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9784");
		rs = bigNumber.plus(new MyBigNumber("71"));
		assertEquals(rs.toString(), "9855");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("82815");
		rs = bigNumber.plus(new MyBigNumber("38"));
		assertEquals(rs.toString(), "82853");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1973");
		rs = bigNumber.plus(new MyBigNumber("3"));
		assertEquals(rs.toString(), "1976");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4765");
		rs = bigNumber.plus(new MyBigNumber("1"));
		assertEquals(rs.toString(), "4766");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("835");
		rs = bigNumber.plus(new MyBigNumber("5"));
		assertEquals(rs.toString(), "840");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6461");
		rs = bigNumber.plus(new MyBigNumber("92"));
		assertEquals(rs.toString(), "6553");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("312");
		rs = bigNumber.plus(new MyBigNumber("23"));
		assertEquals(rs.toString(), "335");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2355");
		rs = bigNumber.plus(new MyBigNumber("62"));
		assertEquals(rs.toString(), "2417");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("59234");
		rs = bigNumber.plus(new MyBigNumber("3"));
		assertEquals(rs.toString(), "59237");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("28992");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "29001");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("32255");
		rs = bigNumber.plus(new MyBigNumber("6"));
		assertEquals(rs.toString(), "32261");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("936");
		rs = bigNumber.plus(new MyBigNumber("3"));
		assertEquals(rs.toString(), "939");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("712");
		rs = bigNumber.plus(new MyBigNumber("5"));
		assertEquals(rs.toString(), "717");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9496");
		rs = bigNumber.plus(new MyBigNumber("96"));
		assertEquals(rs.toString(), "9592");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3594");
		rs = bigNumber.plus(new MyBigNumber("5"));
		assertEquals(rs.toString(), "3599");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("78793");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "78802");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8662");
		rs = bigNumber.plus(new MyBigNumber("4"));
		assertEquals(rs.toString(), "8666");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("16");
		rs = bigNumber.plus(new MyBigNumber("95"));
		assertEquals(rs.toString(), "111");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("13538");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "13547");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("24227");
		rs = bigNumber.plus(new MyBigNumber("95"));
		assertEquals(rs.toString(), "24322");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("927");
		rs = bigNumber.plus(new MyBigNumber("1"));
		assertEquals(rs.toString(), "928");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("66617");
		rs = bigNumber.plus(new MyBigNumber("96"));
		assertEquals(rs.toString(), "66713");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("397");
		rs = bigNumber.plus(new MyBigNumber("32"));
		assertEquals(rs.toString(), "429");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("198");
		rs = bigNumber.plus(new MyBigNumber("89"));
		assertEquals(rs.toString(), "287");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8945");
		rs = bigNumber.plus(new MyBigNumber("53"));
		assertEquals(rs.toString(), "8998");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("81");
		rs = bigNumber.plus(new MyBigNumber("7"));
		assertEquals(rs.toString(), "88");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("35144");
		rs = bigNumber.plus(new MyBigNumber("7"));
		assertEquals(rs.toString(), "35151");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("399");
		rs = bigNumber.plus(new MyBigNumber("2"));
		assertEquals(rs.toString(), "401");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("63");
		rs = bigNumber.plus(new MyBigNumber("45"));
		assertEquals(rs.toString(), "108");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6879");
		rs = bigNumber.plus(new MyBigNumber("9"));
		assertEquals(rs.toString(), "6888");
		////End UseCase


		
	}

}
