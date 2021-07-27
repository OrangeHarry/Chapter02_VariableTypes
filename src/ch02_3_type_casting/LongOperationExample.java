package ch02_3_type_casting;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; // 가장 큰값인 long으로 형변환이 된다.
		// byte + int + long //순차적인 계산이니깐 byte->int로 바뀌어서 계산
		// int + long // int->long으로 바뀌어서 계산
		System.out.println(result);

//	     result1 = [long] num1  (+ - * /) (long)으로 만들어준다. [byte,char,short,int] num2; //그냥 위에 코드로 보는게 이해하기 쉬울듯

	}
}
