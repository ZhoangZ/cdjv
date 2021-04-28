package lab4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4.MyBigNumber;

public class TestSubBigNumber {

	@Test
	public void test() {
		assertEquals(MyBigNumber.sub("2444", "945619"), "-943175");
	}
	@Test
	public void testSubMini() {
		assertEquals(MyBigNumber.sub("54", "945799"), (54 - 945799)+"" );
		assertEquals(MyBigNumber.sub("67", "78"), (67 - 78)+"" );
		assertEquals(MyBigNumber.sub("5166", "5432428"), (5166 - 5432428)+"" );
		assertEquals(MyBigNumber.sub("18833", "116"), (18833 - 116)+"" );
		assertEquals(MyBigNumber.sub("55", "79"), (55 - 79)+"" );
		assertEquals(MyBigNumber.sub("93948", "72473"), (93948 - 72473)+"" );
		assertEquals(MyBigNumber.sub("49721", "66137"), (49721 - 66137)+"" );
		assertEquals(MyBigNumber.sub("8748", "9917121"), (8748 - 9917121)+"" );
		assertEquals(MyBigNumber.sub("37795", "99144"), (37795 - 99144)+"" );
		assertEquals(MyBigNumber.sub("17", "355"), (17 - 355)+"" );
		assertEquals(MyBigNumber.sub("4291", "49"), (4291 - 49)+"" );
		assertEquals(MyBigNumber.sub("7112", "6721517"), (7112 - 6721517)+"" );
		assertEquals(MyBigNumber.sub("396", "4438"), (396 - 4438)+"" );
		assertEquals(MyBigNumber.sub("53", "86"), (53 - 86)+"" );
		assertEquals(MyBigNumber.sub("7695", "6391"), (7695 - 6391)+"" );
		assertEquals(MyBigNumber.sub("9788", "1725452"), (9788 - 1725452)+"" );
		assertEquals(MyBigNumber.sub("65", "8539925"), (65 - 8539925)+"" );
		assertEquals(MyBigNumber.sub("8", "6356"), (8 - 6356)+"" );
		assertEquals(MyBigNumber.sub("4142", "53"), (4142 - 53)+"" );
		assertEquals(MyBigNumber.sub("387", "53371"), (387 - 53371)+"" );
		assertEquals(MyBigNumber.sub("313", "78"), (313 - 78)+"" );
		assertEquals(MyBigNumber.sub("1937", "97"), (1937 - 97)+"" );
		assertEquals(MyBigNumber.sub("57", "2"), (57 - 2)+"" );
		assertEquals(MyBigNumber.sub("9968", "35"), (9968 - 35)+"" );
		assertEquals(MyBigNumber.sub("123", "546614"), (123 - 546614)+"" );
		assertEquals(MyBigNumber.sub("7", "77"), (7 - 77)+"" );
		assertEquals(MyBigNumber.sub("494", "463147"), (494 - 463147)+"" );
		assertEquals(MyBigNumber.sub("9262", "896165"), (9262 - 896165)+"" );
		assertEquals(MyBigNumber.sub("1", "714"), (1 - 714)+"" );
		assertEquals(MyBigNumber.sub("2446", "12"), (2446 - 12)+"" );
		assertEquals(MyBigNumber.sub("6245", "75"), (6245 - 75)+"" );
		assertEquals(MyBigNumber.sub("979", "523854"), (979 - 523854)+"" );
		assertEquals(MyBigNumber.sub("43", "6254"), (43 - 6254)+"" );
		assertEquals(MyBigNumber.sub("4", "19"), (4 - 19)+"" );
		assertEquals(MyBigNumber.sub("6538", "418"), (6538 - 418)+"" );
		assertEquals(MyBigNumber.sub("777", "7688"), (777 - 7688)+"" );
		assertEquals(MyBigNumber.sub("5", "576159"), (5 - 576159)+"" );
		assertEquals(MyBigNumber.sub("798", "5889"), (798 - 5889)+"" );
		assertEquals(MyBigNumber.sub("3", "71"), (3 - 71)+"" );
		assertEquals(MyBigNumber.sub("3", "7256916"), (3 - 7256916)+"" );
		assertEquals(MyBigNumber.sub("4515", "4488"), (4515 - 4488)+"" );
		assertEquals(MyBigNumber.sub("229", "3354388"), (229 - 3354388)+"" );
		assertEquals(MyBigNumber.sub("8832", "527964"), (8832 - 527964)+"" );
		assertEquals(MyBigNumber.sub("6517", "9"), (6517 - 9)+"" );
		assertEquals(MyBigNumber.sub("21855", "3247"), (21855 - 3247)+"" );
		assertEquals(MyBigNumber.sub("7", "4185"), (7 - 4185)+"" );
		assertEquals(MyBigNumber.sub("15243", "824"), (15243 - 824)+"" );
		assertEquals(MyBigNumber.sub("4229", "78454"), (4229 - 78454)+"" );
		assertEquals(MyBigNumber.sub("28926", "973825"), (28926 - 973825)+"" );
		assertEquals(MyBigNumber.sub("47837", "787133"), (47837 - 787133)+"" );
		assertEquals(MyBigNumber.sub("5874", "29678"), (5874 - 29678)+"" );
		assertEquals(MyBigNumber.sub("5", "46"), (5 - 46)+"" );
		assertEquals(MyBigNumber.sub("3", "5"), (3 - 5)+"" );
		assertEquals(MyBigNumber.sub("35", "76"), (35 - 76)+"" );
		assertEquals(MyBigNumber.sub("61", "176"), (61 - 176)+"" );
		assertEquals(MyBigNumber.sub("1424", "99258"), (1424 - 99258)+"" );
		assertEquals(MyBigNumber.sub("73834", "61262"), (73834 - 61262)+"" );
		assertEquals(MyBigNumber.sub("39563", "517912"), (39563 - 517912)+"" );
		assertEquals(MyBigNumber.sub("6", "838"), (6 - 838)+"" );
		assertEquals(MyBigNumber.sub("6939", "9937"), (6939 - 9937)+"" );
		assertEquals(MyBigNumber.sub("14", "58"), (14 - 58)+"" );
		assertEquals(MyBigNumber.sub("2823", "1"), (2823 - 1)+"" );
		assertEquals(MyBigNumber.sub("2", "5498156"), (2 - 5498156)+"" );
		assertEquals(MyBigNumber.sub("24", "4822"), (24 - 4822)+"" );
		assertEquals(MyBigNumber.sub("43", "62917"), (43 - 62917)+"" );
		assertEquals(MyBigNumber.sub("294", "315849"), (294 - 315849)+"" );
		assertEquals(MyBigNumber.sub("1852", "937472"), (1852 - 937472)+"" );
		assertEquals(MyBigNumber.sub("6", "8"), (6 - 8)+"" );
		assertEquals(MyBigNumber.sub("8525", "5"), (8525 - 5)+"" );
		assertEquals(MyBigNumber.sub("163", "4654777"), (163 - 4654777)+"" );
		assertEquals(MyBigNumber.sub("3", "49"), (3 - 49)+"" );
	}

}