package apCompSci;
import java.util.Scanner;

public class timeEnglish {
	public static String getTimeName(int hours, int minutes) {
			String timeName;
			String[] numWords = {
				"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"
			};
			if(minutes == 0) {
				timeName = numWords[hours] + " o' clock";
			}
			else if(minutes == 30) {
				timeName = "half past " + numWords[hours];
			}
			else if(minutes == 15) {
				timeName = "quarter after " + numWords[hours];
			}
			else if(minutes == 45) {
				if(hours < 12) {
				timeName = "quarter till " + numWords[hours + 1];
				}
				else {
					timeName = "quarter till " + numWords[1];
				}
			}
			else {
				timeName = minutes + " minutes past " + numWords[hours];
			}
			return timeName;
	}
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the hour: ");
		int hour = in.nextInt();
		System.out.print("Enter the minutes: ");
		int min = in.nextInt();
		System.out.println(getTimeName(hour, min));
	}

}
