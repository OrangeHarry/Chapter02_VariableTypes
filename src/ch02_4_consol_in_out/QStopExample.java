package ch02_4_consol_in_out;

import java.io.IOException;

public class QStopExample {
	public static void main(String[] args) throws IOException {
		int keyCode;

//		반복문(for....횟수에 대한 반복)(while....조건에 대한 반복)
		while (true) {
			keyCode = System.in.read();
			if (keyCode == 113) {
				break; // 숫자로 113이 찍히면 반복에서 벗어난다!!(여기선 소문자 q다)
			}
			System.out.println("keyCode = " + keyCode);
		}
		System.out.println("종료");
	}
}
