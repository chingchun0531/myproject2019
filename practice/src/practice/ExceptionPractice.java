package practice;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int bonus = 200000;
int div = 0;
Scanner scanner = new Scanner(System.in);
System.out.print("多少個人分??");
String number = scanner.nextLine();
try {
int n = Integer.parseInt(number);
div = bonus/n;
System.out.print("每個人分"+div);
	}catch(Exception e) {
		System.out.print("資料錯誤");
	}
	
}
}
