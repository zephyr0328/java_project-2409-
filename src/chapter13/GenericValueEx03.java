package chapter13;

public class GenericValueEx03<T> {
	//�������(�ʵ�)
	T value;
	//������
	
	//�޼���
	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	

}
