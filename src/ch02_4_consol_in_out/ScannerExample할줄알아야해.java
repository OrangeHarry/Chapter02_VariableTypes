package ch02_4_consol_in_out;

import java.util.Scanner;

public class ScannerExample���پ˾ƾ��� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ctrl + shift + O�� ������ �� ���忡 ���� import�� �ִ°��� �������ش�(���ϳ�)
		String inputData;

		while (true) {
			inputData = scanner.nextLine(); //�Է��� ���� ���ڿ��� �޾Ƶ��δ�
			System.out.println("�Էµ� ���ڿ� = \"" + inputData + "\"");// �ؿ����� ���� ������ �ۼ��Ǵ� ����̳�
			System.out.println("�Էµ� ���ڿ� = [" + inputData + "]");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("����");
	}
}
