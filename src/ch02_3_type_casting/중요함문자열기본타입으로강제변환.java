package ch02_3_type_casting;

public class �߿��Թ��ڿ��⺻Ÿ�����ΰ�����ȯ {
	public static void main(String[] args) {
//		�ǹ����� ���� ���̴� ����Ÿ�Ժ�ȯ
		
//		"���ڿ�" ------> ����
		int value4 = Integer.parseInt("123456") + 1; // 123457
		
//		����   ------->  ���ڿ�
		String str4 = Integer.toString(value4) + 8; // 12345678
		str4 = String.valueOf(100)+1;  //*���� �̹���� �� ���Ѱ� ����*
//		                     "100"
		System.out.println(str4);

		String str = "100"; // ���ڿ�
		int var = 100; // ����

		var = Integer.parseInt(str); // ���ڷ� ��ȯ
		System.out.println(var + 1);
////////////////////////////////////////////////////////////
		String number = "1234";
		System.out.println(number + 5); // 12345

		int value = Integer.parseInt(number); // ���ڿ��� ���ڷ� �ٲ�� ����~~~~
		int value2 = Integer.parseInt("123456") + 1;
		System.out.println(value + 5);
		System.out.println(value2);

		System.out.println(Integer.MAX_VALUE); // �� int�� ������~
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // ���� ��Ʈ���̳�

		System.out.println(Byte.MAX_VALUE);

		int high = Integer.MIN_VALUE;// �׳� ����.. �������α׷��� ���� ���������� ã�� �������� �̰�!! ���� �������� �־ �ϴ� ���� �� ������ 1������ ������ �Ǹ鼭
										// ������Ʈ�� �ϴ°���
	}
}
