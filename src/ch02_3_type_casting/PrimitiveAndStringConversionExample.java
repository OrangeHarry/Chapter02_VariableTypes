package ch02_3_type_casting;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 +1 = " + value1 + 1);
		System.out.println("value2 +1 = " + value2 + 1);
		System.out.println("value3 +1 = " + value3 + 1);
		System.out.println(value1 + 2);

		// 기본타입의 값을 문자열로 바꾸는거
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println(str1 + 2);
	}
}
