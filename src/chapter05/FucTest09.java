package chapter05;

class MyObject {
	// 멤버변수
 int value;

	public MyObject(int value) {
		this.value = value;
	}
}


//MyObject class
public class FucTest09 {
	// 멤버변수
	int value;

	// 생성자
	public FucTest09(int value) {
		this.value = value;
	}
//참조형 메서드
	public static void changeValue(MyObject object) {
		object.value = 20;

	}

	public static void changeValue(int value) {
		value = 20; // valuer값은 num이라는 매개변수의 복사본이므로 원본과는 상관이 없음
	}

	public static void main(String[] args) {
		// Myobject obj
		MyObject obj = new MyObject(10);

		System.out.println("Before: " + obj.value);
		changeValue(obj); // call by reference
		System.out.println("After: " + obj.value);

	}

}
