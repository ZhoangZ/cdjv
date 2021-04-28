package tuan2;

public class MyStringToken {
	private final String input;
	private final String deliLimit;
	private int pointer;
	public MyStringToken(String input, String deli) {
		this.input=input;
		this.deliLimit=deli;
	}
	/**
	 * @return check has Token remain
	 */
	public boolean nextToken() {
		int pointerTmp= pointer;
		String rs="";
		for(;pointerTmp<input.length();pointerTmp++) {
			if(match(input, deliLimit, pointerTmp)) {
				
				if(rs.length()!=0&&pointerTmp==input.length())return true;
			}else {
				rs+=input.charAt(pointerTmp);
			}
		}
		if(rs.length()!=0)return true;else return false;
	}
	
	/**
	 * @return number Token remain
	 */
	public int countToken() {
		int pointerTmp= pointer;
		int count=0;
		String rs="";
		for(;pointerTmp<input.length();pointerTmp++) {
			if(match(input, deliLimit, pointerTmp)) {
				if(deliLimit.charAt(0)=='['&&deliLimit.charAt(deliLimit.length()-1)==']') {
					pointerTmp+=1-1;
				}else pointerTmp+=deliLimit.length()-1;
				if(pointerTmp!=input.length()&&pointerTmp!=0) {
					count++;
					rs="";
				}
				
				continue;
			}else {
				rs+=input.charAt(pointerTmp);
				if(deliLimit.charAt(0)=='['&&deliLimit.charAt(deliLimit.length()-1)==']') {
					if(input.length()-1==pointerTmp) {//Check last token
						count++;				
					}
				}else
					if(input.length()-deliLimit.length()==pointerTmp) {//Check last token
					count++;				
				}
				
			}
		}
		return count;
	}
	/**
	 * @return Take Token next
	 */
	public String token() {
		if(pointer>=input.length())return null;
		//System.out.println(pointer);
		String rs="";
		for(;pointer<input.length();pointer++) {
			//System.out.println(pointer+":"+match(input, deli, pointer));
			if(match(input, deliLimit, pointer)) {
				if(deliLimit.charAt(0)=='['&&deliLimit.charAt(deliLimit.length()-1)==']') {
					
					if(pointer==0&&rs.length()==0) {
						pointer+=1-1;
						continue;
					}
					pointer+=1;
					
				}else {					
					if(pointer==0&&rs.length()==0) {
						pointer+=deliLimit.length()-1;
						continue;
					}
					pointer+=deliLimit.length();
				}
				break;
				
			}else {
				rs+=input.charAt(pointer);
			}
		}
		
		return rs;
	}
	public static boolean match(String input, String deli, int index) {
		if(deli.charAt(0)=='['&&deli.charAt(deli.length()-1)==']') {
			for(int i=1; i<deli.length()-1;i++) {
				if(deli.charAt(i)==input.charAt(index))return true;
			}
			return false;
		}else {
			
			if(input.length()-index<deli.length())return false;
			for(int  i=index;i-index<deli.length();i++) {
				if(input.charAt(i)!=deli.charAt(i-index))return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		String input="Trường đại học Nông Lâm";
		String deliLimit="[Tm]";
		MyStringToken myStringToken = new MyStringToken(input, deliLimit);
		System.out.println("Count Token: "+myStringToken.countToken());
		while(myStringToken.nextToken()) {
			System.out.println("Token: "+myStringToken.token());
		}
	}

}
