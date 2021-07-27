package ch02_3_type_casting;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

//		int intValue7 = intValue3 % 4; // 그냥 내가 궁금해서 나머지값 구해본거
//		System.out.println("나머지값은 " + intValue7);

		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		double result2 = 10 / 4; // 표시는 소수점까지 표시가 되지만 기본값이 int형이라서 2.0으로 나온다. 정수부분까지만 계산후 출력
//                      int   int
		double result3 = 10 / (double) 4; // 하나라도 double로 만들어 줘야지 소수점으로가는 나머지값까지 표현이 된다.
		System.out.println(result2);
		System.out.println(result3);
	}
}
