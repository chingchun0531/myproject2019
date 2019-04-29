package practice;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入數學成績:");
		int math = Integer.parseInt(scanner.nextLine());
		if (math < 1) {
			System.out.print("格式錯誤");
		} else {
			System.out.print("請輸入英文成績:");
		}
		int eng = Integer.parseInt(scanner.nextLine());
		if (math < 1) {
			System.out.print("格式錯誤");
		} else {
			int average = (math + eng) / 2;
			System.out.print("平均為" + average);

		}

	}

}