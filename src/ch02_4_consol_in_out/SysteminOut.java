package ch02_4_consol_in_out;

import java.util.Scanner;

public class SysteminOut {
	public static void main(String[] args) {
//		[KeyCodeExample.java]

//		try {
//			System.out.printf("keCode = %d\n", System.in.read()); // read�� �ϳ��� �������� �Է��ص� �ϳ��ۿ� �Է��� �ȵ�
//			System.out.printf("keCode = %d\n", System.in.read()); // 13
//			System.out.printf("keCode = %d\n", System.in.read()); // 10 �� ������ �� ����ġ�� �ڵ����� ������ ���ڿ��� ������ ���´ٰ� ���� �ȴ�.
////			                                        int�� ����
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		[ContinueKeyCodeReadExample.java]

//		while (true) {
//			try {
//				System.out.printf("keCode = %d\n", System.in.read());
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

//		[QStopExample.java]
//		boolean working = true;
//		int keyCode;
//		while (working) {
//			try {
//				keyCode = System.in.read();
//				System.out.printf("keCode = %d\n", keyCode);
//
//				if (keyCode == 'q' || keyCode == 'Q') {// 113�̸� �ƿ��ϴ°ɷ�
//					working = false;
//				}
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("��������");
//	}
//}

//		[ScannerExample.java]
		Scanner scanner = new Scanner(System.in);
		String value = "";
		while (true) {
			value = scanner.nextLine();
			if (value.equals("���ѹα�")) {
				System.out.println("�ݸ޴�~~"); // �� ���ο�� �Է��� ���� �ְ� ����ֳߤ���
			}
			System.out.printf("�Է��Ͻ� ���ڿ���  \"%s\" �Դϴ�.\n", value);
			if (value.equalsIgnoreCase("q")) { // value.equalsIgnoreCase("q") == ��ҹ��� ������ �ʰ� q�� �ԷµǸ� ���߰ڴ�.
				break;
			}
		}
		System.out.println("//////����Ǿ����ϴ�");

		scanner.close(); // �ٳ����� ���ҽ����� �������ִ� �޼ҵ� .close();
	}
}
