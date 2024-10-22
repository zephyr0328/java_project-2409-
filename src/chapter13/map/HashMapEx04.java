package chapter13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx04 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// id : key | value : ��й�ȣ
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���!");
			System.out.print("���̵� : ");
			String id = scanner.nextLine();
			if (map.containsKey(id)) {
				System.out.print("��й�ȣ : ");
				String password = scanner.nextLine();
				if (map.get(id).equals(password)) {
					break;
				}
			}
			System.out.println("���̵�� ��й�ȣ�� �ٽ� �Է��ϼ���");
		}
		System.out.println("�α��ο� �����߽��ϴ�.");
		scanner.close();
	}

}
