package chapter13.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeManagerEx09 {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();

		// ������ Id��Ű��, ���� ��ü�� ������ Ʈ���ʿ� �߰�
		employeeMap.put(103, new Employee("Bob", 25));

		Employee member1 = new Employee("Alice", 30);
		employeeMap.put(102, member1);

		employeeMap.put(104, new Employee("Charlie", 35));
		employeeMap.put(103, new Employee("David", 28));
		
		System.out.println("== �������� ��� ==");
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID "+entry.getKey() + " | Name " + entry.getValue());
		}
		
		//Ư�� ���� ���� ��ȸ
		int employeeId = 103;
		System.out.println("\nID"+ employeeId + "�� ���� ���� : "+ employeeMap.get(employeeId));
		

	}

}
