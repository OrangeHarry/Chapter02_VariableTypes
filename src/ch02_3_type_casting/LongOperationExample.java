package ch02_3_type_casting;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; // ���� ū���� long���� ����ȯ�� �ȴ�.
		// byte + int + long //�������� ����̴ϱ� byte->int�� �ٲ� ���
		// int + long // int->long���� �ٲ� ���
		System.out.println(result);

//	     result1 = [long] num1  (+ - * /) (long)���� ������ش�. [byte,char,short,int] num2; //�׳� ���� �ڵ�� ���°� �����ϱ� �����

	}
}
