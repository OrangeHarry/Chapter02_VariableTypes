package ch02_4_consol_in_out;

import java.util.Scanner;

public class SysteminOut {
	public static void main(String[] args) {
//		[KeyCodeExample.java]

//		try {
//			System.out.printf("keCode = %d\n", System.in.read()); // read가 하나면 여러개를 입력해도 하나밖에 입력이 안되
//			System.out.printf("keCode = %d\n", System.in.read()); // 13
//			System.out.printf("keCode = %d\n", System.in.read()); // 10 이 찍히는 건 엔터치면 자동으로 찍히는 숫자여서 무조건 나온다고 보면 된다.
////			                                        int형 숫자
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
//				if (keyCode == 'q' || keyCode == 'Q') {// 113이면 아웃하는걸로
//					working = false;
//				}
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("정상종료");
//	}
//}

//		[ScannerExample.java]
		Scanner scanner = new Scanner(System.in);
		String value = "";
		while (true) {
			value = scanner.nextLine();
			if (value.equals("대한민국")) {
				System.out.println("금메달~~"); // 오 새로운걸 입력할 수도 있고 재미있넹ㅎㅎ
			}
			System.out.printf("입력하신 문자열은  \"%s\" 입니다.\n", value);
			if (value.equalsIgnoreCase("q")) { // value.equalsIgnoreCase("q") == 대소문자 가리지 않고 q가 입력되면 멈추겠다.
				break;
			}
		}
		System.out.println("종료되었습니다");

		scanner.close(); // 다끝나면 리소스까지 해제해주는 메소드 .close();
	}
}
