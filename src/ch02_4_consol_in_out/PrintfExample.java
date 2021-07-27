package ch02_4_consol_in_out;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ���� : %d��\n", value); // �̰� c������ ���� �����̾�
		System.out.printf("��ǰ�� ���� : %6d��\n", value);
		System.out.printf("��ǰ�� ���� : %-6d��\n", value);
		System.out.printf("��ǰ�� ���� : %06d��\n", value); // 6�ڸ����� ��ĭ ������ ä���ش� 0����

		System.out.println("======================================");

		System.out.printf("�̸�:%s\n", "�����");
		System.out.printf("�̸�:%s ", "�����"); // ******%s�� ���ڿ�, %d�� ����(10������� �� d)
		System.out.printf("�̸�:%s\n", "�����");
		System.out.printf("����:%d", 29); // �����ž�
		System.out.println("����:" + 29); // ��������
		System.out.printf("����:%f\n", 175.1); // %f�� �Ǽ�����
		System.out.printf("����:%e\n", 175.1); // ������������ ǥ��(10�� ��� �װ�)
		
		System.out.println("======================================");

		double area = 3.141592 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %010.2f\n", 10, area);// �Ǽ��ϱ� f�� �;�¡
//		                                                                                      �ڸ��� ��ü�� 10(�Ҽ��� ����)(0�� �־ �ڸ��� Ȯ�ΰ���)  .2�� �Ҽ��� 2°�ڸ����� ǥ���� �شٴ� �ǹ�

		System.out.println("======================================");

		String name = "�����";
		String job = "���";
		System.out.printf("%6d:%-10s:%10s\n", 1, name, job);
	}
}
