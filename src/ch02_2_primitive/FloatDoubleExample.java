package ch02_2_primitive;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수로 저장
//		float var1 = 3.14; //컴파일에러(뒤에 F를 안붙여서 컴파일러가 double로 읽었기떄문)
		float var2 = 3.14F;
		double var3 = 3.14;

		// 정밀도 테스트
		float var4 = 0.1234567890123456789F;  //소수점이하 7자리(6까지이지)
		double var5 = 0.1234567890123456789;  //소수점이하 15자리(4까지이지), 정밀도도 더 좋음

		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);

		// e사용하기
		double var6 = 3e6;
		float var7 = 3e6F;  //10의 6승
		double var8 = 2e-3; //10의 -2승
		System.out.println("var6 = " + var6);
		System.out.println("var7 = " + var7);
		System.out.println("var8 = " + var8);

	}
}
