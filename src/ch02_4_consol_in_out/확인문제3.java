package ch02_4_consol_in_out;

import java.util.Scanner;

public class Ȯ�ι���3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.�̸� : ");
		String name = scanner.nextLine();

		System.out.println("2.�ֹι�ȣ �� 6�ڸ� : ");
		String idNum = scanner.nextLine();

		System.out.println("3.��ȭ��ȣ : ");
		String phoneNum = scanner.nextLine();

		System.out.println();

		System.out.println("[�Է��� ����]");
		System.out.println("1.�̸� : " + name);
		System.out.println("2.�ֹι�ȣ �� 6�ڸ� : " + idNum);
		System.out.println("3.��ȭ��ȣ : " + phoneNum);

	}
}
