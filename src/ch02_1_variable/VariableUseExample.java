package ch02_1_variable;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
//                          3    문자그대로          5    문자그대로 
//                       숫자가 오고 문자가 오는 연산은 숫자3이 3이라는 문자가 되어서 출력이된다 (아항),그래서 매끄럽게 나오네	
//		                 문자열 : "3"+"시간" = "3시간"
		System.out.println(3+3); 
		System.out.println("3"+3);
		                //"3" + "3"이 된다!!.
		int totalMinute = (hour * 60) + minute;
//		                     5 * 60
//		                      180    +    5
		System.out.println("총 " + totalMinute + "분");
	}
}
