package chapter05;

class MyObject {
	// �������
 int value;

	public MyObject(int value) {
		this.value = value;
	}
}


//MyObject class
public class FucTest09 {
	// �������
	int value;

	// ������
	public FucTest09(int value) {
		this.value = value;
	}
//������ �޼���
	public static void changeValue(MyObject object) {
		object.value = 20;

	}

	public static void changeValue(int value) {
		value = 20; // valuer���� num�̶�� �Ű������� ���纻�̹Ƿ� �������� ����� ����
	}

	public static void main(String[] args) {
		// Myobject obj
		MyObject obj = new MyObject(10);

		System.out.println("Before: " + obj.value);
		changeValue(obj); // call by reference
		System.out.println("After: " + obj.value);

	}

}
