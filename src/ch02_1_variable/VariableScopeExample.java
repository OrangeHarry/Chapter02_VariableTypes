package ch02_1_variable;

public class VariableScopeExample {
//	static int v1 = 15; �̰Ŵ� �� ��ġ������ �۵��� �ȴ�. static �� ��ü �ν��Ͻ� ���� ��밡���ϴ�. new�� �Ƚᵵ �ȴ�. static�� �޸𸮿� �̹� ������ ���־��� ������ �ٸ���Ͼֵ��� ������ �� �ִ�.����.
	public static void main(String[] args) {
		int v1 = 15;
		System.out.println(v1);
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10; // ���� �ȿ��� ������ ������ ������ ����� ȿ���� �������!!!!!
			System.out.println(v2);
		}
		for (int i = 0; i < 10; i++) {
			int v3 = 500;
			System.out.println(i);
			System.out.println(v3); // i���� �ƴ� �굵 ���� �ݺ��̵ǳ�...for���ȿ����� �� ���� �ݺ��̵ǳ���
		}
		System.out.println(v1);
//		System.out.println(v2); ���⼭�� v2�� ������~~
//		int v3 = v1 + v2 + 5; // v2������ ����� �� ���� ������ ������ ���� �߻�
		int v3 = v1 + 5;
		System.out.println(v3);
	}
}
//Scope == ����