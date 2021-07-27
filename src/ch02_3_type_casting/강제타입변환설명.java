package ch02_3_type_casting;

public class 강제타입변환설명 {
	public static void main(String[] args) {
//		강제(명시적)형변환  
//		:~해석하는 방법을 변환...
//		()치고 강제적으로 하는거징
		System.out.println((char) 65);

//		확장(Promotion) : int -----> double (손실 X, 자동)
//		축소(Demotion) : double ----> int (손실 O, 강제) // 0.5 --> 0 이 되는 상황이 발생
		int iv = 127;
		iv = 1000000;
//		byte bv = iv; 에러발생
		byte bv = (byte) iv; //값이 1000000이 나올 수가 없다. 당연하지 용량범위가 작으니깐 그 허용범위 만큼으로만 값이 나온다.(값 손실)
		System.out.println(bv);//64가 나오징 (계산기로도 확인가능)
// 작은타입 = 큰타입 
		
//		(char)<-----int...long...
		double dv = 3.14;
		iv =(int) dv; //더블이 형님이잖아
		System.out.println(iv);
		
//	String number  = "931126-1111111";  이러한 문자열을
//  int number = (int)9311261111111; 숫자로 변환해서 로직을 돌려야 할일이 있을때 이런 강제 형변환이 필요하다. 예시라고 생각하자(실제로 작동안되는 코드)
		
//		변환의 대원칙!!!!
//		"값 손실"이 없게끔!!!!
	}
}
