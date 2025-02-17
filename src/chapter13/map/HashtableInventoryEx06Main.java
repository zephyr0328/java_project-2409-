package chapter13.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableInventoryEx06Main {

	/*
	 * Hashtable은 동기화된 해시 테이블을 기반으로 동작하며, 멀티스레드 환경에서 안전하게 사용할 수 있다. 키와 값 모두 중복을 허용하지
	 * 않으며, 키의 순서는 보장되지 않는다.
	 */

	public static void main(String[] args) {
		// Hashtable 객체 생성
		Hashtable<String, Integer> inventory = new Hashtable<String, Integer>();

		// 상품명과 재고 수량을 키와 값으로 Hashtable에 추가
		inventory.put("Apple", 50);
		inventory.put("Banana", 30);
		inventory.put("Orange", 20);
		inventory.put("Mango", 10);

		// 상품 재고 출력
		System.out.println("==상품 재고 목록==");
		for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + "개");
		}

		// 특정 상품의 재고 확인
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n재고를 확인할 상품명을 입력하세요: ");
		String product = scanner.nextLine(); // key

		if (inventory.containsKey(product)) {
			System.out.println(product + "의 재고는 " + inventory.get(product) + "개입니다.");
		} else {
			System.out.println("해당 상품은 재고에 없습니다.");
		}
		
		// 상품의 재고 업데이트
        System.out.print("\n재고를 업데이트할 상품명을 입력하세요: ");
        String updateProduct = scanner.nextLine();
        
        if(inventory.containsKey(updateProduct)) {
        	System.out.print("추가할 수량을 입력하세요: ");
            int addQuantity = scanner.nextInt();
            inventory.put(updateProduct, inventory.get(product)+addQuantity);
            System.out.println(updateProduct + "의 재고는 현재"+ inventory.get(updateProduct));
        }else {
        	System.out.println("해당 상품은 재고에 없습니다.");
        }
        scanner.close();
	}

}
