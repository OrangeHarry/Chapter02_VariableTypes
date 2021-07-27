package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);

//		x = y; 이러면 x값이 5
//		y = x; 이러면 x값이 5로 바뀌었기 때문에 y값도 5가 된다.

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		System.out.println("x:" + x + ", y:" + y);
	}
}