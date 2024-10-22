package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamEx02 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// ���ٽ� + ��Ʈ��
		System.out.println("\n==���ٽ�+��Ʈ��==");
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println("==��Ʈ���� �̿��� �հ�==");
		System.out.println(Arrays.stream(arr).sum());
		System.out.println();
		System.out.println("==�÷����� ��Ʈ�� Ȱ��==");
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int total = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(total);
	}

}
