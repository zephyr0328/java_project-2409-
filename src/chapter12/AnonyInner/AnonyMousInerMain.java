package chapter12.AnonyInner;

class Outter{
	public Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {

			@Override
			public void run() {
				// num=200; �缱�� �Ұ���
				// i=10; �缱�� �Ұ���
				System.out.println(i);
				System.out.println(num);

			}
		};
	}
}

public class AnonyMousInerMain {

	public static void main(String[] args) {
		Outter out = new Outter();

		Runnable runnable = out.getRunnable(10);
		runnable.run();//���1
		
		out.getRunnable(50).run();//���2

	}

}
