package ch02_1_variable;

public class VariableScopeExample {
//	static int v1 = 15; 이거는 이 위치에서도 작동이 된다. static 은 객체 인스턴스 없이 사용가능하다. new를 안써도 된다. static이 메모리에 이미 세팅을 해주었기 때문에 다른블록애들이 접근할 수 있다.좋네.
	public static void main(String[] args) {
		int v1 = 15;
		System.out.println(v1);
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10; // 범위 안에서 생성된 변수는 범위를 벗어나면 효과가 사라진다!!!!!
			System.out.println(v2);
		}
		for (int i = 0; i < 10; i++) {
			int v3 = 500;
			System.out.println(i);
			System.out.println(v3); // i값이 아닌 얘도 같이 반복이되네...for문안에서는 다 같이 반복이되나봐
		}
		System.out.println(v1);
//		System.out.println(v2); 여기서는 v2를 못찍지~~
//		int v3 = v1 + v2 + 5; // v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
		int v3 = v1 + 5;
		System.out.println(v3);
	}
}
//Scope == 범위