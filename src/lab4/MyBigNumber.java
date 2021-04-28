package lab4;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MyBigNumber {
	@Test
	public  void bug() {
		assertArrayEquals(MyBigNumber.div("66","3"), new String[]{"22","0"});

	}
	public static String[] div(String dividend, String divisor) {
		dividend = delete0(dividend);
		divisor = delete0(divisor);
		if (compare(divisor, "1") == 0)
			return new String[] {dividend,""+0};
		boolean flagStop=false;
		if (compare(dividend, divisor) >= 0) {
			String remander = dividend;
			String result = "";
			int lengthTmp=divisor.length()-1;
			while (!flagStop) {
				if(lengthTmp+1>remander.length()) {
					break;
				}
				String tmp = remander.substring(0, lengthTmp+1);
				int compareFlag = compare(tmp, divisor);
				if (compareFlag == 0) {
					result += "1";
					remander = remander.substring(tmp.length());
					if(compare(remander, divisor)<0) {
						result+='0';
						break;
					}
					tmp = remander.substring(0, divisor.length());
					//continue;
				} else if (compareFlag == -1) {
				}
				boolean flag2=false;
				for (int i = 9; i >= 0; i--) {
					String tmp2 = multiOne(divisor, i);
					compareFlag = compare(tmp, tmp2);
					if (compareFlag >= 0) {
						result += i;
						String t2 = sub(tmp, tmp2);
						remander = t2 + remander.substring(tmp.length());
						lengthTmp=t2.length();
						flag2=true;
						break;
					} 
					
				}
				if(!flag2) {
					result += '0';
					flag2=false;
					if(compare(remander, divisor)<=0) {
						flagStop=true;
					}
				}
			}
			if(remander.length()==0)remander="0";
			return new String[] {delete0(result),""+remander};
		} else {
			return new String[] {"0",dividend};
		}

	}

	public static String plus(String number1, String number2) {
		number1 = delete0(number1);
		number2 = delete0(number2);
		if (number1.length() >= number2.length()) {
			number1 = add0(number1);
			int indexNumber1 = number1.length() - 1;
			int indexNumber2 = number2.length() - 1;
			boolean memory = false;
			String result = "";
			for (; indexNumber2 >= 0; indexNumber2--, indexNumber1--) {
				int tmpOneNumber1 = number1.charAt(indexNumber1) - '0';
				int tmpOneNumber2 = number2.charAt(indexNumber2) - '0';
				if (memory) {
					memory = false;
					tmpOneNumber1 += 1;
				}
				int tmpResult = tmpOneNumber1 + tmpOneNumber2;
				// System.out.println("tmpResult"+tmpResult);
				if (tmpResult >= 10) {
					memory = true;
					tmpResult -= 10;
				}
				result = tmpResult + result;
				// System.out.println("result"+result);
			}
			if (!memory) {
				result = number1.substring(0, number1.length() - number2.length()) + result;
			}

			else {
				while (memory) {
					int tmpOneNumber1 = number1.charAt(indexNumber1) - '0';
					tmpOneNumber1 += 1;
					memory = false;
					if (tmpOneNumber1 >= 10) {
						memory = true;
						tmpOneNumber1 -= 10;
					}
					result = tmpOneNumber1 + result;
					indexNumber1--;
					// System.out.println(tmpOneNumber1);
				}
				indexNumber1++;
				if (indexNumber1 >= 0)
					result = number1.substring(0, indexNumber1) + result;
			}

			return delete0(result);
		} else {
			return plus(number2, number1);
		}

	}

	public static int compare(String number1, String number2) {
		number1 = delete0(number1);
		number2 = delete0(number2);
		if (number1.length() > number2.length()) {
			return 1;
		}
		if (number1.length() < number2.length()) {
			return -1;
		}
		if (number1.length() == number2.length()) {
			for (int i = 0; i < number1.length(); i++) {
				int tmpOneNumber1 = number1.charAt(i) - '0';
				int tmpOneNumber2 = number2.charAt(i) - '0';
				if (tmpOneNumber1 > tmpOneNumber2) {
					return 1;
				}
				if (tmpOneNumber1 < tmpOneNumber2) {
					return -1;
				}

			}
		}
		return 0;
	}

	public static String multi(String number1, String number2) {
		number1 = delete0(number1);
		number2 = delete0(number2);

		int indexNumber2 = number2.length() - 1;
		String result = "";
		String zeroAdd = "";
		for (; indexNumber2 >= 0; indexNumber2--, zeroAdd += '0') {
			int tmpOneNumber2 = number2.charAt(indexNumber2) - '0';
			String tmpResult = multiOne(number1, tmpOneNumber2);
			result = plus(tmpResult + zeroAdd, result);
		}

		return delete0(result);
	}

	public static String multiOne(String number1, int number2) {
		number1 = delete0(number1);
		if (number2 < 0 || number2 > 9) {
			System.out.println("Not one letter");
			return null;
		}
		number1 = add0(number1);
		int indexNumber1 = number1.length() - 1;
		int memory = 0;
		String result = "";
		for (; indexNumber1 >= 0; indexNumber1--) {
			int tmpOneNumber1 = number1.charAt(indexNumber1) - '0';
			int tmpResult = tmpOneNumber1 * number2;
			if (memory != 0) {
				tmpResult += memory;
				memory = 0;
			}
			if (tmpResult >= 10) {
				String tmp = String.valueOf(tmpResult);
				memory = tmp.charAt(0) - '0';
				tmpResult = tmp.charAt(1) - '0';
			}
			result = tmpResult + result;
		}

		return delete0(result);
	}

	public static String sub(String number1, String number2) {
		number1 = delete0(number1);
		number2 = delete0(number2);
		if (number1.length() > number2.length()
				|| (number1.charAt(0) >= number2.charAt(0) && number1.length() == number2.length())) {
			number1 = add0(number1);
			int indexNumber1 = number1.length() - 1;
			int indexNumber2 = number2.length() - 1;
			boolean memory = false;
			String result = "";
			for (; indexNumber2 >= 0; indexNumber2--, indexNumber1--) {
				int tmpOneNumber1 = number1.charAt(indexNumber1) - '0';
				int tmpOneNumber2 = number2.charAt(indexNumber2) - '0';
				if (memory) {
					memory = false;
					tmpOneNumber1 -= 1;
				}
				int tmpResult = tmpOneNumber1 - tmpOneNumber2;
				// System.out.println("tmpResult"+tmpResult);
				if (tmpResult < 0) {
					memory = true;
					tmpResult += 10;
				}
				result = tmpResult + result;
				// System.out.println("result"+result);
			}
			if (!memory) {
				result = number1.substring(0, number1.length() - number2.length()) + result;
			}

			else {

				while (memory) {
					if (indexNumber1 < 0 && memory) {
						return '-' + delete0(result);
					}
					int tmpOneNumber1 = number1.charAt(indexNumber1) - '0';
					tmpOneNumber1 -= 1;
					memory = false;
					if (tmpOneNumber1 < 0) {
						memory = true;
						tmpOneNumber1 += 10;
					}
					result = tmpOneNumber1 + result;
					indexNumber1--;
					// System.out.println(tmpOneNumber1);
				}
				indexNumber1++;
				if (indexNumber1 >= 0)
					result = number1.substring(0, indexNumber1) + result;
			}

			return delete0(result);
		} else {
			return "-" + sub(number2, number1);
		}

	}

	public static String delete0(String number) {
		String rs = "";
		boolean delete = true;
		for (int i = 0; i < number.length(); i++) {
			char tmp = number.charAt(i);
			if (tmp == '0' && delete) {
				continue;
			}
			delete = false;
			rs += tmp;
		}
		return rs;
	}

	public static String add0(String number) {

		return '0' + number;
	}

}
