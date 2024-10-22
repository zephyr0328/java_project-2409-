package chapter05;

public class FucTest08 {
	public static void changeValue(int value) {
		value=20; //valuer값은 num이라는 매개변수의 복사본이므로 원본과는 상관이 없음
		
	}

	public static void main(String[] args) {

		int num = 10;
		System.out.println("Before: " + num);
		changeValue(num); // call by Value(복제하여 호출)
		System.out.println("After: " + num);

	}

}
