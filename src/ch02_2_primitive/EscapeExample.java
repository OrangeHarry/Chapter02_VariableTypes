package ch02_2_primitive;

public class EscapeExample {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello\n\n\n"); //�� 3�� ����
		System.out.println("Hello");
		System.out.print("Hello"); //print�� println�� ����!!(print�� �ٹٲ� ���� ������ �� ���⸸ �Ѵ�.)
		System.out.println("Hello");
		

		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("�� ���� ���\n");
		System.out.println("�� ���� ���\n");
		System.out.println("�츮�� \"������\" �Դϴ�."); //���ڿ� �ȿ� ū����ǥ�� ����ϰ� ������!!!! ������ �̰�
		System.out.println("��\\����\\����\\�ܿ�");
	}
}
