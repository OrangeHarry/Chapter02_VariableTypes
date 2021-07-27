package ch02_4_consol_in_out;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value); // 이거 c언어에서도 쓰는 형식이야
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value); // 6자릿수의 빈칸 공백을 채워준다 0으로

		System.out.println("======================================");

		System.out.printf("이름:%s\n", "하헌민");
		System.out.printf("이름:%s ", "하헌민"); // ******%s는 문자열, %d는 숫자(10진수라는 뜻 d)
		System.out.printf("이름:%s\n", "하헌민");
		System.out.printf("나이:%d", 29); // 같은거야
		System.out.println("나이:" + 29); // 위에꺼랑
		System.out.printf("신장:%f\n", 175.1); // %f는 실수형식
		System.out.printf("신장:%e\n", 175.1); // 지수형식으로 표현(10의 몇승 그거)
		
		System.out.println("======================================");

		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10, area);// 실수니깐 f가 와야징
//		                                                                                      자릿수 전체는 10(소수점 포함)(0을 넣어서 자릿수 확인가능)  .2는 소수점 2째자리까지 표현해 준다는 의미

		System.out.println("======================================");

		String name = "하헌민";
		String job = "백수";
		System.out.printf("%6d:%-10s:%10s\n", 1, name, job);
	}
}
