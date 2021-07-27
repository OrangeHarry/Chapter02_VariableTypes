package ch02_4_consol_in_out;

import java.util.Scanner;

public class ScannerExample할줄알아야해 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ctrl + shift + O를 누르면 이 문장에 대한 import를 넣는것을 선언해준다(편하네)
		String inputData;

		while (true) {
			inputData = scanner.nextLine(); //입력한 값을 문자열로 받아들인댜
			System.out.println("입력된 문자열 = \"" + inputData + "\"");// 밑에꺼랑 같은 이유로 작성되는 방법이네
			System.out.println("입력된 문자열 = [" + inputData + "]");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}
}
