package ch02_1_variable;

public class VariableInitializationExample {
	public static void main(String[] args) {
//       
		int value = 29; // value는 그냥 하나의 이름일 뿐 정말 중요한것은 int인 자료형을 나타내는값이다!!! int=4byte징

		int myAge;
		myAge = 29; // 이렇게도 쓰긴 하지만 일반적으로 선언과 초기화를 한번에 해준다 위에 value마냥!!

		int a = 5, b = 0, c = 0;// 이렇게도 가능하다. 근데 그래도 value처럼 많이 쓴다. 알고만 있자!!
//		int a = 0;
//		int b = 0;
//		int c = 0; 
		final double pi = 3.141592; //final이라서 pi는 변수가 아닌 상수의 값을 가진다.

//		변수? : 변할 수 있는 수
//		상수? : 항상 그 수인것(상수)
		a = 10;
		a = 100;
//		pi = 3.14; 얘는 상수이기 때문에 변할 수가 없어!!!!

		b = a; // 위에 선언한 두 변수의 값은 다르지만 이것도 가능하다!! 변수 설정이었으니깐 여기선 변한거지 값이.

		int result = value + 10; // 변수의 이름 시작은 보통 소문자로 하자!!!!

		System.out.println(result);

		System.out.println(a == b);
//		                   0 == 0
	}
}
