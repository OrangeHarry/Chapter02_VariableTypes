package ch02_3_type_casting;

public class PromotionExample {
	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		byte byteValue = 10;
		int intValue = byteValue; //�ڵ�����ȯ
		System.out.println("intValue = " + intValue);

		char charValue = '��'; //�����Ϳ��� ���� 44032�� ������ �ȴ�
		intValue = charValue;
		System.out.println("���� �����ڵ� = " + intValue);

		intValue = 50;
		long longValue = intValue; // ����� ���ڰ� �ƴ� ����� ������� ���̱� ������ L�� ������ �����߻�
		System.out.println("longValue = " + intValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue = " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);

//		float fv = 400.0F;
//		int iv = fv;              //������ ���� ���� == int�� ��� ������ float���� �����ϱ� ���ս��� �߻��ϰ� �ȴ�!!(�翬�� ���)
//		System.out.println(iv);
	}
}
//ūŸ�� = ����Ÿ��(�̷��� �ڵ�����ȯ)