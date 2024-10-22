package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamMainEx03 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

		List<String> filterNames = names.stream()
				.filter(name -> name.length() > 3) // ���̰� 3���� ū ���ڿ� ���͸�
				.map(String::toUpperCase) // �빮�ڷ� ��ȯ
				.collect(Collectors.toList()); // ����Ʈ�� �ٽ� ����
		System.out.println(filterNames);
	}

}
