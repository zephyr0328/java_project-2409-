package chapter13.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableInventoryEx06Main {

	/*
	 * Hashtable�� ����ȭ�� �ؽ� ���̺��� ������� �����ϸ�, ��Ƽ������ ȯ�濡�� �����ϰ� ����� �� �ִ�. Ű�� �� ��� �ߺ��� �������
	 * ������, Ű�� ������ ������� �ʴ´�.
	 */

	public static void main(String[] args) {
		// Hashtable ��ü ����
		Hashtable<String, Integer> inventory = new Hashtable<String, Integer>();

		// ��ǰ��� ��� ������ Ű�� ������ Hashtable�� �߰�
		inventory.put("Apple", 50);
		inventory.put("Banana", 30);
		inventory.put("Orange", 20);
		inventory.put("Mango", 10);

		// ��ǰ ��� ���
		System.out.println("==��ǰ ��� ���==");
		for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + "��");
		}

		// Ư�� ��ǰ�� ��� Ȯ��
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n��� Ȯ���� ��ǰ���� �Է��ϼ���: ");
		String product = scanner.nextLine(); // key

		if (inventory.containsKey(product)) {
			System.out.println(product + "�� ���� " + inventory.get(product) + "���Դϴ�.");
		} else {
			System.out.println("�ش� ��ǰ�� ��� �����ϴ�.");
		}
		
		// ��ǰ�� ��� ������Ʈ
        System.out.print("\n��� ������Ʈ�� ��ǰ���� �Է��ϼ���: ");
        String updateProduct = scanner.nextLine();
        
        if(inventory.containsKey(updateProduct)) {
        	System.out.print("�߰��� ������ �Է��ϼ���: ");
            int addQuantity = scanner.nextInt();
            inventory.put(updateProduct, inventory.get(product)+addQuantity);
            System.out.println(updateProduct + "�� ���� ����"+ inventory.get(updateProduct));
        }else {
        	System.out.println("�ش� ��ǰ�� ��� �����ϴ�.");
        }
        scanner.close();
	}

}
