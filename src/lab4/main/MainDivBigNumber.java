package lab4.main;

import lab4.MyBigNumber;
import model.RandomUtils;

public class MainDivBigNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			String number1 = RandomUtils.randomNumber(3, 2);
			//number1 = "91942";
			String number2 = RandomUtils.randomNumber(2, 1);
			//number2 = "5";
			int num2 = (int) (Math.random() * 8) + 2;
			String[] rs = MyBigNumber.div(number1, number2);
//			System.out.println(String.format("assertArrayEquals(MyBigNumber.div(\"%s\",\"%s\"), new String[]{\"%s\",\"%s\"});", number1, number2,
//					rs[0],rs[1]));
			System.out.println(String.format("assertArrayEquals(MyBigNumber.div(\"%s\",\"%s\"), new String[]{\"%s\",\"%s\"});", number1, number2,
					Long.parseLong(number1)/Long.parseLong(number2),Long.parseLong(number1)%Long.parseLong(number2)));

		}
	}

}
