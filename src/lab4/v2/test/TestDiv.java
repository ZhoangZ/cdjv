package lab4.v2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.v2.MyBigNumber;

public class TestDiv {

	@Test
	public void test() {
		MyBigNumber bigNumber = new MyBigNumber("12");
		MyBigNumber[] rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "12");
		assertEquals(rs[1].toString(), "0");
		
	}
	@Test
	public void auto() {
	////Declare
		MyBigNumber bigNumber = null;
		MyBigNumber[] rs = null;
		////End Declare
		////Start UseCase
		bigNumber = new MyBigNumber("931");
		rs = bigNumber.div(new MyBigNumber("16"));
		assertEquals(rs[0].toString(), "58");
		assertEquals(rs[1].toString(), "3");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57978");
		rs = bigNumber.div(new MyBigNumber("68"));
		assertEquals(rs[0].toString(), "852");
		assertEquals(rs[1].toString(), "42");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8975");
		rs = bigNumber.div(new MyBigNumber("13"));
		assertEquals(rs[0].toString(), "690");
		assertEquals(rs[1].toString(), "5");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("257");
		rs = bigNumber.div(new MyBigNumber("55"));
		assertEquals(rs[0].toString(), "4");
		assertEquals(rs[1].toString(), "37");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("96125");
		rs = bigNumber.div(new MyBigNumber("3"));
		assertEquals(rs[0].toString(), "32041");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4614");
		rs = bigNumber.div(new MyBigNumber("44"));
		assertEquals(rs[0].toString(), "104");
		assertEquals(rs[1].toString(), "38");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("19");
		rs = bigNumber.div(new MyBigNumber("29"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "19");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5137");
		rs = bigNumber.div(new MyBigNumber("7"));
		assertEquals(rs[0].toString(), "733");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("15785");
		rs = bigNumber.div(new MyBigNumber("42"));
		assertEquals(rs[0].toString(), "375");
		assertEquals(rs[1].toString(), "35");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8192");
		rs = bigNumber.div(new MyBigNumber("11"));
		assertEquals(rs[0].toString(), "744");
		assertEquals(rs[1].toString(), "8");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("99115");
		rs = bigNumber.div(new MyBigNumber("33"));
		assertEquals(rs[0].toString(), "3003");
		assertEquals(rs[1].toString(), "16");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("65717");
		rs = bigNumber.div(new MyBigNumber("28"));
		assertEquals(rs[0].toString(), "2347");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("49");
		rs = bigNumber.div(new MyBigNumber("3"));
		assertEquals(rs[0].toString(), "16");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("62");
		rs = bigNumber.div(new MyBigNumber("78"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "62");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("94");
		rs = bigNumber.div(new MyBigNumber("2"));
		assertEquals(rs[0].toString(), "47");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6118");
		rs = bigNumber.div(new MyBigNumber("35"));
		assertEquals(rs[0].toString(), "174");
		assertEquals(rs[1].toString(), "28");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("17");
		rs = bigNumber.div(new MyBigNumber("74"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "17");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("363");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "363");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("16");
		rs = bigNumber.div(new MyBigNumber("41"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "16");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5152");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "5152");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("132");
		rs = bigNumber.div(new MyBigNumber("21"));
		assertEquals(rs[0].toString(), "6");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("26929");
		rs = bigNumber.div(new MyBigNumber("24"));
		assertEquals(rs[0].toString(), "1122");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("822");
		rs = bigNumber.div(new MyBigNumber("4"));
		assertEquals(rs[0].toString(), "205");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("298");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "49");
		assertEquals(rs[1].toString(), "4");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7291");
		rs = bigNumber.div(new MyBigNumber("3"));
		assertEquals(rs[0].toString(), "2430");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("423");
		rs = bigNumber.div(new MyBigNumber("92"));
		assertEquals(rs[0].toString(), "4");
		assertEquals(rs[1].toString(), "55");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9458");
		rs = bigNumber.div(new MyBigNumber("55"));
		assertEquals(rs[0].toString(), "171");
		assertEquals(rs[1].toString(), "53");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("66");
		rs = bigNumber.div(new MyBigNumber("84"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "66");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("88");
		rs = bigNumber.div(new MyBigNumber("31"));
		assertEquals(rs[0].toString(), "2");
		assertEquals(rs[1].toString(), "26");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57");
		rs = bigNumber.div(new MyBigNumber("75"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "57");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("49764");
		rs = bigNumber.div(new MyBigNumber("78"));
		assertEquals(rs[0].toString(), "638");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("68465");
		rs = bigNumber.div(new MyBigNumber("5"));
		assertEquals(rs[0].toString(), "13693");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("21");
		rs = bigNumber.div(new MyBigNumber("83"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "21");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("69516");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "69516");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("87663");
		rs = bigNumber.div(new MyBigNumber("7"));
		assertEquals(rs[0].toString(), "12523");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("12");
		rs = bigNumber.div(new MyBigNumber("4"));
		assertEquals(rs[0].toString(), "3");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("18724");
		rs = bigNumber.div(new MyBigNumber("8"));
		assertEquals(rs[0].toString(), "2340");
		assertEquals(rs[1].toString(), "4");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("83122");
		rs = bigNumber.div(new MyBigNumber("44"));
		assertEquals(rs[0].toString(), "1889");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("7768");
		rs = bigNumber.div(new MyBigNumber("78"));
		assertEquals(rs[0].toString(), "99");
		assertEquals(rs[1].toString(), "46");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("164");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "164");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("348");
		rs = bigNumber.div(new MyBigNumber("13"));
		assertEquals(rs[0].toString(), "26");
		assertEquals(rs[1].toString(), "10");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("818");
		rs = bigNumber.div(new MyBigNumber("64"));
		assertEquals(rs[0].toString(), "12");
		assertEquals(rs[1].toString(), "50");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("64785");
		rs = bigNumber.div(new MyBigNumber("2"));
		assertEquals(rs[0].toString(), "32392");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("27839");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "27839");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("36");
		rs = bigNumber.div(new MyBigNumber("56"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "36");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("64551");
		rs = bigNumber.div(new MyBigNumber("13"));
		assertEquals(rs[0].toString(), "4965");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("253");
		rs = bigNumber.div(new MyBigNumber("9"));
		assertEquals(rs[0].toString(), "28");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("16994");
		rs = bigNumber.div(new MyBigNumber("3"));
		assertEquals(rs[0].toString(), "5664");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8181");
		rs = bigNumber.div(new MyBigNumber("39"));
		assertEquals(rs[0].toString(), "209");
		assertEquals(rs[1].toString(), "30");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("616");
		rs = bigNumber.div(new MyBigNumber("8"));
		assertEquals(rs[0].toString(), "77");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("53781");
		rs = bigNumber.div(new MyBigNumber("82"));
		assertEquals(rs[0].toString(), "655");
		assertEquals(rs[1].toString(), "71");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("91");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "15");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("27");
		rs = bigNumber.div(new MyBigNumber("5"));
		assertEquals(rs[0].toString(), "5");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6415");
		rs = bigNumber.div(new MyBigNumber("43"));
		assertEquals(rs[0].toString(), "149");
		assertEquals(rs[1].toString(), "8");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3216");
		rs = bigNumber.div(new MyBigNumber("2"));
		assertEquals(rs[0].toString(), "1608");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5482");
		rs = bigNumber.div(new MyBigNumber("7"));
		assertEquals(rs[0].toString(), "783");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("61189");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "10198");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("26895");
		rs = bigNumber.div(new MyBigNumber("5"));
		assertEquals(rs[0].toString(), "5379");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("46928");
		rs = bigNumber.div(new MyBigNumber("9"));
		assertEquals(rs[0].toString(), "5214");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4124");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "687");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("6731");
		rs = bigNumber.div(new MyBigNumber("2"));
		assertEquals(rs[0].toString(), "3365");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("5668");
		rs = bigNumber.div(new MyBigNumber("47"));
		assertEquals(rs[0].toString(), "120");
		assertEquals(rs[1].toString(), "28");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("218");
		rs = bigNumber.div(new MyBigNumber("7"));
		assertEquals(rs[0].toString(), "31");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("4978");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "829");
		assertEquals(rs[1].toString(), "4");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("664");
		rs = bigNumber.div(new MyBigNumber("64"));
		assertEquals(rs[0].toString(), "10");
		assertEquals(rs[1].toString(), "24");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9118");
		rs = bigNumber.div(new MyBigNumber("39"));
		assertEquals(rs[0].toString(), "233");
		assertEquals(rs[1].toString(), "31");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("161");
		rs = bigNumber.div(new MyBigNumber("8"));
		assertEquals(rs[0].toString(), "20");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("12284");
		rs = bigNumber.div(new MyBigNumber("3"));
		assertEquals(rs[0].toString(), "4094");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("461");
		rs = bigNumber.div(new MyBigNumber("9"));
		assertEquals(rs[0].toString(), "51");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("61");
		rs = bigNumber.div(new MyBigNumber("9"));
		assertEquals(rs[0].toString(), "6");
		assertEquals(rs[1].toString(), "7");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8479");
		rs = bigNumber.div(new MyBigNumber("2"));
		assertEquals(rs[0].toString(), "4239");
		assertEquals(rs[1].toString(), "1");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("65892");
		rs = bigNumber.div(new MyBigNumber("53"));
		assertEquals(rs[0].toString(), "1243");
		assertEquals(rs[1].toString(), "13");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("57");
		rs = bigNumber.div(new MyBigNumber("3"));
		assertEquals(rs[0].toString(), "19");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("326");
		rs = bigNumber.div(new MyBigNumber("8"));
		assertEquals(rs[0].toString(), "40");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("93427");
		rs = bigNumber.div(new MyBigNumber("16"));
		assertEquals(rs[0].toString(), "5839");
		assertEquals(rs[1].toString(), "3");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("9355");
		rs = bigNumber.div(new MyBigNumber("24"));
		assertEquals(rs[0].toString(), "389");
		assertEquals(rs[1].toString(), "19");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("33261");
		rs = bigNumber.div(new MyBigNumber("77"));
		assertEquals(rs[0].toString(), "431");
		assertEquals(rs[1].toString(), "74");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("483");
		rs = bigNumber.div(new MyBigNumber("9"));
		assertEquals(rs[0].toString(), "53");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("35");
		rs = bigNumber.div(new MyBigNumber("8"));
		assertEquals(rs[0].toString(), "4");
		assertEquals(rs[1].toString(), "3");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("258");
		rs = bigNumber.div(new MyBigNumber("7"));
		assertEquals(rs[0].toString(), "36");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("32969");
		rs = bigNumber.div(new MyBigNumber("17"));
		assertEquals(rs[0].toString(), "1939");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("43314");
		rs = bigNumber.div(new MyBigNumber("45"));
		assertEquals(rs[0].toString(), "962");
		assertEquals(rs[1].toString(), "24");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("32267");
		rs = bigNumber.div(new MyBigNumber("9"));
		assertEquals(rs[0].toString(), "3585");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("574");
		rs = bigNumber.div(new MyBigNumber("49"));
		assertEquals(rs[0].toString(), "11");
		assertEquals(rs[1].toString(), "35");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("111");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "111");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8326");
		rs = bigNumber.div(new MyBigNumber("49"));
		assertEquals(rs[0].toString(), "169");
		assertEquals(rs[1].toString(), "45");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("86");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "14");
		assertEquals(rs[1].toString(), "2");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("26");
		rs = bigNumber.div(new MyBigNumber("97"));
		assertEquals(rs[0].toString(), "0");
		assertEquals(rs[1].toString(), "26");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3944");
		rs = bigNumber.div(new MyBigNumber("13"));
		assertEquals(rs[0].toString(), "303");
		assertEquals(rs[1].toString(), "5");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("3751");
		rs = bigNumber.div(new MyBigNumber("97"));
		assertEquals(rs[0].toString(), "38");
		assertEquals(rs[1].toString(), "65");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39158");
		rs = bigNumber.div(new MyBigNumber("95"));
		assertEquals(rs[0].toString(), "412");
		assertEquals(rs[1].toString(), "18");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("691");
		rs = bigNumber.div(new MyBigNumber("79"));
		assertEquals(rs[0].toString(), "8");
		assertEquals(rs[1].toString(), "59");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("78");
		rs = bigNumber.div(new MyBigNumber("8"));
		assertEquals(rs[0].toString(), "9");
		assertEquals(rs[1].toString(), "6");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("68352");
		rs = bigNumber.div(new MyBigNumber("6"));
		assertEquals(rs[0].toString(), "11392");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("39");
		rs = bigNumber.div(new MyBigNumber("4"));
		assertEquals(rs[0].toString(), "9");
		assertEquals(rs[1].toString(), "3");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("8988");
		rs = bigNumber.div(new MyBigNumber("58"));
		assertEquals(rs[0].toString(), "154");
		assertEquals(rs[1].toString(), "56");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("54");
		rs = bigNumber.div(new MyBigNumber("51"));
		assertEquals(rs[0].toString(), "1");
		assertEquals(rs[1].toString(), "3");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("538");
		rs = bigNumber.div(new MyBigNumber("35"));
		assertEquals(rs[0].toString(), "15");
		assertEquals(rs[1].toString(), "13");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("96");
		rs = bigNumber.div(new MyBigNumber("1"));
		assertEquals(rs[0].toString(), "96");
		assertEquals(rs[1].toString(), "0");
		////End UseCase
		////Start UseCase
		bigNumber = new MyBigNumber("67334");
		rs = bigNumber.div(new MyBigNumber("11"));
		assertEquals(rs[0].toString(), "6121");
		assertEquals(rs[1].toString(), "3");
		////End UseCase



		
	}

}
