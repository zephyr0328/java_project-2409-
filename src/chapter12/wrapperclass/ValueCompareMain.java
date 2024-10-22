package chapter12.wrapperclass;

public class ValueCompareMain {

	public static void main(String[] args) {
		System.out.println("[-128 ~ 128 초과값일 경우]"); // 1byte = 8bit
		Integer obj1 = 300; // 4byte => 32bit
		Integer obj2 = 300;

		// 주소비교
		System.out.println("==결과 : " + (obj1 == obj2)); // 외부
		System.out.println("==언박싱한 후 결과 : " + (obj1.intValue() == obj2.intValue())); // 내부
		System.out.println(("==equals ") + obj1.equals(obj2));

		System.out.println("[-128 ~ 128 범위값일 경우]"); // 1byte = 8bit
		Integer obj3 = 100; // 4byte => 32bit
		Integer obj4 = 100;

		// 주소비교
		System.out.println("==결과 : " + (obj3 == obj4)); // 외부
		System.out.println("==언박싱한 후 결과 : " + (obj3.intValue() == obj4.intValue())); // 내부
		System.out.println("==equals : " + (obj3.equals(obj4)));

	}

}
