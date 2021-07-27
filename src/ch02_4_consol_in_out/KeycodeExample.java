package ch02_4_consol_in_out;

import java.io.IOException;

public class KeycodeExample {
	public static void main(String[] args) throws IOException {

//     [키보드로부터 입력된 내용을 변수에 저장하고 출력하기]
//		System.in.read();

		int keyCode;// 아스키코드표에서 문자를 숫자로 할당받겠다는 의미

		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode = " + keyCode);
	}
}
