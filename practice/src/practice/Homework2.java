
package practice;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("�п�J�ƾǦ��Z:");
			int math = Integer.parseInt(scanner.nextLine());
			System.out.print("�п�J�^�妨�Z:");
			int eng = Integer.parseInt(scanner.nextLine());
			int average = (math + eng) / 2;
			System.out.print("������" + average);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.print("�榡���~");
		}

	}

}