package chapter05;

public class FuncTest07 {
	public static void swap(int x, int y) {

		int temp = x;
				  x = y;
				  y = temp; // ��ü �˰���!!(�ϱ��ؼ� ����)(�׸�ó�� �ܿ����ϱ�)(�Ź߲� ���)
		System.out.println("swap()���: a="+x+", b="+y	);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("swap()ȣ�� ��: a=" + a + ", b=" + b);
		System.out.println("====================");
		
		//call by reference
		//�޼��忡 �ԷµǴ� ������ ���๮�� ���� �ϴ°��� �ƴ϶� �Է°��� �ּҰ��� �����ؼ� ����ϴ� ��!!
		//�������� ������� �ʴ´�!!
		
		swap(a, b);
		System.out.println("swap()ȣ�� ��: a=" + a + ", b=" + b);
		System.out.println("====================");

	}

}
