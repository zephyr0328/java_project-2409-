package chapter12.AnonyInner;

class Outter1{
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("�͸��� Ŭ����");

		}
	};
}

public class AnonyMousinner2Main {

	public static void main(String[] args) {
		Outter1 out = new Outter1();
		out.runner.run();

	}
}
