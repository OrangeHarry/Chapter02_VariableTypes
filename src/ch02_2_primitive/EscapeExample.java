package ch02_2_primitive;

public class EscapeExample {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello\n\n\n"); //오 3번 띄우넹
		System.out.println("Hello");
		System.out.print("Hello"); //print와 println의 차이!!(print는 줄바꿈 없이 옆으로 쭉 가기만 한다.)
		System.out.println("Hello");
		

		
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다."); //문자열 안에 큰따옴표를 출력하고 싶을때!!!! 몰랐다 이건
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
