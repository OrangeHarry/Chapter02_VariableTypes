package ch02_3_type_casting;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

//		int intValue7 = intValue3 % 4; // �׳� ���� �ñ��ؼ� �������� ���غ���
//		System.out.println("���������� " + intValue7);

		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		double result2 = 10 / 4; // ǥ�ô� �Ҽ������� ǥ�ð� ������ �⺻���� int���̶� 2.0���� ���´�. �����κб����� ����� ���
//                      int   int
		double result3 = 10 / (double) 4; // �ϳ��� double�� ����� ����� �Ҽ������ΰ��� ������������ ǥ���� �ȴ�.
		System.out.println(result2);
		System.out.println(result3);
	}
}