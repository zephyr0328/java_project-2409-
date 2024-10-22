package chapter12.wrapperclass;

public class IntegerTest {

	public static void main(String[] args) {
		// 오토박싱 일반자료 => 클래스로 선언
		Integer num = 100;

		int iNum = num.intValue(); // 언박싱 : 클래스(Integer) => 일반자료(int)
		int jNum = 200;

		int sum = iNum + jNum;
		System.out.println(sum);

		// 언박싱
		int total = num + jNum; // num.intValue() + jNum 자동형변환(Integer -> int)
		System.out.println(total);

		// 오토박싱
		Integer i = jNum; // (int -> Integer)
		System.out.println(i);
		
	}
}
