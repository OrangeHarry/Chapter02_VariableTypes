package ch02_1_variable;

public class VariableInitializationExample {
	public static void main(String[] args) {
//       
		int value = 29; // value�� �׳� �ϳ��� �̸��� �� ���� �߿��Ѱ��� int�� �ڷ����� ��Ÿ���°��̴�!!! int=4byte¡

		int myAge;
		myAge = 29; // �̷��Ե� ���� ������ �Ϲ������� ����� �ʱ�ȭ�� �ѹ��� ���ش� ���� value����!!

		int a = 5, b = 0, c = 0;// �̷��Ե� �����ϴ�. �ٵ� �׷��� valueó�� ���� ����. �˰� ����!!
//		int a = 0;
//		int b = 0;
//		int c = 0; 
		final double pi = 3.141592; //final�̶� pi�� ������ �ƴ� ����� ���� ������.

//		����? : ���� �� �ִ� ��
//		���? : �׻� �� ���ΰ�(���)
		a = 10;
		a = 100;
//		pi = 3.14; ��� ����̱� ������ ���� ���� ����!!!!

		b = a; // ���� ������ �� ������ ���� �ٸ����� �̰͵� �����ϴ�!! ���� �����̾����ϱ� ���⼱ ���Ѱ��� ����.

		int result = value + 10; // ������ �̸� ������ ���� �ҹ��ڷ� ����!!!!

		System.out.println(result);

		System.out.println(a == b);
//		                   0 == 0
	}
}
