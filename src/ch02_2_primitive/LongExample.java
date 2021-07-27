package ch02_2_primitive;

public class LongExample {
	public static void main(String[] args) {
		/*
		 * 기본적으로 자바 컴파일러는 정수 리터널을 int형으로 간주한다. 
		 * long타입임을 명시적으로 컴파일러에게 알려줘야 한다.
		 */
		
		

		long var1 = 10;
		long var2 = 20L;
//		long var3 = 100000000000000; int범위가 넘어가는 큰 숫자에는 대문자'L'을 초기화 값 뒤에 붙이자!!
		long var4 = 100000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
