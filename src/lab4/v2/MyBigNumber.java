package lab4.v2;

public class MyBigNumber {
	private String value;
	
	public MyBigNumber(String value) {
		super();
		this.value = value;
		delete0();
	}
	@Override
	public String toString() {
		this.delete0();
		return this.value;
	}
	public MyBigNumber[] div(MyBigNumber divisor) {
		this.delete0();
		divisor.delete0();
		if (divisor.compare(new MyBigNumber("1")) == 0)
			return new MyBigNumber[] {this,new MyBigNumber("0")};
		boolean flagStop=false;
		if (this.compare(divisor) >= 0) {
//			if (compare(dividend, divisor) >= 0) {
			MyBigNumber remander = new MyBigNumber(this.value);
			MyBigNumber result =new MyBigNumber("0");
			int lengthTmp=divisor.value.length()-1;
			while (!flagStop) {
				if(lengthTmp+1>remander.value.length()) {
					break;
				}
				String tmp = remander.value.substring(0, lengthTmp+1);
				int compareFlag = compare(tmp, divisor.value);
				if (compareFlag == 0) {
					result.value += "1";
					remander.value = remander.value.substring(tmp.length());
					if(remander.compare( divisor)<0) {
						result.value+='0';
						if(remander.compare(new MyBigNumber("0"))==0||remander.value=="") {
							result.value=result.value.substring(0, result.value.length()-1);
						}
						break;
					}
					tmp = remander.value.substring(0, divisor.value.length());
					//continue;
				} else if (compareFlag == -1) {
				}
				boolean flag2=false;
				for (int i = 9; i >= 0; i--) {
					MyBigNumber tmp2 = divisor.multiOne( i);
					MyBigNumber mtmp=new MyBigNumber(tmp);
					compareFlag = mtmp.compare( tmp2);
					if (compareFlag >= 0) {
						result.value += i;
						MyBigNumber t2 = mtmp.sub(tmp2);
						remander.value = t2.value + remander.value.substring(tmp.length());
						lengthTmp=t2.value.length();
						flag2=true;
						break;
					} 
					
				}
				if(!flag2) {
					result.value += '0';
					flag2=false;
					if(remander.compare(divisor)<=0) {
						flagStop=true;
					}
					if(remander.compare(new MyBigNumber("0"))==0||remander.value== "") {
						result.value=result.value.substring(0, result.value.length()-1);
					}
				}
			}
			if(remander.value.length()==0) remander.value="0";
			remander.delete0();
			return new MyBigNumber[] {result,remander};
		} else {
			return new MyBigNumber[] {new MyBigNumber("0"),this};
		}
	}
//	public static String[] div(String dividend, String divisor) {
//		dividend = delete0(dividend);
//		divisor = delete0(divisor);
//		if (compare(divisor, "1") == 0)
//			return new String[] {dividend,""+0};
//		boolean flagStop=false;
//		if (compare(dividend, divisor) >= 0) {
//			String remander = dividend;
//			String result = "";
//			int lengthTmp=divisor.length()-1;
//			while (!flagStop) {
//				if(lengthTmp+1>remander.length()) {
//					break;
//				}
//				String tmp = remander.substring(0, lengthTmp+1);
//				int compareFlag = compare(tmp, divisor);
//				if (compareFlag == 0) {
//					result += "1";
//					remander = remander.substring(tmp.length());
//					if(compare(remander, divisor)<0) {
//						result+='0';
//						if(compare(remander, "0")==0||compare(remander, "")==0) {
//							result=result.substring(0, result.length()-1);
//						}
//						break;
//					}
//					tmp = remander.substring(0, divisor.length());
//					//continue;
//				} else if (compareFlag == -1) {
//				}
//				boolean flag2=false;
//				for (int i = 9; i >= 0; i--) {
//					String tmp2 = multiOne(divisor, i);
//					compareFlag = compare(tmp, tmp2);
//					if (compareFlag >= 0) {
//						result += i;
//						String t2 = sub(tmp, tmp2);
//						remander = t2 + remander.substring(tmp.length());
//						lengthTmp=t2.length();
//						flag2=true;
//						break;
//					} 
//					
//				}
//				if(!flag2) {
//					result += '0';
//					flag2=false;
//					if(compare(remander, divisor)<=0) {
//						flagStop=true;
//					}
//					if(compare(remander, "0")==0||compare(remander, "")==0) {
//						result=result.substring(0, result.length()-1);
//					}
//				}
//			}
//			if(remander.length()==0)remander="0";
//			return new String[] {delete0(result),""+remander};
//		} else {
//			return new String[] {"0",dividend};
//		}
//
//	}
	public MyBigNumber plus(MyBigNumber mnumber2) {
		this.delete0();
		String number1 = this.value;
		mnumber2.delete0();
		String number2 = mnumber2.value;
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
			MyBigNumber mrs= new MyBigNumber(result);
			mrs.delete0();
			return mrs;
		} else {
			return mnumber2.plus(this);
		}

	}
	
	public int compare( MyBigNumber mnumber2) {
		this.delete0();
		String number1 = this.value;
		mnumber2.delete0();
		String number2 = mnumber2.value;
	
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

	public MyBigNumber multi(MyBigNumber mnumber2) {
		this.delete0();
		mnumber2.delete0();
		String number2 = mnumber2.value;
		int indexNumber2 = number2.length() - 1;
		MyBigNumber result = new MyBigNumber("0");
		//String result = "";
		String zeroAdd = "";
		for (; indexNumber2 >= 0; indexNumber2--, zeroAdd += '0') {
			int tmpOneNumber2 = number2.charAt(indexNumber2) - '0';
			MyBigNumber tmpResult = this.multiOne(tmpOneNumber2);
//			String tmpResult = multiOne(number1, tmpOneNumber2);
			tmpResult.value+=zeroAdd;
			result = result.plus(tmpResult);
//			result = plus(tmpResult + zeroAdd, result);
		}
		result.delete0();
		return result;
	}
	public MyBigNumber multiOne(int number2) {
		String number1 = this.value;
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

		return new MyBigNumber(result);
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

	public MyBigNumber sub(MyBigNumber mnumber2) {
		this.delete0();
		String number1 = this.value;
		mnumber2.delete0();
		String number2 = mnumber2.value;
		if (this.compare(mnumber2)==0) return new MyBigNumber("0");
		if (this.compare(mnumber2)>0) {
			number1 = add0(number1);
			//number2 = add0(number2);
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
						MyBigNumber mrs= new MyBigNumber(result);
						mrs.value='-'+mrs.value;
						return mrs;
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
			MyBigNumber mrs= new MyBigNumber(result);
			mrs.delete0();
			return mrs;
		} else {
			MyBigNumber rstmp = mnumber2.sub(this);
			rstmp.value="-"+rstmp.value;
			return rstmp ;
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
	public void delete0() {
		String rs = "";
		boolean delete = true;
		String number=this.value;
		for (int i = 0; i < number.length(); i++) {
			char tmp = number.charAt(i);
			if (tmp == '0' && delete) {
				continue;
			}
			delete = false;
			rs += tmp;
		}
		if(rs=="") {
			this.value="0";
			//return;
		}else
		this.value=rs;
	}

	public static String add0(String number) {

		return '0' + number;
	}

}
