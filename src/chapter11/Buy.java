package chapter11;

public interface Buy {

	void buy();

	default void order() {
		System.out.println("�����ֹ�");
	}
	default void order2() {
		System.out.println("�����ֹ�");
	}

}
