package chapter11;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("sell �Ǹ��ֹ�");
	}

	default void sellorder() {
		System.out.println("�Ǹ��ֹ�");
	}

}
