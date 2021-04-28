package model;

import lab3.Encode;
import lab3.StringEncode;

public class RandomUtils {
	public static String randomString_az() {
		int length= 1+(int)(Math.random()*100);
		String rs="";
		for(int i=0;i<length;i++) {
			char c = (char)('a' + (int) (Math.random()*('z'-'a')));
			rs+=c;
		}
		return rs;
	}
	public static String randomNumber(int maxlength,int minlength) {
		int length= (int)(Math.random()*(maxlength-minlength+1))+minlength;
		String rs="";
		for(int i=0;i<length;i++) {
			char c = (char)('1' + (int) (Math.random()*('9'-'0')));
			//c+=1;
			rs+=c;
		}
		return rs;
	}
	public static void main(String[] args) {
		while(true) {
			String input= randomString_az();
			String password= randomNumber(5,2);
			if(password.length()==5)return;
			System.out.println(String.format("input: %s\npassword: %s", input,password));
			StringEncode stringEncode= new StringEncode(input, password);
			String hoang=stringEncode.encode();
			Encode encode= new Encode(input, password);
			String sang=encode.result();
			if(hoang.compareTo(sang)!=0) {
				System.out.println(String.format("Failure: \n%s\n%s", input, password));
				break;
			}
		}
		
	}

}
