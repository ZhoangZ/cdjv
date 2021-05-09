package lab4.main;

import lab4.MyBigNumber;
import model.RandomUtils;

public class MainSubBigNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 250; i++) {
			String number1 = RandomUtils.randomNumber(5, 2);
			number1 = "91942";
			String number2 = RandomUtils.randomNumber(2, 1);
			number2 = "5";
			int num2 = (int) (Math.random() * 8) + 2;

			// SUB
			// Test Normal
			// System.out.println(String.format("assertEquals(MyBigNumber.plus(\"%s\",\"%s\"), \"%s\");",number1,number2, MyBigNumber.sub(number1, number2)));
			// Test Mini
			 System.out.println(String.format("assertEquals(MyBigNumber.sub(\"%s\",\"%s\"), (%d - %d)+\"\" );",number1,number2, Integer.parseInt(number1),
			 Integer.parseInt(number2)));


		}
	}

}
