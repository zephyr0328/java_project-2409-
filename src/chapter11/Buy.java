package chapter11;

public interface Buy {

	void buy();

	default void order() {
		System.out.println("备概林巩");
	}
	default void order2() {
		System.out.println("备概林巩");
	}

}
