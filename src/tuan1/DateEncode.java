package tuan1;

public class DateEncode {
	public static int encodeDate(int day, int month, int year) {
		return day|month<<5|year<<(9);
	}
	public static String decodeDate(int encodeDate) {	
		int year=encodeDate>>(9);
		int month=(encodeDate&(15<<5))>>5;		
		int day=encodeDate&31;
		//System.out.println(Integer.toBinaryString(month));
		return String.format("Year: %d, month: %d, day: %d", year,month,day);

	}
	public static void main(String[] args) {
		int date=encodeDate(1,1,2000);
		String decodeDate= decodeDate(date);
		System.out.println(decodeDate);
		System.out.println(date);
		System.out.println(Integer.toBinaryString(date));
	}

}
