package ch02_3_type_casting;

public class 확인문제테스트 {
	public static void main(String[] args) {
		char c1 = 'a';
		int i1 = c1 + 1;
		System.out.println((char) i1);
//
//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result = (int) (var1 + var2);
//		System.out.println(result);

		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		double var5 = Double.parseDouble(var4);
		int result = (int) (var1 + var2) + (int) (var3 + var5);
		System.out.println(result);
		
		String str = 2+""+3;
		System.out.println(str);

	}
}
