package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);

//		x = y; �̷��� x���� 5
//		y = x; �̷��� x���� 5�� �ٲ���� ������ y���� 5�� �ȴ�.

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		System.out.println("x:" + x + ", y:" + y);
	}
}