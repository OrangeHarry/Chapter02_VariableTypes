package ch02_4_consol_in_out;

import java.io.IOException;

public class KeycodeExample {
	public static void main(String[] args) throws IOException {

//     [Ű����κ��� �Էµ� ������ ������ �����ϰ� ����ϱ�]
//		System.in.read();

		int keyCode;// �ƽ�Ű�ڵ�ǥ���� ���ڸ� ���ڷ� �Ҵ�ްڴٴ� �ǹ�

		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);
	}
}
