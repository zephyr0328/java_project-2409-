package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		// �л�����, ����
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		// �ߺ�x
		map.put(new Student(1, "�̼���"), 95);
		map.put(new Student(1, "�̼���"), 92);
		map.put(new Student(2, "�����"), 85);
		map.put(new Student(3, "������"), 98);

		System.out.println("�л� �� : " + map.size());

		// ��ȯ������ ó��
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		System.out.println();

		Scanner scanner = new Scanner(System.in);
		Student std;
		int input;
		String name;

		while (true) {
			System.out.print("�л� ��ȣ�� �Է��ϼ��� : ");
			input = scanner.nextInt();
			System.out.print("�л� �̸��� �Է��ϼ��� :");
			name = scanner.next();
			std = new Student(input, name);

			if (map.containsKey(std)) {
				System.out.println(name + "�л��� ���� : " + map.get(std));
				break;
			} else {
				System.out.println("�ش� �л��� �����Ͱ� �������� �ʽ��ϴ�.");
			}
		}
		scanner.close();
	}

}
