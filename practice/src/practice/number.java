package practice;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�ƾǦ��Z:");
		int math = Integer.parseInt(scanner.nextLine());
		if (math < 1) {
			System.out.print("�榡���~");
		} else {
			System.out.print("�п�J�^�妨�Z:");
		}
		int eng = Integer.parseInt(scanner.nextLine());
		if (math < 1) {
			System.out.print("�榡���~");
		} else {
			int average = (math + eng) / 2;
			System.out.print("������" + average);

		}

	}

}