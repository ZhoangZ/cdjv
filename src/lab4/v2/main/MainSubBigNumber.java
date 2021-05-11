package lab4.v2.main;

import lab4.MyBigNumber;
import model.RandomUtils;

public class MainSubBigNumber {
	public static void main(String[] args) {
		System.out.println("////Declare");
		System.out.println(String.format("MyBigNumber bigNumber = null;"));
		System.out.println(String.format("MyBigNumber rs = null;"));
		System.out.println("////End Declare");
		for (int i = 0; i < 100; i++) {
			String number1 = RandomUtils.randomNumber(5, 2);
			//number1 = "91942";
			String number2 = RandomUtils.randomNumber(2, 1);
			//number2 = "5";
			int num2 = (int) (Math.random() * 8) + 2;
			// PLUS
			//System.out.println(String.format("assertEquals(MyBigNumber.plus(\"%s\",\"%s\"),\"%s\");",number1,number2, MyBigNumber.plus(number1, number2)));
			System.out.println("////Start UseCase");
			System.out.println(String.format("bigNumber = new MyBigNumber(\"%s\");",number1));
			System.out.println(String.format("rs = bigNumber.sub(new MyBigNumber(\"%s\"));",number2));
			System.out.println(String.format("assertEquals(rs.toString(), \"%s\");",Integer.parseInt(number1)-Integer.parseInt(number2)));
			System.out.println("////End UseCase");
			

		}
	}

}
