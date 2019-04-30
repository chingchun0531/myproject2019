package practice;

import java.util.Scanner;

public class ScoreTester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Please enter English:");
			Score english = new Score(scanner.nextLine());
			System.out.print("Please enter Math:");
			Score math = new Score(scanner.nextLine());
			System.out.println((english.value + math.value) / 2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
}
