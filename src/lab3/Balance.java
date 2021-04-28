package lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Balance {
	private String input;

	public Balance(String input) {
		this.input = input;
	}

	public int compute() throws Exception {
		if (input == null)
			return 0;
		if (input.matches("[0-9]+")) {
			return Integer.parseInt(input);
		}
		Pattern pattern = Pattern.compile("^([0-9]+) +([0-9]+) +([+-/*])$");
		Matcher matcher = pattern.matcher(this.input);
		if (matcher.find()) {
			switch (matcher.group(3)) {
			case "+":
				return Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(2));
			case "-":
				return Integer.parseInt(matcher.group(1)) - Integer.parseInt(matcher.group(2));
			case "*":
				return Integer.parseInt(matcher.group(1)) * Integer.parseInt(matcher.group(2));
			case "/":
				return Integer.parseInt(matcher.group(1)) / Integer.parseInt(matcher.group(2));

			default:
				break;
			}
			throw new Exception("Syntax Error");
			// return 0;
		} else {
			pattern = Pattern.compile("(.*)(^| +)([0-9]+ +[0-9]+ +[+-/*])(.*)$");
			matcher = pattern.matcher(this.input);
			if (matcher.find()) {
				Balance preBasicBalance = new Balance(matcher.group(3));
				String equivalentInput = matcher.group(1) + matcher.group(2) + preBasicBalance.compute()
						+ matcher.group(4);
				Balance equivalentBalance = new Balance(equivalentInput);
				return equivalentBalance.compute();
			}
			throw new Exception("Syntax Error");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		//System.out.println(count);
		for (int i = 0; i < count; i++) {
			String input = scanner.nextLine();
			//String password = scanner.nextLine();
			Balance balance= new Balance(input);
			try {
				System.out.println(balance.compute());
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		scanner.close();
	}

}
