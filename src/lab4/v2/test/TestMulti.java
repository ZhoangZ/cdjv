package lab4.v2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.v2.MyBigNumber;

public class TestMulti {

	@Test
	public void test() {
		
	}
	@Test
	public void auto() {
	////Declare
		MyBigNumber bigNumber = null;
		MyBigNumber rs = null;
		////End Declare
		////Start UseCase
		bigNumber = new MyBigNumber("851");
		rs = bigNumber.multi(new MyBigNumber("83"));
		assertEquals(rs.toString(), "70633");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("44");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "176");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6765");
		rs = bigNumber.multi(new MyBigNumber("1"));
		assertEquals(rs.toString(), "6765");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4883");
		rs = bigNumber.multi(new MyBigNumber("2"));
		assertEquals(rs.toString(), "9766");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7885");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "47310");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5897");
		rs = bigNumber.multi(new MyBigNumber("77"));
		assertEquals(rs.toString(), "454069");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1355");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "5420");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("616");
		rs = bigNumber.multi(new MyBigNumber("34"));
		assertEquals(rs.toString(), "20944");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("77468");
		rs = bigNumber.multi(new MyBigNumber("2"));
		assertEquals(rs.toString(), "154936");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("621");
		rs = bigNumber.multi(new MyBigNumber("5"));
		assertEquals(rs.toString(), "3105");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("358");
		rs = bigNumber.multi(new MyBigNumber("43"));
		assertEquals(rs.toString(), "15394");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("64246");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "256984");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("65264");
		rs = bigNumber.multi(new MyBigNumber("78"));
		assertEquals(rs.toString(), "5090592");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("86716");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "346864");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("685");
		rs = bigNumber.multi(new MyBigNumber("3"));
		assertEquals(rs.toString(), "2055");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("58");
		rs = bigNumber.multi(new MyBigNumber("5"));
		assertEquals(rs.toString(), "290");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("84");
		rs = bigNumber.multi(new MyBigNumber("15"));
		assertEquals(rs.toString(), "1260");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("93718");
		rs = bigNumber.multi(new MyBigNumber("8"));
		assertEquals(rs.toString(), "749744");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8541");
		rs = bigNumber.multi(new MyBigNumber("88"));
		assertEquals(rs.toString(), "751608");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5634");
		rs = bigNumber.multi(new MyBigNumber("5"));
		assertEquals(rs.toString(), "28170");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3729");
		rs = bigNumber.multi(new MyBigNumber("27"));
		assertEquals(rs.toString(), "100683");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("65");
		rs = bigNumber.multi(new MyBigNumber("39"));
		assertEquals(rs.toString(), "2535");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("682");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "2728");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("68");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "272");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9294");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "65058");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("56159");
		rs = bigNumber.multi(new MyBigNumber("85"));
		assertEquals(rs.toString(), "4773515");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57726");
		rs = bigNumber.multi(new MyBigNumber("1"));
		assertEquals(rs.toString(), "57726");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("62936");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "377616");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("745");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "5215");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("79");
		rs = bigNumber.multi(new MyBigNumber("44"));
		assertEquals(rs.toString(), "3476");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("73");
		rs = bigNumber.multi(new MyBigNumber("98"));
		assertEquals(rs.toString(), "7154");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("128");
		rs = bigNumber.multi(new MyBigNumber("37"));
		assertEquals(rs.toString(), "4736");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("422");
		rs = bigNumber.multi(new MyBigNumber("29"));
		assertEquals(rs.toString(), "12238");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("232");
		rs = bigNumber.multi(new MyBigNumber("22"));
		assertEquals(rs.toString(), "5104");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("72857");
		rs = bigNumber.multi(new MyBigNumber("86"));
		assertEquals(rs.toString(), "6265702");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1939");
		rs = bigNumber.multi(new MyBigNumber("49"));
		assertEquals(rs.toString(), "95011");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("362");
		rs = bigNumber.multi(new MyBigNumber("1"));
		assertEquals(rs.toString(), "362");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("37");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "259");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57814");
		rs = bigNumber.multi(new MyBigNumber("61"));
		assertEquals(rs.toString(), "3526654");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5122");
		rs = bigNumber.multi(new MyBigNumber("2"));
		assertEquals(rs.toString(), "10244");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("64217");
		rs = bigNumber.multi(new MyBigNumber("38"));
		assertEquals(rs.toString(), "2440246");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("929");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "6503");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7967");
		rs = bigNumber.multi(new MyBigNumber("78"));
		assertEquals(rs.toString(), "621426");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("38622");
		rs = bigNumber.multi(new MyBigNumber("9"));
		assertEquals(rs.toString(), "347598");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("653");
		rs = bigNumber.multi(new MyBigNumber("78"));
		assertEquals(rs.toString(), "50934");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8327");
		rs = bigNumber.multi(new MyBigNumber("2"));
		assertEquals(rs.toString(), "16654");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("91");
		rs = bigNumber.multi(new MyBigNumber("8"));
		assertEquals(rs.toString(), "728");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("53");
		rs = bigNumber.multi(new MyBigNumber("41"));
		assertEquals(rs.toString(), "2173");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1337");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "9359");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("542");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "3252");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("45");
		rs = bigNumber.multi(new MyBigNumber("16"));
		assertEquals(rs.toString(), "720");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8346");
		rs = bigNumber.multi(new MyBigNumber("1"));
		assertEquals(rs.toString(), "8346");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("66988");
		rs = bigNumber.multi(new MyBigNumber("52"));
		assertEquals(rs.toString(), "3483376");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6271");
		rs = bigNumber.multi(new MyBigNumber("53"));
		assertEquals(rs.toString(), "332363");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("81526");
		rs = bigNumber.multi(new MyBigNumber("71"));
		assertEquals(rs.toString(), "5788346");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("66843");
		rs = bigNumber.multi(new MyBigNumber("8"));
		assertEquals(rs.toString(), "534744");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("582");
		rs = bigNumber.multi(new MyBigNumber("5"));
		assertEquals(rs.toString(), "2910");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("342");
		rs = bigNumber.multi(new MyBigNumber("39"));
		assertEquals(rs.toString(), "13338");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8735");
		rs = bigNumber.multi(new MyBigNumber("3"));
		assertEquals(rs.toString(), "26205");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("81728");
		rs = bigNumber.multi(new MyBigNumber("58"));
		assertEquals(rs.toString(), "4740224");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("21");
		rs = bigNumber.multi(new MyBigNumber("31"));
		assertEquals(rs.toString(), "651");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2979");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "17874");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("27774");
		rs = bigNumber.multi(new MyBigNumber("89"));
		assertEquals(rs.toString(), "2471886");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5769");
		rs = bigNumber.multi(new MyBigNumber("52"));
		assertEquals(rs.toString(), "299988");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("43698");
		rs = bigNumber.multi(new MyBigNumber("38"));
		assertEquals(rs.toString(), "1660524");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("215");
		rs = bigNumber.multi(new MyBigNumber("26"));
		assertEquals(rs.toString(), "5590");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3576");
		rs = bigNumber.multi(new MyBigNumber("77"));
		assertEquals(rs.toString(), "275352");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("574");
		rs = bigNumber.multi(new MyBigNumber("84"));
		assertEquals(rs.toString(), "48216");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("822");
		rs = bigNumber.multi(new MyBigNumber("23"));
		assertEquals(rs.toString(), "18906");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("581");
		rs = bigNumber.multi(new MyBigNumber("84"));
		assertEquals(rs.toString(), "48804");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("36");
		rs = bigNumber.multi(new MyBigNumber("2"));
		assertEquals(rs.toString(), "72");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("536");
		rs = bigNumber.multi(new MyBigNumber("17"));
		assertEquals(rs.toString(), "9112");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("42314");
		rs = bigNumber.multi(new MyBigNumber("12"));
		assertEquals(rs.toString(), "507768");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("525");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "3150");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("685");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "4110");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("61");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "244");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("694");
		rs = bigNumber.multi(new MyBigNumber("5"));
		assertEquals(rs.toString(), "3470");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("94978");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "569868");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("66");
		rs = bigNumber.multi(new MyBigNumber("3"));
		assertEquals(rs.toString(), "198");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("79");
		rs = bigNumber.multi(new MyBigNumber("69"));
		assertEquals(rs.toString(), "5451");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("72");
		rs = bigNumber.multi(new MyBigNumber("6"));
		assertEquals(rs.toString(), "432");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5144");
		rs = bigNumber.multi(new MyBigNumber("48"));
		assertEquals(rs.toString(), "246912");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("672");
		rs = bigNumber.multi(new MyBigNumber("85"));
		assertEquals(rs.toString(), "57120");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("56");
		rs = bigNumber.multi(new MyBigNumber("98"));
		assertEquals(rs.toString(), "5488");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("157");
		rs = bigNumber.multi(new MyBigNumber("42"));
		assertEquals(rs.toString(), "6594");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("53739");
		rs = bigNumber.multi(new MyBigNumber("69"));
		assertEquals(rs.toString(), "3707991");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("555");
		rs = bigNumber.multi(new MyBigNumber("4"));
		assertEquals(rs.toString(), "2220");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("21");
		rs = bigNumber.multi(new MyBigNumber("5"));
		assertEquals(rs.toString(), "105");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39831");
		rs = bigNumber.multi(new MyBigNumber("12"));
		assertEquals(rs.toString(), "477972");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7456");
		rs = bigNumber.multi(new MyBigNumber("49"));
		assertEquals(rs.toString(), "365344");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6928");
		rs = bigNumber.multi(new MyBigNumber("3"));
		assertEquals(rs.toString(), "20784");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5584");
		rs = bigNumber.multi(new MyBigNumber("43"));
		assertEquals(rs.toString(), "240112");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("58319");
		rs = bigNumber.multi(new MyBigNumber("52"));
		assertEquals(rs.toString(), "3032588");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("67977");
		rs = bigNumber.multi(new MyBigNumber("33"));
		assertEquals(rs.toString(), "2243241");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6879");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "48153");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("89549");
		rs = bigNumber.multi(new MyBigNumber("9"));
		assertEquals(rs.toString(), "805941");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("63");
		rs = bigNumber.multi(new MyBigNumber("27"));
		assertEquals(rs.toString(), "1701");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("138");
		rs = bigNumber.multi(new MyBigNumber("9"));
		assertEquals(rs.toString(), "1242");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4392");
		rs = bigNumber.multi(new MyBigNumber("7"));
		assertEquals(rs.toString(), "30744");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("772");
		rs = bigNumber.multi(new MyBigNumber("37"));
		assertEquals(rs.toString(), "28564");
		////End UseCase

	}
	@Test
	public void autoMultiOne() {
	////Declare
		MyBigNumber bigNumber = null;
		MyBigNumber rs = null;
		////End Declare
		////Start UseCase
		bigNumber = new MyBigNumber("81");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "486");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("89834");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "179668");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1694");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "15246");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("37");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "259");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("812");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "3248");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("51968");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "207872");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("78348");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "313392");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("891");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "1782");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("74417");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "520919");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("184");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "920");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3131");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "12524");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("64159");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "513272");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("138");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "966");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4588");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "32116");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7143");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "50001");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("16617");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "33234");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("55");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "330");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("37");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "296");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("82");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "738");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("87896");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "703168");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7891");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "15782");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5467");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "49203");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("368");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "2576");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1242");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "4968");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4847");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "9694");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("348");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "2436");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3539");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "17695");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8178");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "24534");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("54757");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "328542");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("38");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "266");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "351");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4334");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "13002");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("18");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "108");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("99279");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "694953");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("921");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "4605");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("87");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "609");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("624");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "4992");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("63");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "252");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("94933");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "759464");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5577");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "22308");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("49118");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "343826");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("47");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "94");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("773");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "3092");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5455");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "49095");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6331");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "44317");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("72922");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "437532");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("384");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "3072");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5539");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "11078");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("22163");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "110815");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("46");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "138");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("65");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "390");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8536");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "51216");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("59");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "295");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6876");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "41256");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("45233");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "135699");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("18");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "108");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("141");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "1269");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3581");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "7162");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("34");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "102");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("96");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "384");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6668");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "40008");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("927");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "1854");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6416");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "19248");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("631");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "1893");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("97");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "873");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("83");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "664");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9584");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "86256");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("56945");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "113890");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("941");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "8469");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4582");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "18328");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("782");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "7038");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("75664");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "605312");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("955");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "6685");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4121");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "24726");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("967");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "1934");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5398");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "10796");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("94");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "846");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("27528");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "192696");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("67347");
		rs = bigNumber.multiOne(9);
		assertEquals(rs.toString(), "606123");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("59");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "236");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("2669");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "18683");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("31271");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "156355");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("455");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "3185");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("93338");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "280014");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6938");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "34690");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57873");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "173619");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("1323");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "6615");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("37947");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "189735");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("799");
		rs = bigNumber.multiOne(7);
		assertEquals(rs.toString(), "5593");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("49");
		rs = bigNumber.multiOne(6);
		assertEquals(rs.toString(), "294");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8791");
		rs = bigNumber.multiOne(4);
		assertEquals(rs.toString(), "35164");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("874");
		rs = bigNumber.multiOne(2);
		assertEquals(rs.toString(), "1748");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("75");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "375");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("56");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "168");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("46");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "368");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("522");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "4176");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4359");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "34872");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39935");
		rs = bigNumber.multiOne(5);
		assertEquals(rs.toString(), "199675");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5473");
		rs = bigNumber.multiOne(8);
		assertEquals(rs.toString(), "43784");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("79");
		rs = bigNumber.multiOne(3);
		assertEquals(rs.toString(), "237");
		////End UseCase


		
	}

}
