package chapter13;

public class GeneralNoGeneric {
	// ��� ����
	// ������

	// �޼���
	// ���� �迭 ��� �޼���
	public void printArr(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

	// �Ǽ� �迭 ��� �޼���
	public void printDoubleArr(Double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	// ���� �迭 ��� �޼���
	public void printCharArr(Character[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

}
