package ch02_4_consol_in_out;

public class 확인문제1 {
	public static void main(String[] args) {
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: " + name); // "감자바" 변수는 큰따옴표를 써서 출력할수는 없는걸까??
		System.out.print("나이: "+age+"\n");
		System.out.printf("전화: %s-%s-%s" , tel1, tel2, tel3 );//
	}
}
