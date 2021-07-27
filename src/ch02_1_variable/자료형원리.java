package ch02_1_variable;

public class 자료형원리 {
	public static void main(String[] args) {

		// [자료형]
//		int -> char
		int var1 = 65;
		char var2 = 65;

		char var3 = 'C'; // -----> 67 로 저장을 한다 메모리에는 (인코딩) (메모리는 숫자로 저장하고 표현되니깐) (아스키코드표)

		System.out.println(var1); // 65
		System.out.println((char) var1); // A 문자로 형변환해서 읽어줘~
		System.out.println(var2); // A
		System.out.println(var3);// -------> 67---->'C'로 바꾸어서 출력이 됨
		System.out.println(var3 + 2);// 67-----> 'C' 디코딩 ////이러면 문자열을 다시 숫자로 바꾸어서 출력한다.

		int d1 = 3; // 3 정수로 해석해줘
		double d2 = 3; // 3.00000 실수로 해석해줘 // int3이랑 아예 다른 비트로 해석되어서 나온다.

		System.out.println(d1);
		System.out.println(d2);

		VariableExchangeExample variableExchangeExample = new VariableExchangeExample();
		// 클래스도 자료형 중에 하나다.(사용자)우리가 만들어내는 자료형이야 (변수이름은 바뀌어도 되 굳이 클래스 제목 따라갈필요 없음)

		int data;
		data = 79;
		if (data == 85) {

		}
	}
}
///자료형에 따라서 변수의 값을 읽어들이는 방식이 다르다!!!!!!!**
//타입을 선언하면 그 타입으로 해석해줘~라고 컴터에 말해주는것이다. (숫자형,문자형 등) 
//해석 방법!!!!!!!!