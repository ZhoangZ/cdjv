package lab3;
import java.util.Scanner;

public class StringEncode {
	private int indexInput;
	private int indexPassword;
	private String input;
	private String password;
	private boolean flag=false;
	private String rs;
	public StringEncode(String input, String password) {
		this.input=input;
		this.password=password;
	}
	public StringEncode(String input, int password) {
		this.input=input;
		this.password=""+password;
	}
	public String encode() {
		if(rs!=null)return String.format("*%s*", rs);
		rs="";
		while(!flag) {
			int number = nextPasswordInt();
			String tmp="";
			for(int i=0;i<number;i++) {
				tmp=nextInputChar()+tmp;
			}
			rs+=tmp;
		}
		return String.format("*%s*", rs);
	}
	public char nextInputChar() {
		if(indexInput<input.length()) {
			if(indexInput==input.length()-1)this.flag=true;
			return this.input.charAt(indexInput++);
		}
		//this.flag=true;
		return ' ';
	}
	public int nextPasswordInt() {
		if(this.indexPassword >= password.length()) {
			this.indexPassword=0;
		}
		return this.password.charAt(indexPassword++)-'0';
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < count; i++) {
			String input = scanner.nextLine();
			String password = scanner.nextLine();
			StringEncode stringEncode= new StringEncode(input,password);
			System.out.println(stringEncode.encode());
		}
		scanner.close();
	}

}
