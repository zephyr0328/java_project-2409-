package chapter05;

public class FucTest08 {
	public static void changeValue(int value) {
		value=20; //valuer���� num�̶�� �Ű������� ���纻�̹Ƿ� �������� ����� ����
		
	}

	public static void main(String[] args) {

		int num = 10;
		System.out.println("Before: " + num);
		changeValue(num); // call by Value(�����Ͽ� ȣ��)
		System.out.println("After: " + num);

	}

}
