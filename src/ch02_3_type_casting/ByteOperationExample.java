package ch02_3_type_casting;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
//		               int  int
		System.out.println(result1);

		// [���� ���꿡���� �ڵ� Ÿ�� ��ȯ]
		// "�� �ս�"�� ���Բ� �ϴ� �ڵ�����ȯ

		byte x = 80, y = 90;
		int result2 = x + y;
//		byte result = x + y; ������ ����
//		             int  int // ��ǻ�Ͱ� �˾Ƽ� ���� ��Ʈ�� ����� ���� ������ �Ѵ�. ��ǻ�ʹ� ��Ʈ������ ����� �ϴ°Ŵϱ�(�ȶ��ϳ� ��ǻ��) byte->int�� �ٲٴ°Ŵ� "�� �ս�"�� ���Ͼ�ݴ�
		byte result = (byte) (x + y); //������ �ϱ� ������ ���� �߷��� ������ ������ �ʹ�.
		System.out.println(result2);
		System.out.println(result);//�Ϳ�...
	}
}
