package apCompSci;
import java.util.Scanner;

public class romanNumerals {
	public static String romanDigit(int n, String one, String five, String ten) {
		String roman = "";
		if(n == 0) {
			return roman;
		}
		if(n < 4) {
			for(int i = 0; i < n; i++) {
				roman = roman + one;
			}
		}
		else if(n == 4) {
			roman = roman + one + five;
		}
		else if(n > 4 && n < 9) {
			roman = roman + five;
			for(int i = 0; i < n - 5; i++) {
				roman = roman + one;
			}
		}
		else if(n == 9) {
			roman = roman + one + ten;
		}
		else {
			roman = roman + ten;
		}
		return roman;
	}
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to be romanized");
		int num = in.nextInt();
		String romanOnes = romanDigit(num % 10, "I", "V", "X");
		num = num / 10;
		String romanTens = romanDigit(num, "X", "L", "C");
		System.out.println(romanTens + romanOnes);
	}

}
