package ch02_1_variable;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "�ð�" + minute + "��");
//                          3    ���ڱ״��          5    ���ڱ״�� 
//                       ���ڰ� ���� ���ڰ� ���� ������ ����3�� 3�̶�� ���ڰ� �Ǿ ����̵ȴ� (����),�׷��� �Ų����� ������	
//		                 ���ڿ� : "3"+"�ð�" = "3�ð�"
		System.out.println(3+3); 
		System.out.println("3"+3);
		                //"3" + "3"�� �ȴ�!!.
		int totalMinute = (hour * 60) + minute;
//		                     5 * 60
//		                      180    +    5
		System.out.println("�� " + totalMinute + "��");
	}
}
