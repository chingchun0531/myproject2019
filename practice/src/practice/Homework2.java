package practice;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("請輸入數學成績:");
try {
int math = Integer.parseInt(scanner.nextLine());	
System.out.print("請輸入英文成績:");
int eng = Integer.parseInt(scanner.nextLine());
int average = (math+eng)/2;
System.out.print("平均為"+average);
}catch(Exception e) {
	System.out.print("格式錯誤");
}

	}

}
