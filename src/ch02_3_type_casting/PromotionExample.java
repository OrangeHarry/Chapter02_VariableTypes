package ch02_3_type_casting;

public class PromotionExample {
	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue; //자동형변환
		System.out.println("intValue = " + intValue);

		char charValue = '가'; //데이터에는 숫자 44032로 저장이 된다
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);

		intValue = 50;
		long longValue = intValue; // 대놓고 숫자가 아닌 선언된 변수라는 값이기 때문에 L을 넣으면 에러발생
		System.out.println("longValue = " + intValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue = " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);

//		float fv = 400.0F;
//		int iv = fv;              //에러가 나는 이유 == int의 허용 범위가 float보다 작으니깐 값손실이 발생하게 된다!!(당연한 얘기)
//		System.out.println(iv);
	}
}
//큰타입 = 작은타입(이럴때 자동형변환)