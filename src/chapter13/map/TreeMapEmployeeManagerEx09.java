package chapter13.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeManagerEx09 {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();

		// 직원의 Id를키로, 직원 객체를 값으로 트리맵에 추가
		employeeMap.put(103, new Employee("Bob", 25));

		Employee member1 = new Employee("Alice", 30);
		employeeMap.put(102, member1);

		employeeMap.put(104, new Employee("Charlie", 35));
		employeeMap.put(103, new Employee("David", 28));
		
		System.out.println("== 직원정보 출력 ==");
		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID "+entry.getKey() + " | Name " + entry.getValue());
		}
		
		//특정 직원 정보 조회
		int employeeId = 103;
		System.out.println("\nID"+ employeeId + "의 직원 정보 : "+ employeeMap.get(employeeId));
		

	}

}
