package ch02_3_type_casting;

public class 중요함문자열기본타입으로강제변환 {
	public static void main(String[] args) {
//		실무에서 많이 쓰이는 강제타입변환
		
//		"문자열" ------> 숫자
		int value4 = Integer.parseInt("123456") + 1; // 123457
		
//		숫자   ------->  문자열
		String str4 = Integer.toString(value4) + 8; // 12345678
		str4 = String.valueOf(100)+1;  //*나는 이방법이 더 편한거 같다*
//		                     "100"
		System.out.println(str4);

		String str = "100"; // 문자열
		int var = 100; // 숫자

		var = Integer.parseInt(str); // 숫자로 변환
		System.out.println(var + 1);
////////////////////////////////////////////////////////////
		String number = "1234";
		System.out.println(number + 5); // 12345

		int value = Integer.parseInt(number); // 문자열이 숫자로 바뀌는 순간~~~~
		int value2 = Integer.parseInt("123456") + 1;
		System.out.println(value + 5);
		System.out.println(value2);

		System.out.println(Integer.MAX_VALUE); // 오 int의 범위값~
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // 오잉 비트값이네

		System.out.println(Byte.MAX_VALUE);

		int high = Integer.MIN_VALUE;// 그냥 예시.. 성적프로그램중 가장 높은점수를 찾고 싶을때는 이거!! 가장 작은값을 넣어도 일단 들어온 그 수부터 1등으로 세팅이 되면서
										// 업데이트를 하는거지
	}
}
