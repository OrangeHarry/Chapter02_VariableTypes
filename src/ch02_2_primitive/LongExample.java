package ch02_2_primitive;

public class LongExample {
	public static void main(String[] args) {
		/*
		 * �⺻������ �ڹ� �����Ϸ��� ���� ���ͳ��� int������ �����Ѵ�. 
		 * longŸ������ ��������� �����Ϸ����� �˷���� �Ѵ�.
		 */
		
		

		long var1 = 10;
		long var2 = 20L;
//		long var3 = 100000000000000; int������ �Ѿ�� ū ���ڿ��� �빮��'L'�� �ʱ�ȭ �� �ڿ� ������!!
		long var4 = 100000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
