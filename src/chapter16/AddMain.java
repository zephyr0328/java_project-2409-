package chapter16;

public class AddMain {

	public static void main(String[] args) {
		// Lambda : �޼����� �̸��� ���� �����θ� ����

		Add addF = (x, y) -> x + y; // ���๮�� ȣ��
		System.out.println(addF.add(3, 4));

	}

}
