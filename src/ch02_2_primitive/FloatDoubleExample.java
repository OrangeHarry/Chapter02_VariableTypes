package ch02_2_primitive;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// �Ǽ��� ����
//		float var1 = 3.14; //�����Ͽ���(�ڿ� F�� �Ⱥٿ��� �����Ϸ��� double�� �о��⋚��)
		float var2 = 3.14F;
		double var3 = 3.14;

		// ���е� �׽�Ʈ
		float var4 = 0.1234567890123456789F;  //�Ҽ������� 7�ڸ�(6��������)
		double var5 = 0.1234567890123456789;  //�Ҽ������� 15�ڸ�(4��������), ���е��� �� ����

		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);

		// e����ϱ�
		double var6 = 3e6;
		float var7 = 3e6F;  //10�� 6��
		double var8 = 2e-3; //10�� -2��
		System.out.println("var6 = " + var6);
		System.out.println("var7 = " + var7);
		System.out.println("var8 = " + var8);

	}
}
