package chapter12.wrapperclass;

public class ValueCompareMain {

	public static void main(String[] args) {
		System.out.println("[-128 ~ 128 �ʰ����� ���]"); // 1byte = 8bit
		Integer obj1 = 300; // 4byte => 32bit
		Integer obj2 = 300;

		// �ּҺ�
		System.out.println("==��� : " + (obj1 == obj2)); // �ܺ�
		System.out.println("==��ڽ��� �� ��� : " + (obj1.intValue() == obj2.intValue())); // ����
		System.out.println(("==equals ") + obj1.equals(obj2));

		System.out.println("[-128 ~ 128 �������� ���]"); // 1byte = 8bit
		Integer obj3 = 100; // 4byte => 32bit
		Integer obj4 = 100;

		// �ּҺ�
		System.out.println("==��� : " + (obj3 == obj4)); // �ܺ�
		System.out.println("==��ڽ��� �� ��� : " + (obj3.intValue() == obj4.intValue())); // ����
		System.out.println("==equals : " + (obj3.equals(obj4)));

	}

}
