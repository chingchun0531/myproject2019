package practice;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int bonus = 200000;
int div = 0;
Scanner scanner = new Scanner(System.in);
System.out.print("�h�֭ӤH��??");
String number = scanner.nextLine();
try {
int n = Integer.parseInt(number);
div = bonus/n;
System.out.print("�C�ӤH��"+div);
	}catch(Exception e) {
		System.out.print("��ƿ��~");
	}
	
}
}
