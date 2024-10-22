package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\n================");

		for (int arr2 : array2) {
			System.out.print(arr2 + " ");
		}
		System.out.println("\n================");
		
		array1[3]=4;
		// 복사할 배열, 복사할 첫 위치, 대상배열, 붙여넣을 첫 위치, 복사할 요소 갯수
		System.arraycopy(array1, 0, array2, 1, 4);

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\n================");

		for (int arr2 : array2) {
			System.out.print(arr2 + " "); //원본은 덮어쓰기 되어 없어짐
		}
		System.out.println("\n================");
		
	}

}
