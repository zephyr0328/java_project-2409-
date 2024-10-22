package chapter11;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("sell 판매주문");
	}

	default void sellorder() {
		System.out.println("판매주문");
	}

}
