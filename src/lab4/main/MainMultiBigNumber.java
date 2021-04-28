package lab4.main;

import lab4.MyBigNumber;
import model.RandomUtils;

public class MainMultiBigNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			String number1 = RandomUtils.randomNumber(5, 2);
			//number1 = "91942";
			String number2 = RandomUtils.randomNumber(2, 1);
			//number2 = "5";
			int num2 = (int) (Math.random() * 8) + 2;
		}
	}
	public static void testMultiOne(String number1,int num2) {
		 System.out.println(String.format("assertEquals(MyBigNumber.multiOne(\"%s\",%s),\"%s\");",number1,num2, MyBigNumber.multiOne(number1, num2)));
		
	}
	public static void testMulti(String number1,String number2) {
		 System.out.println(String.format("assertEquals(MyBigNumber.multi(\"%s\",\"%s\"),\"%s\");",number1,number2, MyBigNumber.multi(number1, number2)));
		 System.out.println(String.format("assertEquals(MyBigNumber.multi(\"%s\",\"%s\"), (%d + %d)+\"\" );",number1,number2, Integer.parseInt(number1),
		 Integer.parseInt(number2)));
		 System.out.println(String.format("assertEquals(MyBigNumber.multi(\"%s\",\"%s\"), (%d + %d)+\"\" );",number1,number2, Integer.parseInt(number1),
				 Integer.parseInt(number2)));

	}

}
