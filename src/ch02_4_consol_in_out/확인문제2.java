package ch02_4_consol_in_out;

import java.util.Scanner;

public class Ȯ�ι���2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ù��° �� : ");
		String strNum1 = scanner.nextLine();

		System.out.println("�ι�° �� : ");
		String strNum2 = scanner.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("������� = " + result);
	}
}
