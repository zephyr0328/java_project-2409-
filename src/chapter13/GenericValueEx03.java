package chapter13;

public class GenericValueEx03<T> {
	//멤버변수(필드)
	T value;
	//생성자
	
	//메서드
	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	

}
