package ch02_3_type_casting;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
//		               int  int
		System.out.println(result1);

		// [정수 연산에서의 자동 타입 변환]
		// "값 손실"이 없게끔 하는 자동형변환

		byte x = 80, y = 90;
		int result2 = x + y;
//		byte result = x + y; 컴파일 에러
//		             int  int // 컴퓨터가 알아서 같은 비트를 만들어 놓고 연산을 한다. 컴퓨터는 비트구조로 계산을 하는거니깐(똑똑하네 컴퓨터) byte->int로 바꾸는거는 "값 손실"이 안일어나잖니
		byte result = (byte) (x + y); //강제로 하긴 했으나 값이 잘려서 나오지 않을까 싶다.
		System.out.println(result2);
		System.out.println(result);//와우...
	}
}
