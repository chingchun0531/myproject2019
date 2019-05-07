package exercise;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Pizza想切幾片??");
			int number = scanner.nextInt();
			if (number == 0) {
				System.out.println("你確定不要切?");
			} else if ((1 <= number && number <= 7) || (9 <= number && number <= 11)
					|| (13 <= number && number <= 15)) {
				System.out.println("數量錯誤");
			}

			else if ((number < 0) || (17 <= number)) {
				System.out.println("超出範圍");
			} else {
				System.out.println("謝謝選購");
			}
		} catch (NumberFormatException e) {
			System.out.println("格式錯誤");
		}
	}

}
