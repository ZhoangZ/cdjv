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
		assertArrayEquals(MyBigNumber.div("43832834152","61"), new String[]{"718571051","41"});
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
	public void machineComputeMini() {
		assertArrayEquals(MyBigNumber.div("771","52"), new String[]{"14","43"});
		assertArrayEquals(MyBigNumber.div("58","61"), new String[]{"0","58"});
		assertArrayEquals(MyBigNumber.div("836","43"), new String[]{"19","19"});
		assertArrayEquals(MyBigNumber.div("66","5"), new String[]{"13","1"});
		assertArrayEquals(MyBigNumber.div("145","34"), new String[]{"4","9"});
		assertArrayEquals(MyBigNumber.div("38","94"), new String[]{"0","38"});
		assertArrayEquals(MyBigNumber.div("95","3"), new String[]{"31","2"});
		assertArrayEquals(MyBigNumber.div("227","75"), new String[]{"3","2"});
		assertArrayEquals(MyBigNumber.div("45","35"), new String[]{"1","10"});
		assertArrayEquals(MyBigNumber.div("287","5"), new String[]{"57","2"});
		assertArrayEquals(MyBigNumber.div("58","9"), new String[]{"6","4"});
		assertArrayEquals(MyBigNumber.div("12","7"), new String[]{"1","5"});
		assertArrayEquals(MyBigNumber.div("15","46"), new String[]{"0","15"});
		assertArrayEquals(MyBigNumber.div("35","2"), new String[]{"17","1"});
		assertArrayEquals(MyBigNumber.div("735","37"), new String[]{"19","32"});
		
		assertArrayEquals(MyBigNumber.div("81","39"), new String[]{"2","3"});
		assertArrayEquals(MyBigNumber.div("297","5"), new String[]{"59","2"});
		assertArrayEquals(MyBigNumber.div("483","13"), new String[]{"37","2"});
		assertArrayEquals(MyBigNumber.div("191","6"), new String[]{"31","5"});
		
		assertArrayEquals(MyBigNumber.div("659","5"), new String[]{"131","4"});
		assertArrayEquals(MyBigNumber.div("454","2"), new String[]{"227","0"});
		assertArrayEquals(MyBigNumber.div("38","25"), new String[]{"1","13"});
		assertArrayEquals(MyBigNumber.div("21","9"), new String[]{"2","3"});
		assertArrayEquals(MyBigNumber.div("223","52"), new String[]{"4","15"});
		assertArrayEquals(MyBigNumber.div("342","47"), new String[]{"7","13"});
		assertArrayEquals(MyBigNumber.div("92","53"), new String[]{"1","39"});
		assertArrayEquals(MyBigNumber.div("98","75"), new String[]{"1","23"});
		assertArrayEquals(MyBigNumber.div("774","18"), new String[]{"43","0"});
		assertArrayEquals(MyBigNumber.div("35","63"), new String[]{"0","35"});
		assertArrayEquals(MyBigNumber.div("691","5"), new String[]{"138","1"});
		assertArrayEquals(MyBigNumber.div("567","3"), new String[]{"189","0"});
		assertArrayEquals(MyBigNumber.div("112","94"), new String[]{"1","18"});
		assertArrayEquals(MyBigNumber.div("96","64"), new String[]{"1","32"});
		assertArrayEquals(MyBigNumber.div("89","5"), new String[]{"17","4"});
		assertArrayEquals(MyBigNumber.div("79","85"), new String[]{"0","79"});
		
		assertArrayEquals(MyBigNumber.div("772","4"), new String[]{"193","0"});
		assertArrayEquals(MyBigNumber.div("27","53"), new String[]{"0","27"});
		assertArrayEquals(MyBigNumber.div("12","9"), new String[]{"1","3"});
		assertArrayEquals(MyBigNumber.div("317","53"), new String[]{"5","52"});
		assertArrayEquals(MyBigNumber.div("652","7"), new String[]{"93","1"});
		assertArrayEquals(MyBigNumber.div("669","5"), new String[]{"133","4"});
		assertArrayEquals(MyBigNumber.div("81","63"), new String[]{"1","18"});
		assertArrayEquals(MyBigNumber.div("961","5"), new String[]{"192","1"});
		assertArrayEquals(MyBigNumber.div("883","7"), new String[]{"126","1"});
		assertArrayEquals(MyBigNumber.div("55","23"), new String[]{"2","9"});
		assertArrayEquals(MyBigNumber.div("92","6"), new String[]{"15","2"});
		assertArrayEquals(MyBigNumber.div("549","8"), new String[]{"68","5"});
		assertArrayEquals(MyBigNumber.div("88","8"), new String[]{"11","0"});
		assertArrayEquals(MyBigNumber.div("67","24"), new String[]{"2","19"});
		assertArrayEquals(MyBigNumber.div("496","4"), new String[]{"124","0"});
		assertArrayEquals(MyBigNumber.div("486","1"), new String[]{"486","0"});
		assertArrayEquals(MyBigNumber.div("78","53"), new String[]{"1","25"});
		assertArrayEquals(MyBigNumber.div("92","94"), new String[]{"0","92"});
		assertArrayEquals(MyBigNumber.div("774","22"), new String[]{"35","4"});
		assertArrayEquals(MyBigNumber.div("622","2"), new String[]{"311","0"});
		assertArrayEquals(MyBigNumber.div("847","87"), new String[]{"9","64"});
		
		assertArrayEquals(MyBigNumber.div("89","1"), new String[]{"89","0"});
		assertArrayEquals(MyBigNumber.div("994","3"), new String[]{"331","1"});
		assertArrayEquals(MyBigNumber.div("849","6"), new String[]{"141","3"});
		assertArrayEquals(MyBigNumber.div("62","27"), new String[]{"2","8"});
		assertArrayEquals(MyBigNumber.div("773","5"), new String[]{"154","3"});
		assertArrayEquals(MyBigNumber.div("31","9"), new String[]{"3","4"});
		assertArrayEquals(MyBigNumber.div("396","9"), new String[]{"44","0"});
		assertArrayEquals(MyBigNumber.div("651","96"), new String[]{"6","75"});
		assertArrayEquals(MyBigNumber.div("58","14"), new String[]{"4","2"});
		assertArrayEquals(MyBigNumber.div("945","2"), new String[]{"472","1"});
		assertArrayEquals(MyBigNumber.div("897","66"), new String[]{"13","39"});
		assertArrayEquals(MyBigNumber.div("84","7"), new String[]{"12","0"});
		assertArrayEquals(MyBigNumber.div("647","9"), new String[]{"71","8"});
		assertArrayEquals(MyBigNumber.div("91","73"), new String[]{"1","18"});
		assertArrayEquals(MyBigNumber.div("67","5"), new String[]{"13","2"});
		assertArrayEquals(MyBigNumber.div("91","31"), new String[]{"2","29"});
		assertArrayEquals(MyBigNumber.div("86","8"), new String[]{"10","6"});
		assertArrayEquals(MyBigNumber.div("93","2"), new String[]{"46","1"});
		assertArrayEquals(MyBigNumber.div("373","33"), new String[]{"11","10"});
		assertArrayEquals(MyBigNumber.div("36","3"), new String[]{"12","0"});
		assertArrayEquals(MyBigNumber.div("438","4"), new String[]{"109","2"});
		assertArrayEquals(MyBigNumber.div("668","7"), new String[]{"95","3"});
		assertArrayEquals(MyBigNumber.div("229","4"), new String[]{"57","1"});
		assertArrayEquals(MyBigNumber.div("169","57"), new String[]{"2","55"});
		assertArrayEquals(MyBigNumber.div("697","91"), new String[]{"7","60"});
		assertArrayEquals(MyBigNumber.div("158","91"), new String[]{"1","67"});
		assertArrayEquals(MyBigNumber.div("386","52"), new String[]{"7","22"});
		assertArrayEquals(MyBigNumber.div("275","64"), new String[]{"4","19"});
		assertArrayEquals(MyBigNumber.div("463","5"), new String[]{"92","3"});
		assertArrayEquals(MyBigNumber.div("75","38"), new String[]{"1","37"});
		assertArrayEquals(MyBigNumber.div("31","6"), new String[]{"5","1"});
		assertArrayEquals(MyBigNumber.div("383","5"), new String[]{"76","3"});
		assertArrayEquals(MyBigNumber.div("24","62"), new String[]{"0","24"});
		assertArrayEquals(MyBigNumber.div("18","9"), new String[]{"2","0"});
		assertArrayEquals(MyBigNumber.div("958","35"), new String[]{"27","13"});
		assertArrayEquals(MyBigNumber.div("198","86"), new String[]{"2","26"});
		assertArrayEquals(MyBigNumber.div("45","6"), new String[]{"7","3"});
		assertArrayEquals(MyBigNumber.div("21","56"), new String[]{"0","21"});
		assertArrayEquals(MyBigNumber.div("124","91"), new String[]{"1","33"});
		assertArrayEquals(MyBigNumber.div("36","92"), new String[]{"0","36"});
		assertArrayEquals(MyBigNumber.div("11","1"), new String[]{"11","0"});
		assertArrayEquals(MyBigNumber.div("73","55"), new String[]{"1","18"});
		assertArrayEquals(MyBigNumber.div("76","82"), new String[]{"0","76"});
		assertArrayEquals(MyBigNumber.div("91","7"), new String[]{"13","0"});
		
		assertArrayEquals(MyBigNumber.div("543","23"), new String[]{"23","14"});
		assertArrayEquals(MyBigNumber.div("78","3"), new String[]{"26","0"});
		assertArrayEquals(MyBigNumber.div("95","5"), new String[]{"19","0"});
		assertArrayEquals(MyBigNumber.div("741","4"), new String[]{"185","1"});
		assertArrayEquals(MyBigNumber.div("74","83"), new String[]{"0","74"});
		assertArrayEquals(MyBigNumber.div("79","6"), new String[]{"13","1"});
		assertArrayEquals(MyBigNumber.div("75","6"), new String[]{"12","3"});
		assertArrayEquals(MyBigNumber.div("89","4"), new String[]{"22","1"});
		assertArrayEquals(MyBigNumber.div("129","2"), new String[]{"64","1"});
		
		assertArrayEquals(MyBigNumber.div("99","6"), new String[]{"16","3"});
		assertArrayEquals(MyBigNumber.div("234","9"), new String[]{"26","0"});
		assertArrayEquals(MyBigNumber.div("23","38"), new String[]{"0","23"});
		assertArrayEquals(MyBigNumber.div("473","33"), new String[]{"14","11"});
		assertArrayEquals(MyBigNumber.div("49","13"), new String[]{"3","10"});
		assertArrayEquals(MyBigNumber.div("57","1"), new String[]{"57","0"});
		assertArrayEquals(MyBigNumber.div("913","4"), new String[]{"228","1"});
		assertArrayEquals(MyBigNumber.div("267","9"), new String[]{"29","6"});
		assertArrayEquals(MyBigNumber.div("387","8"), new String[]{"48","3"});
		assertArrayEquals(MyBigNumber.div("459","52"), new String[]{"8","43"});
		assertArrayEquals(MyBigNumber.div("289","3"), new String[]{"96","1"});
		assertArrayEquals(MyBigNumber.div("945","1"), new String[]{"945","0"});
		assertArrayEquals(MyBigNumber.div("88","5"), new String[]{"17","3"});
		assertArrayEquals(MyBigNumber.div("432","85"), new String[]{"5","7"});
		assertArrayEquals(MyBigNumber.div("754","2"), new String[]{"377","0"});
		assertArrayEquals(MyBigNumber.div("17","4"), new String[]{"4","1"});
		assertArrayEquals(MyBigNumber.div("999","21"), new String[]{"47","12"});
		assertArrayEquals(MyBigNumber.div("96","9"), new String[]{"10","6"});
		assertArrayEquals(MyBigNumber.div("875","14"), new String[]{"62","7"});
		assertArrayEquals(MyBigNumber.div("31","6"), new String[]{"5","1"});
		assertArrayEquals(MyBigNumber.div("633","4"), new String[]{"158","1"});
		assertArrayEquals(MyBigNumber.div("39","2"), new String[]{"19","1"});
		assertArrayEquals(MyBigNumber.div("48","49"), new String[]{"0","48"});
		assertArrayEquals(MyBigNumber.div("11","6"), new String[]{"1","5"});
		assertArrayEquals(MyBigNumber.div("32","51"), new String[]{"0","32"});
		assertArrayEquals(MyBigNumber.div("89","2"), new String[]{"44","1"});
		assertArrayEquals(MyBigNumber.div("178","6"), new String[]{"29","4"});
		assertArrayEquals(MyBigNumber.div("46","6"), new String[]{"7","4"});
		assertArrayEquals(MyBigNumber.div("51","31"), new String[]{"1","20"});
		assertArrayEquals(MyBigNumber.div("69","27"), new String[]{"2","15"});
		assertArrayEquals(MyBigNumber.div("98","99"), new String[]{"0","98"});
		assertArrayEquals(MyBigNumber.div("633","3"), new String[]{"211","0"});
		assertArrayEquals(MyBigNumber.div("671","5"), new String[]{"134","1"});
		assertArrayEquals(MyBigNumber.div("15","96"), new String[]{"0","15"});
		assertArrayEquals(MyBigNumber.div("667","7"), new String[]{"95","2"});
		assertArrayEquals(MyBigNumber.div("74","8"), new String[]{"9","2"});
		assertArrayEquals(MyBigNumber.div("22","5"), new String[]{"4","2"});
		assertArrayEquals(MyBigNumber.div("863","44"), new String[]{"19","27"});
		assertArrayEquals(MyBigNumber.div("23","19"), new String[]{"1","4"});
		assertArrayEquals(MyBigNumber.div("983","44"), new String[]{"22","15"});
		assertArrayEquals(MyBigNumber.div("12","3"), new String[]{"4","0"});
		assertArrayEquals(MyBigNumber.div("68","2"), new String[]{"34","0"});
		assertArrayEquals(MyBigNumber.div("29","7"), new String[]{"4","1"});
		assertArrayEquals(MyBigNumber.div("44","8"), new String[]{"5","4"});
		assertArrayEquals(MyBigNumber.div("166","3"), new String[]{"55","1"});
		assertArrayEquals(MyBigNumber.div("54","4"), new String[]{"13","2"});
		assertArrayEquals(MyBigNumber.div("59","8"), new String[]{"7","3"});
		assertArrayEquals(MyBigNumber.div("96","8"), new String[]{"12","0"});
		assertArrayEquals(MyBigNumber.div("545","1"), new String[]{"545","0"});
		assertArrayEquals(MyBigNumber.div("825","5"), new String[]{"165","0"});
		assertArrayEquals(MyBigNumber.div("18","3"), new String[]{"6","0"});
		assertArrayEquals(MyBigNumber.div("319","6"), new String[]{"53","1"});
		assertArrayEquals(MyBigNumber.div("23","7"), new String[]{"3","2"});
		assertArrayEquals(MyBigNumber.div("81","2"), new String[]{"40","1"});
		assertArrayEquals(MyBigNumber.div("83","1"), new String[]{"83","0"});
		assertArrayEquals(MyBigNumber.div("276","3"), new String[]{"92","0"});
		assertArrayEquals(MyBigNumber.div("255","3"), new String[]{"85","0"});
		assertArrayEquals(MyBigNumber.div("746","7"), new String[]{"106","4"});
		assertArrayEquals(MyBigNumber.div("716","75"), new String[]{"9","41"});
		assertArrayEquals(MyBigNumber.div("713","85"), new String[]{"8","33"});
		assertArrayEquals(MyBigNumber.div("355","17"), new String[]{"20","15"});
		assertArrayEquals(MyBigNumber.div("222","94"), new String[]{"2","34"});
		assertArrayEquals(MyBigNumber.div("636","9"), new String[]{"70","6"});
		assertArrayEquals(MyBigNumber.div("621","99"), new String[]{"6","27"});
		assertArrayEquals(MyBigNumber.div("26","4"), new String[]{"6","2"});
		assertArrayEquals(MyBigNumber.div("977","24"), new String[]{"40","17"});
		assertArrayEquals(MyBigNumber.div("531","7"), new String[]{"75","6"});
		assertArrayEquals(MyBigNumber.div("77","53"), new String[]{"1","24"});
		assertArrayEquals(MyBigNumber.div("37","84"), new String[]{"0","37"});
		assertArrayEquals(MyBigNumber.div("14","9"), new String[]{"1","5"});
		assertArrayEquals(MyBigNumber.div("475","5"), new String[]{"95","0"});
		assertArrayEquals(MyBigNumber.div("882","72"), new String[]{"12","18"});
		assertArrayEquals(MyBigNumber.div("451","2"), new String[]{"225","1"});
		assertArrayEquals(MyBigNumber.div("312","39"), new String[]{"8","0"});
		assertArrayEquals(MyBigNumber.div("886","6"), new String[]{"147","4"});
		assertArrayEquals(MyBigNumber.div("662","5"), new String[]{"132","2"});
		assertArrayEquals(MyBigNumber.div("36","1"), new String[]{"36","0"});
		assertArrayEquals(MyBigNumber.div("15","62"), new String[]{"0","15"});
		assertArrayEquals(MyBigNumber.div("867","43"), new String[]{"20","7"});
		assertArrayEquals(MyBigNumber.div("759","94"), new String[]{"8","7"});
		assertArrayEquals(MyBigNumber.div("641","76"), new String[]{"8","33"});
		assertArrayEquals(MyBigNumber.div("229","53"), new String[]{"4","17"});
		assertArrayEquals(MyBigNumber.div("923","3"), new String[]{"307","2"});
		assertArrayEquals(MyBigNumber.div("785","7"), new String[]{"112","1"});
		assertArrayEquals(MyBigNumber.div("481","8"), new String[]{"60","1"});
		assertArrayEquals(MyBigNumber.div("553","55"), new String[]{"10","3"});
		assertArrayEquals(MyBigNumber.div("788","26"), new String[]{"30","8"});
		assertArrayEquals(MyBigNumber.div("494","7"), new String[]{"70","4"});
		assertArrayEquals(MyBigNumber.div("473","44"), new String[]{"10","33"});
	
	}
	@Test
	public void bug() {
		


		}
	

}
