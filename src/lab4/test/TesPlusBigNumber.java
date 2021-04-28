package lab4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.MyBigNumber;

public class TesPlusBigNumber {

	@Test
	public void tesPlus() {
		assertEquals(MyBigNumber.plus("91", "9"), "100");
		assertEquals(MyBigNumber.plus("991", "9"), "1000");
		assertEquals(MyBigNumber.plus("6", "9332"), "9338");
		assertEquals(MyBigNumber.plus("12", "1"), "13");
		assertEquals(MyBigNumber.plus("4", "9"), "13");
		assertEquals(MyBigNumber.plus("1", "13"), "14");
		assertEquals(MyBigNumber.plus("111111112", "1"), "111111113");
		assertEquals(MyBigNumber.plus("21544", "1"), "21545");
		assertEquals(MyBigNumber.plus("12", "8"), "20");
		assertEquals(MyBigNumber.plus("2", "3"), "5");
	
	}
	@Test
	public void tesPlusRandom() {
		
		assertEquals(MyBigNumber.plus("9", "55179"), "55188");
		assertEquals(MyBigNumber.plus("799", "9"), "808");
		assertEquals(MyBigNumber.plus("32", "781"), "813");
		assertEquals(MyBigNumber.plus("8141", "3"), "8144");
		assertEquals(MyBigNumber.plus("98994", "9896"), "108890");
		assertEquals(MyBigNumber.plus("4171", "211"), "4382");
		assertEquals(MyBigNumber.plus("3188", "788648"), "791836");
		assertEquals(MyBigNumber.plus("778", "231"), "1009");
		assertEquals(MyBigNumber.plus("8", "32594"), "32602");
		assertEquals(MyBigNumber.plus("8281", "895"), "9176");
		assertEquals(MyBigNumber.plus("64", "1"), "65");
		assertEquals(MyBigNumber.plus("9738", "4"), "9742");
		assertEquals(MyBigNumber.plus("62", "48"), "110");
		assertEquals(MyBigNumber.plus("3", "18249"), "18252");
		assertEquals(MyBigNumber.plus("279", "3"), "282");
		assertEquals(MyBigNumber.plus("4", "8948"), "8952");
		assertEquals(MyBigNumber.plus("315", "4848"), "5163");
		assertEquals(MyBigNumber.plus("56", "9934113"), "9934169");
		assertEquals(MyBigNumber.plus("6857", "25"), "6882");
		assertEquals(MyBigNumber.plus("7", "817264"), "817271");
		assertEquals(MyBigNumber.plus("53", "1648257"), "1648310");
		assertEquals(MyBigNumber.plus("15394", "8682177"), "8697571");
		assertEquals(MyBigNumber.plus("1787", "55365"), "57152");
	}
	@Test
	public void tesPlusMini() {
		assertEquals(MyBigNumber.plus("714", "418752"), (714 + 418752)+"" );
		assertEquals(MyBigNumber.plus("3", "539482"), (3 + 539482)+"" );
		assertEquals(MyBigNumber.plus("184", "229327"), (184 + 229327)+"" );
		assertEquals(MyBigNumber.plus("67", "85"), (67 + 85)+"" );
		assertEquals(MyBigNumber.plus("74", "7"), (74 + 7)+"" );
		assertEquals(MyBigNumber.plus("6352", "59"), (6352 + 59)+"" );
		assertEquals(MyBigNumber.plus("8956", "8"), (8956 + 8)+"" );
		assertEquals(MyBigNumber.plus("28878", "6782"), (28878 + 6782)+"" );
		assertEquals(MyBigNumber.plus("96", "61222"), (96 + 61222)+"" );
		assertEquals(MyBigNumber.plus("38877", "57"), (38877 + 57)+"" );
		assertEquals(MyBigNumber.plus("4212", "44"), (4212 + 44)+"" );
		assertEquals(MyBigNumber.plus("6186", "152485"), (6186 + 152485)+"" );
		assertEquals(MyBigNumber.plus("8", "6162211"), (8 + 6162211)+"" );
		assertEquals(MyBigNumber.plus("57", "6"), (57 + 6)+"" );
		assertEquals(MyBigNumber.plus("889", "9582"), (889 + 9582)+"" );
		assertEquals(MyBigNumber.plus("4", "18218"), (4 + 18218)+"" );
		assertEquals(MyBigNumber.plus("3", "2629722"), (3 + 2629722)+"" );
		assertEquals(MyBigNumber.plus("5299", "5"), (5299 + 5)+"" );
		assertEquals(MyBigNumber.plus("69", "4744887"), (69 + 4744887)+"" );
		assertEquals(MyBigNumber.plus("97", "763873"), (97 + 763873)+"" );
		assertEquals(MyBigNumber.plus("69237", "99"), (69237 + 99)+"" );
		assertEquals(MyBigNumber.plus("35", "93481"), (35 + 93481)+"" );
		assertEquals(MyBigNumber.plus("26466", "4745257"), (26466 + 4745257)+"" );
		assertEquals(MyBigNumber.plus("2976", "8684"), (2976 + 8684)+"" );
		assertEquals(MyBigNumber.plus("97747", "34"), (97747 + 34)+"" );
		assertEquals(MyBigNumber.plus("74", "1953"), (74 + 1953)+"" );
		assertEquals(MyBigNumber.plus("45846", "4454996"), (45846 + 4454996)+"" );
		assertEquals(MyBigNumber.plus("65572", "1892612"), (65572 + 1892612)+"" );
		assertEquals(MyBigNumber.plus("534", "59"), (534 + 59)+"" );
		assertEquals(MyBigNumber.plus("288", "4"), (288 + 4)+"" );
		assertEquals(MyBigNumber.plus("3", "8"), (3 + 8)+"" );
		assertEquals(MyBigNumber.plus("89", "6"), (89 + 6)+"" );
		assertEquals(MyBigNumber.plus("58", "285981"), (58 + 285981)+"" );
		assertEquals(MyBigNumber.plus("7", "6323"), (7 + 6323)+"" );
		assertEquals(MyBigNumber.plus("95177", "45"), (95177 + 45)+"" );
		assertEquals(MyBigNumber.plus("955", "26373"), (955 + 26373)+"" );
		assertEquals(MyBigNumber.plus("5", "6446"), (5 + 6446)+"" );
		assertEquals(MyBigNumber.plus("972", "73779"), (972 + 73779)+"" );
		assertEquals(MyBigNumber.plus("1", "392449"), (1 + 392449)+"" );
		assertEquals(MyBigNumber.plus("6444", "5"), (6444 + 5)+"" );
		assertEquals(MyBigNumber.plus("46", "8258"), (46 + 8258)+"" );
		assertEquals(MyBigNumber.plus("3494", "1887"), (3494 + 1887)+"" );
		assertEquals(MyBigNumber.plus("452", "7425"), (452 + 7425)+"" );
		assertEquals(MyBigNumber.plus("1", "8"), (1 + 8)+"" );
		assertEquals(MyBigNumber.plus("4", "73"), (4 + 73)+"" );
		assertEquals(MyBigNumber.plus("38811", "6"), (38811 + 6)+"" );
		assertEquals(MyBigNumber.plus("5", "6126"), (5 + 6126)+"" );
		assertEquals(MyBigNumber.plus("21592", "717338"), (21592 + 717338)+"" );
		assertEquals(MyBigNumber.plus("97184", "14658"), (97184 + 14658)+"" );
		assertEquals(MyBigNumber.plus("76", "89"), (76 + 89)+"" );
		assertEquals(MyBigNumber.plus("17562", "85435"), (17562 + 85435)+"" );
		assertEquals(MyBigNumber.plus("29", "4"), (29 + 4)+"" );
		assertEquals(MyBigNumber.plus("62", "6927691"), (62 + 6927691)+"" );
		assertEquals(MyBigNumber.plus("8292", "3"), (8292 + 3)+"" );
		assertEquals(MyBigNumber.plus("8497", "513519"), (8497 + 513519)+"" );
		assertEquals(MyBigNumber.plus("32614", "34816"), (32614 + 34816)+"" );
		assertEquals(MyBigNumber.plus("14", "314"), (14 + 314)+"" );
		assertEquals(MyBigNumber.plus("557", "2265359"), (557 + 2265359)+"" );
		assertEquals(MyBigNumber.plus("8648", "5344"), (8648 + 5344)+"" );
		assertEquals(MyBigNumber.plus("85418", "454"), (85418 + 454)+"" );
		assertEquals(MyBigNumber.plus("43736", "8294615"), (43736 + 8294615)+"" );
		assertEquals(MyBigNumber.plus("111", "9693"), (111 + 9693)+"" );
		assertEquals(MyBigNumber.plus("67841", "391"), (67841 + 391)+"" );
		assertEquals(MyBigNumber.plus("58725", "73"), (58725 + 73)+"" );
		assertEquals(MyBigNumber.plus("668", "3895"), (668 + 3895)+"" );
		assertEquals(MyBigNumber.plus("7", "66861"), (7 + 66861)+"" );
		assertEquals(MyBigNumber.plus("62241", "444998"), (62241 + 444998)+"" );
		assertEquals(MyBigNumber.plus("4394", "28"), (4394 + 28)+"" );
		assertEquals(MyBigNumber.plus("311", "77881"), (311 + 77881)+"" );
		assertEquals(MyBigNumber.plus("3", "6476"), (3 + 6476)+"" );
		assertEquals(MyBigNumber.plus("4", "3225"), (4 + 3225)+"" );
		assertEquals(MyBigNumber.plus("25", "76"), (25 + 76)+"" );
		assertEquals(MyBigNumber.plus("486", "267"), (486 + 267)+"" );
		assertEquals(MyBigNumber.plus("6547", "645259"), (6547 + 645259)+"" );
		assertEquals(MyBigNumber.plus("67999", "7735795"), (67999 + 7735795)+"" );
		assertEquals(MyBigNumber.plus("7475", "1627"), (7475 + 1627)+"" );
		assertEquals(MyBigNumber.plus("99512", "9662893"), (99512 + 9662893)+"" );
		assertEquals(MyBigNumber.plus("24732", "2979477"), (24732 + 2979477)+"" );
		assertEquals(MyBigNumber.plus("197", "2281"), (197 + 2281)+"" );
		assertEquals(MyBigNumber.plus("88255", "7322763"), (88255 + 7322763)+"" );
		assertEquals(MyBigNumber.plus("2", "3"), (2 + 3)+"" );
		assertEquals(MyBigNumber.plus("82", "7"), (82 + 7)+"" );
		assertEquals(MyBigNumber.plus("85387", "9963"), (85387 + 9963)+"" );
		assertEquals(MyBigNumber.plus("9", "3"), (9 + 3)+"" );
		assertEquals(MyBigNumber.plus("678", "4387924"), (678 + 4387924)+"" );
		assertEquals(MyBigNumber.plus("87", "18443"), (87 + 18443)+"" );
		assertEquals(MyBigNumber.plus("2", "7938"), (2 + 7938)+"" );
		assertEquals(MyBigNumber.plus("95", "3364"), (95 + 3364)+"" );
		assertEquals(MyBigNumber.plus("76", "28147"), (76 + 28147)+"" );
		assertEquals(MyBigNumber.plus("74", "7639697"), (74 + 7639697)+"" );
		assertEquals(MyBigNumber.plus("63546", "664155"), (63546 + 664155)+"" );
		assertEquals(MyBigNumber.plus("1828", "8217889"), (1828 + 8217889)+"" );
		assertEquals(MyBigNumber.plus("5938", "273997"), (5938 + 273997)+"" );
		assertEquals(MyBigNumber.plus("51692", "618855"), (51692 + 618855)+"" );
		assertEquals(MyBigNumber.plus("9", "7"), (9 + 7)+"" );
		assertEquals(MyBigNumber.plus("7618", "3699"), (7618 + 3699)+"" );
		assertEquals(MyBigNumber.plus("3", "84"), (3 + 84)+"" );
		assertEquals(MyBigNumber.plus("5824", "84"), (5824 + 84)+"" );
		assertEquals(MyBigNumber.plus("71", "77"), (71 + 77)+"" );
		assertEquals(MyBigNumber.plus("96", "86992"), (96 + 86992)+"" );
	}

}
