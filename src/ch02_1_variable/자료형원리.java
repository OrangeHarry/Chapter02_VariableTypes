package ch02_1_variable;

public class �ڷ������� {
	public static void main(String[] args) {

		// [�ڷ���]
//		int -> char
		int var1 = 65;
		char var2 = 65;

		char var3 = 'C'; // -----> 67 �� ������ �Ѵ� �޸𸮿��� (���ڵ�) (�޸𸮴� ���ڷ� �����ϰ� ǥ���Ǵϱ�) (�ƽ�Ű�ڵ�ǥ)

		System.out.println(var1); // 65
		System.out.println((char) var1); // A ���ڷ� ����ȯ�ؼ� �о���~
		System.out.println(var2); // A
		System.out.println(var3);// -------> 67---->'C'�� �ٲپ ����� ��
		System.out.println(var3 + 2);// 67-----> 'C' ���ڵ� ////�̷��� ���ڿ��� �ٽ� ���ڷ� �ٲپ ����Ѵ�.

		int d1 = 3; // 3 ������ �ؼ�����
		double d2 = 3; // 3.00000 �Ǽ��� �ؼ����� // int3�̶� �ƿ� �ٸ� ��Ʈ�� �ؼ��Ǿ ���´�.

		System.out.println(d1);
		System.out.println(d2);

		VariableExchangeExample variableExchangeExample = new VariableExchangeExample();
		// Ŭ������ �ڷ��� �߿� �ϳ���.(�����)�츮�� ������ �ڷ����̾� (�����̸��� �ٲ� �� ���� Ŭ���� ���� �����ʿ� ����)

		int data;
		data = 79;
		if (data == 85) {

		}
	}
}
///�ڷ����� ���� ������ ���� �о���̴� ����� �ٸ���!!!!!!!**
//Ÿ���� �����ϸ� �� Ÿ������ �ؼ�����~��� ���Ϳ� �����ִ°��̴�. (������,������ ��) 
//�ؼ� ���!!!!!!!!