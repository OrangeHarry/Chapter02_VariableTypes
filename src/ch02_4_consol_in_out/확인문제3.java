package ch02_4_consol_in_out;

import java.util.Scanner;

public class 확인문제3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.이름 : ");
		String name = scanner.nextLine();

		System.out.println("2.주민번호 앞 6자리 : ");
		String idNum = scanner.nextLine();

		System.out.println("3.전화번호 : ");
		String phoneNum = scanner.nextLine();

		System.out.println();

		System.out.println("[입력한 내용]");
		System.out.println("1.이름 : " + name);
		System.out.println("2.주민번호 앞 6자리 : " + idNum);
		System.out.println("3.전화번호 : " + phoneNum);

	}
}
