package chapter12.wrapperclass;

public class IntegerTest {

	public static void main(String[] args) {
		// ����ڽ� �Ϲ��ڷ� => Ŭ������ ����
		Integer num = 100;

		int iNum = num.intValue(); // ��ڽ� : Ŭ����(Integer) => �Ϲ��ڷ�(int)
		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);

		// ��ڽ�
		int total = num + jNum; // num.intValue() + jNum �ڵ�����ȯ(Integer -> int)
		System.out.println(total);

		// ����ڽ�
		Integer i = jNum; // (int -> Integer)
		System.out.println(i);
		
	}
}
