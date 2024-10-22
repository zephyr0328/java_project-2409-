package chapter12.AnonyInner;

class Outter{
	public Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {

			@Override
			public void run() {
				// num=200; 재선언 불가능
				// i=10; 재선언 불가능
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
		runnable.run();//방법1
		
		out.getRunnable(50).run();//방법2

	}

}
