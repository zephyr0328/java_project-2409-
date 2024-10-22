package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		
		int number=5;
		int factorial=1;
		while(number>0) {
			factorial*=number;
			number--;
		}
		System.out.println("팩토리얼 결과: "+factorial);
	}

}
