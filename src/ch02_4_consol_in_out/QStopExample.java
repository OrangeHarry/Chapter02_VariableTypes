package ch02_4_consol_in_out;

import java.io.IOException;

public class QStopExample {
	public static void main(String[] args) throws IOException {
		int keyCode;

//		�ݺ���(for....Ƚ���� ���� �ݺ�)(while....���ǿ� ���� �ݺ�)
		while (true) {
			keyCode = System.in.read();
			if (keyCode == 113) {
				break; // ���ڷ� 113�� ������ �ݺ����� �����!!(���⼱ �ҹ��� q��)
			}
			System.out.println("keyCode = " + keyCode);
		}
		System.out.println("����");
	}
}
